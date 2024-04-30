

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServletAPP
 */
@WebServlet("/Servlet")
public class Servletjsp extends HttpServlet {
	
public Servletjsp()
{
	System.out.println("System servlet it is");
}
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name=request.getParameter("uname");
		
		String city = request.getParameter("ucity");
		
		response.sendRedirect("/Redirecting/Success.jsp");
		
		
		
		
		
	}

}


