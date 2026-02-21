package Unit2.Database;

import java.sql.*;
import java.util.Scanner;


public class EmployeeDB {

    static Connection con;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/advanca_java", "root", "");

            int choice;

            do {
                System.out.println("\nEnter your choice...");
                System.out.println("1. Insert employee");
                System.out.println("2. Update salary");
                System.out.println("3. Update name");
                System.out.println("4. Update branch");
                System.out.println("5. Delete employee");
                System.out.println("6. Display all employee");
                System.out.println("7. Exit");

                choice = sc.nextInt();

                switch (choice) {
                    case 1: insertEmployee(); break;
                    case 2: updateSalary(); break;
                    case 3: updateName(); break;
                    case 4: updateBranch(); break;
                    case 5: deleteEmployee(); break;
                    case 6: displayEmployee(); break;
                    case 7: System.out.println("Exiting program"); break;
                    default: System.out.println("Invalid choice");
                }

            } while (choice != 7);

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void insertEmployee() throws SQLException {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter Branch: ");
        String branch = sc.next();

        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO employees VALUES(?,?,?,?)");

        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, salary);
        ps.setString(4, branch);

        ps.executeUpdate();
        System.out.println("Employee inserted successfully");
    }

    static void updateSalary() throws SQLException {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter New Salary: ");
        int salary = sc.nextInt();

        PreparedStatement ps = con.prepareStatement(
                "UPDATE employees SET salary=? WHERE id=?");

        ps.setInt(1, salary);
        ps.setInt(2, id);

        ps.executeUpdate();
        System.out.println("Salary updated successfully");
    }

    static void updateName() throws SQLException {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter New Name: ");
        String name = sc.next();

        PreparedStatement ps = con.prepareStatement(
                "UPDATE employees SET name=? WHERE id=?");

        ps.setString(1, name);
        ps.setInt(2, id);

        ps.executeUpdate();
        System.out.println("Name updated successfully");
    }

    static void updateBranch() throws SQLException {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter New Branch: ");
        String branch = sc.next();

        PreparedStatement ps = con.prepareStatement(
                "UPDATE employees SET branch=? WHERE id=?");

        ps.setString(1, branch);
        ps.setInt(2, id);

        ps.executeUpdate();
        System.out.println("Branch updated successfully");
    }

    static void deleteEmployee() throws SQLException {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        PreparedStatement ps = con.prepareStatement(
                "DELETE FROM employees WHERE id=?");

        ps.setInt(1, id);

        ps.executeUpdate();
        System.out.println("Employees deleted successfully");
    }

    static void displayEmployee() throws SQLException {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM employees");

        System.out.println("\nID\tName\tSalary\tBranch");
        while (rs.next()) {
            System.out.println(
                    rs.getInt(1) + "\t" +
                    rs.getString(2) + "\t" +
                    rs.getInt(3) + "\t" +
                    rs.getString(4));
        }
    }
}

