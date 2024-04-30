

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hey dude");
		String name = request.getParameter("uname");
		String city = request.getParameter("ucity");
		
		
		
		
	RequestDispatcher rqd = request.getRequestDispatcher("/SecondServlet");
	HttpSession session = request.getSession();
	session.setAttribute("name", name);
       rqd.forward(request,response);
       
       PrintWriter writer = response.getWriter();
       writer.println("<h1>Response from first servlet</h1>");
       
       writer.close();
		
		       
	}

}
