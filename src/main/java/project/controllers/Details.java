package project.controllers;

import project.models.AddDelights;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

@WebServlet("/project.controllers.Details")
public class Details extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Details() {
        super();
    }

    static Connection conn;

    public static void connect() {
        try {
            Class c = Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantbase", "root", "1111");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session != null) {
            ArrayList<String> pizzaId = new ArrayList<String>();
            ArrayList<String> pizzaName = new ArrayList<String>();
            String orderId;
            String buffer;
            ArrayList<String> pizzaPrice = new ArrayList<String>();
            int length;
            AddDelights ob = new AddDelights();
            orderId = ob.generateRandomString();
            session.setAttribute("orderId", orderId);
            pizzaId = (ArrayList<String>) session.getAttribute("order");
            length = pizzaId.size();
            connect();
            for(int i = 0; i < length; i++) {
                PreparedStatement ps;
                try {
                    ps = conn.prepareStatement("select * from table where pizzaid = ?");
                    ps.setString(1, pizzaId.get(i));
                    ResultSet rs = ps.executeQuery();
                    while(rs.next())
                    {
                        buffer = rs.getString("pr");
                        pizzaPrice.add(buffer);
                        buffer = rs.getString("nm");
                        pizzaPrice.add(buffer);
                    }
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
            session.setAttribute("PizzaPrice", pizzaPrice);
            session.setAttribute("PizzaName", pizzaName);
        }
        response.setContentType("text/html");
        PrintWriter wr = response.getWriter();
        wr.println("<html><head></head><body>");
        wr.println("<jsp:forward page=\"orderList.jsp\" />");
        wr.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
