package Unit2.Database;

import java.sql.*;

public class ScrollableResultSetExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/advanca_java";
        String user = "root";
        String pass = "";
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = st.executeQuery("SELECT id,name,salary,branch FROM employees")) {

            rs.first();
            System.out.println("First: " + rs.getInt("id") + ", " + rs.getString("name"));
            rs.absolute(2);
            System.out.println("Second: " + rs.getInt("id") + ", " + rs.getString("name"));
            rs.last();
            System.out.println("Last: " + rs.getInt("id") + ", " + rs.getString("name"));

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
