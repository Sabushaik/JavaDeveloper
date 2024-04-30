

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Second")
public class Second extends HttpServlet {
	
 public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		
		String password=request.getParameter("pass");
		
		Model2 model2 = new  Model2();
		model2.setName(name);
		model2.setPassword(password);
		
		boolean result =model2.login();
		   HttpSession session =request.getSession();
		   session.setAttribute("name",name);
		
		if(result)
		{
			response.sendRedirect("/RegistrationMVC/success2.jsp");
		}
		else
		{
			response.sendRedirect("/RegistrationMVC/Failed2.jsp");
		}
	}

}
