import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/PersonServlet")
public class PersonServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("Name: " + req.getParameter("name"));
        out.println("<br>Age: " + req.getParameter("age"));
        out.println("<br>Address: " + req.getParameter("address"));
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        doGet(req, res);
    }
}
