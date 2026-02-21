/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2.Database;

//import com.mysql.cj.xdevapi.Result;
import java.sql.*;

/**
 *
 * @author Shanti
 */
public class employee {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/advanca_java";
        String username = "root";
        String password = "";
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement s = conn.createStatement();
            
            String sql = "INSERT INTO employees(id, name, salary, branch) VALUES (4, 'MAYA', 20000,'Brtnr')";
            s.executeUpdate(sql);
            
            ResultSet r = s.executeQuery("SELECT * FROM employees");
            
            while (r.next()){
                int id = r.getInt("id");
                String name = r.getString("name");
                int salary = r.getInt("salary");
                String branch = r.getString("branch");
                System.out.println("Id: "+id+" Name: "+name +" Salary: "+salary+ " Branch: "+branch);
            }
            r.close();
            s.close();
            conn.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
