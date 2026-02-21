package Unit2.Database;

import java.sql.*;

public class ScrollUpdateResultSet {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/advanca_java", "root", "");

            Statement st = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE
            );

            ResultSet rs = st.executeQuery("SELECT * FROM employees");

            // Move forward
            rs.next();
            System.out.println("First Record: "
                    + rs.getInt("id") + " "
                    + rs.getString("name") + " "
                    + rs.getInt("salary"));

            // Move to last
            rs.last();
            System.out.println("Last Record: "
                    + rs.getInt("id") + " "
                    + rs.getString("name") + " "
                    + rs.getInt("salary"));

            // Move backward
            rs.previous();
            System.out.println("Previous Record: "
                    + rs.getInt("id") + " "
                    + rs.getString("name") + " "
                    + rs.getInt("salary"));

            // Update salary using ResultSet
            rs.updateInt("salary", rs.getInt("salary") + 2000);
            rs.updateRow();
            System.out.println("Salary updated successfully");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

