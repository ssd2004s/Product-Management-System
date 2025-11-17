import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class AddServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html><body bgcolor='lightgreen'>");
        out.print("<h2>Add Product Page</h2>");
        out.print("<form method='post' action='AddServlet'>");
        out.print("<br>Product Id:<input type='text' name='pid'><br>");
        out.print("<br>Product Name:<input type='text' name='pname'><br>");
        out.print("<br>Price: <input type='text' name='pprice'><br>");
        out.print("<br>Quantity: <input type='text' name='pqty'><br>");
                out.print("<input type='submit' value='Add Product'>");
        out.print("</form></body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String pname = request.getParameter("pname");
        String price = request.getParameter("price");
        PrintWriter out = response.getWriter();
        out.print("<html><body bgcolor='lightgreen'>");
        out.print("<h3>Product Added: " + pname + " with price " + price + "</h3>");
        out.print("</body></html>");
    }
}
