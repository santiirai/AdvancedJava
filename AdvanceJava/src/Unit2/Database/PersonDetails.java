/* Create a table Person (id,name,age,address). Create a java program and connect with the database. 
Then perform varoius opration on the table using different functions:
	a) Insert person details
	b) delete person details
	c) display person details
	d) display details of person whose age>=18
	e) update age of the person */
package Unit2.Database;

import java.sql.*;
import java.util.Scanner;

public class PersonDetails {

    private String url = "jdbc:mysql://localhost:3306/advanca_java";
    private String username = "root";
    private String password = "";
    private Connection conn;
    private PreparedStatement ps;
    private String sql;

    public PersonDetails() {
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Insert person details
    void insert() {
        try {
            sql = "INSERT INTO Person (name, age, address) VALUES (?, ?, ?)";
            ps = conn.prepareStatement(sql);

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine(); // consume leftover newline
            System.out.print("Enter address: ");
            String address = sc.nextLine();

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, address);
            ps.executeUpdate();

            System.out.println("Person inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Read person details by ID
    void read() {
        try {
            sql = "SELECT * FROM Person WHERE id = ?";
            ps = conn.prepareStatement(sql);

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter id to display: ");
            int id = sc.nextInt();

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Address: " + rs.getString("address"));
                System.out.println("---------------------------");
            } else {
                System.out.println("No person found with this ID.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete person details
    void delete() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter id to delete: ");
            int id = sc.nextInt();

            sql = "DELETE FROM Person WHERE id = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Person deleted successfully.");
            } else {
                System.out.println("No person found with this ID.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Update age of person

    void updateAge() {
        try {
            sql = "UPDATE Person SET age = ? WHERE id = ?";
            ps = conn.prepareStatement(sql);

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter id to update: ");
            int id = sc.nextInt();
            System.out.print("Enter new age: ");
            int age = sc.nextInt();

            ps.setInt(1, age);
            ps.setInt(2, id);
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Age updated successfully.");
            } else {
                System.out.println("No person found with this ID.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Display all person details
    void display() {
        try {
            sql = "SELECT * FROM Person";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                System.out.println("ID: " + id + "\nName: " + name + "\nAge: " + age + "\nAddress: " + address);
                System.out.println("---------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Display persons with age >= 18
    void display18() {
        try {
            sql = "SELECT * FROM Person WHERE age >= ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, 18);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                System.out.println("ID: " + id + "\nName: " + name + "\nAge: " + age + "\nAddress: " + address);
                System.out.println("---------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PersonDetails p = new PersonDetails();

        // Example usage
        p.insert();
        p.updateAge();
        p.read();
        p.display18();
        p.delete();
        p.display();
    }
}
