import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet")//Annotation
public class Servlet extends HttpServlet{
    @Override
    public void init() throws ServletException{
        System.out.println("Servle is being iinitialized..");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html");
        response.getWriter().println("<h3>Servlet Example</h3>");
        System.out.println("Handling GET Request");
        
    }
    @Override
    public void destroy(){
        System.out.println("Servlet is being destroyed");
    }
}
