import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class LoginServlet extends HttpServlet 
{
    public LoginServlet() 
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	  try
	  {
		String uname= request.getParameter("uname");
		String upwd= request.getParameter("upwd");
		RequestDispatcher rd1=request.getRequestDispatcher("./HomeServlet"); 
		RequestDispatcher rd2=request.getRequestDispatcher("./login.html"); 
		PrintWriter out=response.getWriter();
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@AGNI:1521:Oracle12c","java","java");
	  	PreparedStatement ps=con.prepareStatement("select * from logintb where uname=? and upwd=?");
	  	ps.setString(1, uname);
	  	ps.setString(2, upwd);
	  	ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			rd1.forward(request, response);
		}
		else
		{
			out.print("<br>invalid username or password");
			rd2.include(request, response);
		}
				
	  }
	  catch (SQLException e) 
	  {
		e.printStackTrace();
	  }
	  catch (ClassNotFoundException e) 
	  {
		e.printStackTrace();
	  }
	  catch (Exception e) 
	  {
		e.printStackTrace();
	  }	
	}//end post method
}//end class
