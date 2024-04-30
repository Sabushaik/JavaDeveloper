package com.telusko.jdbclearnig;
import java.sql.*;
public class Launch4
{
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		//Loading & Register
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish connection 
		
		String user="root";
		String url="jdbc:mysql://localhost:3306/jdbclearning";
		String password="sabu123" ;
		Connection connect = DriverManager.getConnection(url,user,password);
		
		//Create statement 
		
	   Statement statemnent = connect.createStatement();
	   
	   String sql="delete from student where Id=2;";
	   //Executing the query
	   int n= statemnent.executeUpdate(sql);
	   
	   if(n!=0)
	   {
		   System.out.println("Okay deleted  Successfully");
	   }
	   else
	   {
		   System.out.println("Not delted ");
	   }
		

}
}
