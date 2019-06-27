package project.models;

import java.sql.*;
import java.util.Random;

public class AddDelights {
    private static final String List = "12345678910";
    private static final int List_len = 8;
    Connection conn;
    String[] fid = new String[100];
    String[] nm = new String[100];
    String[] size = new String[100];
    String[] qty = new String[100];
    String[] pr = new String[100];
    int i = 0;

    public void connect() throws Exception {
        Class c = Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantbase", "root", "1111");
    }

    public void insert(String StoreId, String Name, String Street, String MobileNo) throws Exception {
        Statement stmnt = conn.createStatement();
        int r = stmnt.executeUpdate(" insert into STORE1 values('" + StoreId + "','" + Name + "','" + Street + "','" + MobileNo + "')");
    }

    public String generateRandomString() {
        StringBuffer randstr = new StringBuffer();
        Random rnd = new Random();
        for (int i = 0; i < List_len; i++) {
            int n = rnd.nextInt(10);
            char ch = List.charAt(n);
            randstr.append(ch);
        }
        return randstr.toString();
    }

    public void display(String f_id) throws Exception {
        i = 0;
        PreparedStatement ob = conn.prepareStatement("select  * from STORE1");
        ResultSet res = ob.executeQuery();
        while (res.next()) {

            qty[i] = res.getString("qty");
            size[i] = res.getString("sz");
            pr[i] = res.getString("pr");
            nm[i] = res.getString("nm");

            i++;
        }
    }
}
