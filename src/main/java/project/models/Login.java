package project.models;

import java.sql.*;

public class Login {
    Connection conn;

    public void connect() throws ClassNotFoundException, SQLException {

        Class c = Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantbase", "root", "1111");
    }

    public String login(String e_id, String pw) throws Exception {
        PreparedStatement ps = conn.prepareStatement("select *from user_details where e_id=? and pw=?");
        ps.setString(1, e_id);
        ps.setString(2, pw);
        ResultSet rs = ps.executeQuery();
        if (rs.next())
            return "user";
        else {
            ps = conn.prepareStatement("select *from admin_details where e_id=? and pw=?");
            ps.setString(1, e_id);
            ps.setString(2, pw);
            rs = ps.executeQuery();
            if (rs.next())
                return "admin";
            else
                return "nop";

        }

    }

    public boolean insert(int id, String fn, String ln, String cty, String st,
                          String m_no, String e_id, String pw) throws SQLException {
        Statement stmnt = conn.createStatement();
        int rowcount = stmnt.executeUpdate("insert into user_details values ('" + id + "','" + fn + "', '" + ln
                + "' ,'" + cty + "', '" + st + "' ,'" + m_no + "', '" + e_id + "', '" + pw + "'   )");
        return true;
    }

}
