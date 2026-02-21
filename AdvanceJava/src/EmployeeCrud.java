import java.sql.*;
import java.util.Scanner;

public class EmployeeCrud {
    private
        String url = "jdbc:mysql://localhost:3306/advanca_java";
        String username = "root";
        String password = "";
        Connection conn;
        PreparedStatement ps;
        String sql;
    public
        //It returns connection
        Connection connect(){
            try{
                 conn = DriverManager.getConnection(url, username, password);
                 return conn;
            }
            catch(SQLException e){
                e.printStackTrace();
            }
            return null;
        }
       
       //display all employee details
       void display(){
           try{
           sql = "SELECT * FROM employee";
           ps= connect().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int salary = rs.getInt("salary");
                String branch = rs.getString("branch");
                System.out.println("ID: " + id + ", Name: " + name+"\nSalary: "+salary+"\nBranch: "+branch);
            }
           }
           catch(SQLException e){
               e.printStackTrace();
           }
       }
       
       //Insert into employee table
       void insert(){
           try{
            sql = "INSERT INTO employees (name, salary, branch) VALUES (?, ?, ?)";
            ps= connect().prepareStatement(sql);
           
            Scanner sc = new Scanner(System.in);  
            System.out.println("Enter name: ");
            String name = sc.next();
            System.out.println("Enter salary: ");
            int salary = sc.nextInt();
            System.out.println("Enter branch: ");
            String branch = sc.next();
           
            ps.setString(1, name);
            ps.setInt(2, salary);
            ps.setString(3, branch);
            ps.executeUpdate();
           }
           catch(SQLException e){
               e.printStackTrace();
           }
        }    
       
      //delete employee  
      void delete(){
           try{
            sql = "DELETE FROM employee WHERE id = ?";
            ps= connect().prepareStatement(sql);
           
            Scanner sc = new Scanner(System.in);  
            System.out.println("Enter id:");
            int id = sc.nextInt();
           
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
           }
           catch(SQLException e){
               e.printStackTrace();
           }
      }
     
      //update salary
      void updateSalary(){
          try{
            sql = "UPDATE employee SET salary = ? WHERE id = ?";
            ps= connect().prepareStatement(sql);
           
            Scanner sc = new Scanner(System.in);  
            System.out.println("Enter id:");
            int id = sc.nextInt();
            System.out.println("Enter updated salary:");
            int salary = sc.nextInt();
           
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, salary);
            ps.setInt(2, id);
            ps.executeUpdate();
           }
           catch(SQLException e){
               e.printStackTrace();
           }
      }
     
      //update name
      void updateName(){
          try{
            sql = "UPDATE employee SET name = ? WHERE id = ?";
            ps= connect().prepareStatement(sql);
           
            Scanner sc = new Scanner(System.in);  
            System.out.println("Enter id: ");
            int id = sc.nextInt();
            System.out.println("Enter new name: ");
            String name = sc.next();
           
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, id);
            ps.executeUpdate();
           }
           catch(SQLException e){
               e.printStackTrace();
           }
      }
     
      //update name
      void updateBranch(){
          try{
            sql = "UPDATE employee SET branch = ? WHERE id = ?";
            ps= connect().prepareStatement(sql);
           
            Scanner sc = new Scanner(System.in);  
            System.out.println("Enter id: ");
            int id = sc.nextInt();
            System.out.println("Enter new branch: ");
            String branch = sc.next();
           
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, branch);
            ps.setInt(2, id);
            ps.executeUpdate();
           }
           catch(SQLException e){
               e.printStackTrace();
           }
      }
       public static void main(String[] args){
           EmployeeCrud emp = new EmployeeCrud();
           boolean flag = true;
           while(flag==true){
               System.out.println("Enter your choice....\n"+"1.Insert employee \n"+
                       "2.Update salary: \n"+"3. Update name: "+"4.Update branch: "+"5.Delete employee: \n"
                       +"6. Display all employees: \n"+"7. Exit");
           }
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
               switch(choice){
                   case 1: emp.insert(); break;
                   case 2: emp.updateSalary(); break;
                   case 3: emp.updateName(); break;
                   case 4: emp.updateBranch(); break;
                   case 5: emp.delete(); break;
                   case 6: emp.display(); break;
                   case 7: flag = false; break;
                   default: System.out.println("Invalid choice!");
               }
       }
}
