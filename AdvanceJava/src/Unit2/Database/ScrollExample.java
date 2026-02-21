
package Unit2.Database;

import java.sql.*;

//WAP to demonstrate concept of Scrollable and Updatable Result sets.
public class ScrollExample {
    private
        String url = "jdbc:mysql://localhost:3306/advanca_java";
        String user = "root";
        String password = ""; 
        Connection conn = null;
        Statement st= null;
        ResultSet rs = null;
    public
      ScrollExample(){
          try {
            conn = DriverManager.getConnection(url, user, password);
            // Create a scrollable and updatable Statement object
            st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String query = "SELECT id, name, salary, branch FROM employees";
            rs = st.executeQuery(query);
          }catch(SQLException ex){
            System.out.println(ex);
          }
      }
      void lastRowDisplay(){
          try {// Move the cursor to the last row
            rs.last();
            System.out.println("Last Row: ID = " + rs.getInt("id") + 
              ", Name = " + rs.getString("name")+ 
              ", Salary = " + rs.getDouble("salary")+
              ", branch = " + rs.getString("branch"));
        } catch(SQLException ex){
            System.out.println(ex);
        }
      }  
      void firstRowDisplay(){
          try {// Move the cursor to the first row
            rs.first();
            System.out.println("Last Row: ID = " + rs.getInt("id") + 
              ", Name = " + rs.getString("name")+ 
              ", Salary = " + rs.getDouble("salary")+
              ", branch = " + rs.getString("branch"));
        } catch(SQLException ex){
            System.out.println(ex);
        }
      }
      
      void Row2Display(){
          try {// Move the cursor to the first row
            rs.absolute(2);
            System.out.println("Last Row: ID = " + rs.getInt("id") + 
              ", Name = " + rs.getString("name")+ 
              ", Salary = " + rs.getDouble("salary")+
              ", branch = " + rs.getString("branch"));
        } catch(SQLException ex){
            System.out.println(ex);
        }
      }
      void UpdateAbsolute(int i){
          try{
              rs.absolute(i);
              rs.moveToInsertRow();
              rs.updateString("name", "Bina");
              rs.updateString("Salary", "90000");
              rs.updateString("branch", "Dhrn");
              rs.updateRow();
              System.out.println("Last Row: ID = "+rs.getInt("id")+
                      ", Name = "+rs.getString("name")+
                      ", Salary = "+rs.getDouble("salary")+
                      ", branch = "+ rs.getString("branch"));
              
          }catch(SQLException e){
              System.out.print(e);
          }
      }
      void deleteRow(int i){
          try{
              
          }catch(Exception e){
              System.out.print(e);
          }
      }
    public static void main(String[] args){
        ScrollExample s = new ScrollExample();
        s.firstRowDisplay();
        s.Row2Display();
    }
}