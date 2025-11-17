import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class EditServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException 
    {
        PrintWriter out = response.getWriter();
        out.print("<html><body bgcolor='lightblue'>");
        out.print("<h2>Edit Product Page</h2>");
        out.print("<form method='post' action='EditServlet'>");
        out.print("Product ID: <input type='text' name='pid'><br>");
        out.print("New Name: <input type='text' name='newname'><br>");
        out.print("New Price: <input type='text' name='newprice'><br>");
        out.print("New Qty:Quantity: <input type='text' name='pqty'><br>");
        out.print("<input type='submit' value='Edit Product'>");
         out.print("</form></body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String pid = request.getParameter("pid");
        String newname = request.getParameter("newname");
        String newprice = request.getParameter("newprice");
        PrintWriter out = response.getWriter();
        out.print("<html><body bgcolor='lightblue'>");
        out.print("<h3>Product Updated: ID " + pid + " to " + newname + " with price " + newprice + "</h3>");
        out.print("</body></html>");
    }
}
