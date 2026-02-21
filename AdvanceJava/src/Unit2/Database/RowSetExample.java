package Unit2.Database;

import java.sql.*;
import javax.sql.rowset.*;

public class RowSetExample {

    String url = "jdbc:mysql://localhost:3306/advanca_java";
    String user = "root";
    String password = "";
    JdbcRowSet rose;

    RowSetExample() {
        try {
            // initialize CLASS variable (no JdbcRowSet before it)
            rose = RowSetProvider.newFactory().createJdbcRowSet();

            rose.setUrl(url);
            rose.setUsername(user);
            rose.setPassword(password);

            // VERY IMPORTANT
            rose.setCommand("SELECT * FROM employees"); // use your table name
            rose.execute();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    void display() {
        try {
            while (rose.next()) {
                System.out.println(
                    "ID = " + rose.getInt("id") +
                    ", Name = " + rose.getString("name") +
                    ", Salary = " + rose.getInt("salary") +
                    ", Branch = " + rose.getString("branch")
                );
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        RowSetExample rs = new RowSetExample();
        rs.display();
    }
}
