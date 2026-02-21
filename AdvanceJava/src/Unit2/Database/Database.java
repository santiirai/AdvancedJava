/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2.Database;

import com.mysql.cj.xdevapi.Result;
import java.sql.*;

/**
 *
 * @author Shanti
 */
public class Database {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/advanca_java";
        String username = "root";
        String password = "";
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String grade = rs.getString("grade");
                System.out.println("Id: "+id+" name: "+name +" age: "+age+ " Grade: "+grade);
            }
            rs.close();
            stmt.close();
            conn.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
