import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class DeleteServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException 
    {
        PrintWriter out = response.getWriter();
        out.print("<html><body bgcolor='lightcoral'>");
        out.print("<h2>Delete Product Page</h2>");
        out.print("<form method='post' action='DeleteServlet'>");
        out.print("Product ID: <input type='text' name='pid'><br>");
        out.print("<input type='submit' value='Delete Product'>");
        out.print("</form></body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException 
    {
        String pid = request.getParameter("pid");
        PrintWriter out = response.getWriter();
        out.print("<html><body bgcolor='lightcoral'>");
        out.print("<h3>Product Deleted: ID " + pid + "</h3>");
        out.print("</body></html>");
    }
}
