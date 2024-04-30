

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Jdbc")
public class Jdbc extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("uname");
		String city = request.getParameter("ucity");
		String age = request.getParameter("uage");
		String email = request.getParameter("uemail");
		String pass = request.getParameter("upass");
		String user="root";
		String url="jdbc:mysql://localhost:3306/jdbclearning";
		String password="sabu123" ;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connect=DriverManager.getConnection(url,user,password);
			
			PreparedStatement pst =connect.prepareStatement("Insert Into stdtable (uname , ucity , uage,uemail , upassword) values(? , ? ,? ,? ,?); ");
			
			pst.setString(1, name);
			pst.setString(2, city);
	        pst.setString(3, age);
	        pst.setString(4,email);
	        pst.setString(5, pass);
	        
	         int row = pst.executeUpdate();
	         
	         PrintWriter writer = response.getWriter();
	         
	         if(row!=0)
	         {
	        	writer.println("<h1>Registration success </h1>");
	         }
	         else
	         {
	        	 writer.println("Not updated");
	         }
	         
	         pst.close();
	         connect.close();
	        
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
