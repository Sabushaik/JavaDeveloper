

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Registration")
public class Registration extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("uname");
		String city = request.getParameter("ucity");
		String Age = request.getParameter("uage");
		String email = request.getParameter("uemail");
		String Passw = request.getParameter("upass");
		
		Model model = new Model();
		model.setUname(name);
		model.setUage(Age);
		model.setUcity(city);
	    model.setUpass(Passw);
	    model.setUemail(email);
	    
	   int row= model.register();
	   
	   HttpSession session =request.getSession();
	   session.setAttribute("name",name);
	   
	   
	   if(row!= 0)
	   {
		   
		   response.sendRedirect("/RegistrationMVC/success.jsp");
	   }
	   else
	   {
		   response.sendRedirect("/RegistrationMVC/Failed.jsp");
		   
	   }
		
		
	}

}
