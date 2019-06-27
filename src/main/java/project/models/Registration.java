package project.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Registration {
    Connection conn;
    public Registration() { }
    public void connect() throws Exception{
        Class c = Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/new_schema", "root", "1111");

    }
    public boolean insert(String fn,String ln,String cty,String st,String m_no,String e_id,String pw) throws SQLException {
        Statement stmnt = conn.createStatement();
        int rowcount = stmnt
                .executeUpdate("insert into test3 values ('" + fn
                        + "', '" + ln+ "' ,'" + cty
                        + "', '" + st+ "' ,'" + m_no
                        + "', '" + e_id+ "', '" + pw+ "'   )");
        return true;
    }

}

