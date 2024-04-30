package com.telusko.jdbclearnig;
import java.sql.*;

import com.mysql.cj.jdbc.Driver;
public class Launch2 {
	
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
	   
	   String sql= "update student set Sage=23 where Id=1;";
	   //Executing the query
	   int n= statemnent.executeUpdate(sql);
	   
	   if(n!=0)
	   {
		   System.out.println("Okay update done");
	   }
	   else
	   {
		   System.out.println("No updates");
	   }
		
		
		
		
	}

}
