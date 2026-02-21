/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2.Database;
import java.sql.*;

/**
 *
 * @author Shanti
 */
public class Employees {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/advanca_java";
        String username = "root";
        String password = "";
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "INSERT INTO employees(name, salary, branch) VALUES (?,?,?)";
            //Create the PreparedStatement object
            PreparedStatement ps = conn.prepareStatement(sql);
            //set the parameters for the prepareStatement
            ps.setString(1,"Ana Huang");
            ps.setInt(2, 45000);
            ps.setString(3, "Ith");
            //execute the insert query
            ps.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
