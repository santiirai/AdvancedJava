import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MyForm")//Annotation

public class MyForm extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<h1>form</h1>");
        out.println("<form method='POST' action = '/WebApplication/MyForm'>");
        out.println("Name: <input type='text' name = 'name'/><br><br>");
        out.println("age: <input type='text' name = 'age'/><br><br>");
        out.println("address: <input type='text' name = 'address'/><br><br>");
        out.println("contact: <input type='number' name = 'contact'/><br><br>");
        out.println("<input type='submit' name = 'submit'/><br><br>");
        out.println("</form>");
    }
    
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");
        out.println("<h1>Strudent's details: </h1>");
        out.println("<h3>Name: "+name+"</h3>");
        out.println("<h3>age: "+age+"</h3>");
        out.println("<h3>address: "+address+"</h3>");
        out.println("<h3>contact: "+contact+"</h3>");
    }
}
