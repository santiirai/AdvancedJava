/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2.Database;

import java.sql.*;
import java.util.Scanner;

public class CallProcedure {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/advanca_java", "root", "");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            System.out.print("Enter Address: ");
            String address = sc.next();

            CallableStatement cs = con.prepareCall(
                "{CALL insertEmployeee(?,?,?,?)}");

            cs.setInt(1, id);
            cs.setString(2, name);
            cs.setInt(3, age);
            cs.setString(4, address);

            cs.execute();

            System.out.println("Record inserted successfully using stored procedure");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
