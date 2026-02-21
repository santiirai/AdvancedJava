package Unit2.Database;

import javax.swing.*;
import java.sql.*;

public class DbConnect {

    public static void main(String[] args) {
        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/advanca_java"
                        + "", "root", "");

            JOptionPane.showMessageDialog(null, "Database Connected Successfully");

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
