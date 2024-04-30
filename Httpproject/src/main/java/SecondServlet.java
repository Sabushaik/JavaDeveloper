

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	System.out.println("Second servlet control");
	HttpSession session = request.getSession(false);
	
	String name2=(String)session.getAttribute("name");
	
	 PrintWriter writer = response.getWriter();
	       
	 writer.println("<h1> from the second servlet  "+name2+"</h1>");
	
	   writer.close();
	
	
	}

}
