/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2.Database;

import java.sql.*;

public class NewClass {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/advanca_java",
                "root",
                ""
            );

            CallableStatement cs = con.prepareCall("{call showPersons()}");
            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("age") + " " +
                    rs.getString("address")
                );
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

