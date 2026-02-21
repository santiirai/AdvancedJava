//create a sevlet that computes and display the factorial of an inout number entered from a page
//when the button from the page is pressed by the user

/*Create a servlet that compares between two numbers entered from a page and display greater among them,
when the button from the page is pressed by the user*/
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;


@WebServlet("/FactorialNumber")
public class FactorialNumber extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>Factorial of a Number</h1>");
        out.println("<form method='post'>");
        out.println("Enter a number: <input type='number' name='number' required><br><br>");
        out.println("<input type='submit' value='Calculate'>");
        out.println("</form>");
        out.println("</body></html>");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int n = Integer.parseInt(request.getParameter("number"));
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        out.println("<html><body>");
        out.println("<h2>Factorial Result</h2>");
        out.println("Factorial of " + n + " is " + fact);
        out.println("<br><br><a href='FactorialNumber'>Back</a>");
        out.println("</body></html>");
    }
}
