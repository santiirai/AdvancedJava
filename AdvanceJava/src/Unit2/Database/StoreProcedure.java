/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2.Database;

//WAP to call the store procedure to store employee's details in the employee table

import java.sql.*;

/**
 *
 * @author Shanti
 */
public class StoreProcedure {
    public static void main(String [] args){
        String url = "jdbc:mysql://localhost:3306/advanca_java";
        String username = "root";
        String password = "";
        Connection conn;
        CallableStatement cs;
        PreparedStatement ps;
        try{
                conn = DriverManager.getConnection(url, username, password);
//                System.out.println("Test....");
                String sql = "{Call insertEmployee (?, ?, ?)}";
                cs = conn.prepareCall(sql);
                
                cs.setString(1, "peace Rai");
                cs.setDouble(2, 50000.00);
                cs.setString(3, "KTM");
                
                cs.executeUpdate();
            }
            catch(SQLException ex){
                System.out.println(ex);
            }
    }
}
