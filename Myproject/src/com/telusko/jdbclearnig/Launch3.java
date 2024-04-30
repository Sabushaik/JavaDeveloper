package com.telusko.jdbclearnig;
import java.sql.*;
public class Launch3 {
	
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
	   
	   String sql="select* from student; ";
	   //Executing the query
	   ResultSet set= statemnent.executeQuery(sql);
	   
	   while(set.next())
	   {
		   System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getInt(3)+" "+set.getString(4));
	   }
	   
	   
		

	
	
}
}
