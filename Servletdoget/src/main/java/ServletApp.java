

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletApp")
public class ServletApp extends HttpServlet {


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		System.out.println("Servlet Control Panel");
		String name= request.getParameter("uname");
		String city = request.getParameter("ucity");
		
		if(name.equals("sabu")&&city.equals("Nellore"))
		{
			System.out.println("Hey welcome to the page ");
		}
		else 
			
		{
			System.out.println("Wrong credentials ");
		}
		
	}

}
