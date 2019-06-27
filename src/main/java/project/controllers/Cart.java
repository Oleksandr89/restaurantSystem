package project.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/project.controllers.Cart")
public class Cart extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Cart() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int i = 0;
        String size;
        String j;
        ArrayList<String> pid = new ArrayList<String>();
        ArrayList<String> qty = new ArrayList<String>();
        HttpSession session1 = request.getSession(false);
        response.setContentType("text/html");
        PrintWriter wr = response.getWriter();
        i = Integer.parseInt(request.getParameter("f_id"));
        j = request.getParameter("qty");
        size = request.getParameter("typ");
        if (session1 != null) {
            switch (i) {
                case 1:
                    pid = (ArrayList<String>) session1.getAttribute("order");
                    qty = (ArrayList<String>) session1.getAttribute("quantity");
                    if (size.equals("M")) {
                        pid.add("453356");
                        qty.add(request.getParameter("qty"));
                        session1.setAttribute("order", pid);
                        session1.setAttribute("quantity", qty);
                    } else {
                        pid.add("456651");
                        qty.add(request.getParameter("qty"));
                        session1.setAttribute("order", pid);
                        session1.setAttribute("quantity", qty);
                    }
                    wr.println("<html><body>");
                    wr.println("<form action=\"nv_1.jsp\">Your order has been added <input type=submit value=back></form");
                    wr.println("</body></html>");
                    break;
                case 2:
                    pid = (ArrayList<String>) session1.getAttribute("order");
                    qty = (ArrayList<String>) session1.getAttribute("quantity");
                    if (size.equals("M")) {
                        pid.add("511522");
                        qty.add(request.getParameter("qty"));
                        session1.setAttribute("order", pid);
                        session1.setAttribute("quantity", qty);
                    } else {
                        pid.add("235446");
                        qty.add(request.getParameter("qty"));
                        session1.setAttribute("order", pid);
                        session1.setAttribute("quantity", qty);
                    }
                    wr.println("<html><body>");
                    wr.println("<form action=\"nv_2.jsp\">Your order has been added <input type=submit value=back></form");
                    wr.println("</body></html>");
                    break;
                case 3:
                    pid = (ArrayList<String>) session1.getAttribute("order");
                    qty = (ArrayList<String>) session1.getAttribute("quantity");
                    if (size.equals("M")) {
                        pid.add("514656");
                        qty.add(request.getParameter("qty"));
                        session1.setAttribute("order", pid);
                        session1.setAttribute("quantity", qty);
                    } else {
                        pid.add("341224");
                        qty.add(request.getParameter("qty"));
                        session1.setAttribute("order", pid);
                        session1.setAttribute("quantity", qty);
                    }
                    wr.println("<html><body>");
                    wr.println("<form action=\"nv_3.jsp\">Your order has been added <input type=submit value=back></form");
                    wr.println("</body></html>");
                    break;
                case 4:
                    pid = (ArrayList<String>) session1.getAttribute("order");
                    qty = (ArrayList<String>) session1.getAttribute("quantity");
                    if (size.equals("M")) {
                        pid.add("331535");
                        qty.add(request.getParameter("qty"));
                        session1.setAttribute("order", pid);
                        session1.setAttribute("quantity", qty);
                    } else {
                        pid.add("536642");
                        qty.add(request.getParameter("qty"));
                        session1.setAttribute("order", pid);
                        session1.setAttribute("quantity", qty);
                    }
                    wr.println("<html><body>");
                    wr.println("<form action=\"nv_4.jsp\">Your order has been added <input type=submit value=back></form");
                    wr.println("</body></html>");
                    break;
                case 5:
                    pid = (ArrayList<String>) session1.getAttribute("order");
                    qty = (ArrayList<String>) session1.getAttribute("quantity");
                    if (size.equals("M")) {
                        pid.add("421245");
                        qty.add(request.getParameter("qty"));
                        session1.setAttribute("order", pid);
                        session1.setAttribute("quantity", qty);
                    } else {
                        pid.add("246351");
                        qty.add(request.getParameter("qty"));
                        session1.setAttribute("order", pid);
                        session1.setAttribute("quantity", qty);
                    }
                    wr.println("<html><body>");
                    wr.println("<form action=\"nv_5.jsp\">Your order has been added <input type=submit value=back></form");
                    wr.println("</body></html>");
                    break;
                default:
                    break;
            }
        }
    }
}
