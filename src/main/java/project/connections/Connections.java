package project.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {

    Connection conn;

    public void connect() throws ClassNotFoundException, SQLException {

        Class c = Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantbase", "root", "1111");

    }
}
