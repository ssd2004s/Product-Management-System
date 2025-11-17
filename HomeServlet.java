import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HomeServlet extends HttpServlet 
{
 public HomeServlet() 
 {
    super();
 }
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
 {
    doPost(request, response);
 }
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
 {
	 String uname= request.getParameter("uname");
	 String upwd= request.getParameter("upwd");
	 PrintWriter out=response.getWriter();
	 out.print("<html>");
	 out.print("<body bgcolor='yellow'>");
	 out.print("<br><br><p style='text-align:right'> profile name:"+uname+"</p>");
	 out.print("<br><br>Welcome to Home Servlet....!");
	 out.print("<br><br><a href='./AddServlet'>Add Prodcut</a>");
	 out.print("<br><a href='./EditServlet'>Edit Prodcut</a>");
	 out.print("<br><a href='./DeleteServlet'>Delete Prodcut</a>");
	 out.print("<br><a href='./SearchServlet'>Search Prodcut</a>");
	 out.print("</body>");	
	 out.print("</html>");  		
 }
}//end class

