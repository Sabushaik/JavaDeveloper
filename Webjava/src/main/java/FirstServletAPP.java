

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
@WebServlet("/firstservlet")
public class FirstServletAPP extends HttpServlet {
	
public FirstServletAPP()
{
	System.out.println("System servlet it is");
}
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name=request.getParameter("uname");
		
		String city = request.getParameter("ucity");
		
		
		PrintWriter writer= response.getWriter();
		writer.println("<html> <head> <title> My Dyanmic Response </title> <head>");
		writer.println("<body bgcolor='cyan' > <h1> Dyanmic response of the website </h1> ");
		writer.println("<table ><tr> <td > Name of the Person :-</td> <td>"+name+"</td></tr>");
		writer.println("<tr><td> City of the person :- </td> <td>  "+city+" </td> </tr>");
		writer.println("</table> </body> </html>");
		
		
		writer.close();
		
		
	}

}
