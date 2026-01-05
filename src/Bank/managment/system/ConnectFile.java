package Bank.managment.system;

import java.sql.*;

public class ConnectFile {
    Connection connection;
    Statement statement;

    public ConnectFile() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // important: "cj" for newer MySQL versions
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagement", "root", "pratham@2005");
            statement = connection.createStatement();
            System.out.println("Database Connected Successfully!"); // ✅ Add this line to confirm
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


