package Unit2.Database;

import java.sql.*;

public class UpdatableResultSetExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/advanca_java";
        String user = "root";
        String pass = "";
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = st.executeQuery("SELECT id,name,salary,branch FROM employees")) {

            rs.absolute(2);
            rs.updateString("name", "Bina");
            rs.updateDouble("salary", 90000);
            rs.updateString("branch", "Dhrn");
            rs.updateRow();
            System.out.println("Updated row 2");

            rs.absolute(3);
            rs.deleteRow();
            System.out.println("Deleted row 3");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
