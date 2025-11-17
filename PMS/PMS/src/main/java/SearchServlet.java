
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SearchServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.print("<html><body bgcolor='lightyellow'>");
        out.print("<h2>Search Product Page</h2>");
        out.print("<form method='post' action='SearchServlet'>");
        out.print("Product Name: <input type='text' name='pname'><br>");
        out.print("<input type='submit' value='Search Product'>");
        out.print("</form></body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String pname = request.getParameter("pname");
        PrintWriter out = response.getWriter();
        out.print("<html><body bgcolor='lightyellow'>");
        out.print("<h3>Search Results for: " + pname + "</h3>");
        out.print("<p>(This is a placeholder — integrate with DB for real results)</p>");
        out.print("</body></html>");
    }
}
