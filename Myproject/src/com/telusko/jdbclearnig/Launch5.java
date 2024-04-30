package com.telusko.jdbclearnig;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Launch5 {
	
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
		
	   Statement statement = connect.createStatement();
	   
	   String sql= "select * from student;";
	   //Executing the query
	   boolean stat = statement.execute(sql);
	   
	   if(stat)
	   {
		   
		  System.out.println("If block executed");
		  ResultSet set= statement.getResultSet();
		  
		  while(set.next())  
		  {
			  System.out.println(set.getInt(1)+" "+ set.getString(2)+" "+set.getInt(3)+" "+set.getString(4));
			  
		  }
	   }
	   else 
	   {  
	      System.out.println("else block");
		   int n = statement.getUpdateCount();
		   
		   if(n!=0)
		   {
			   System.out.print("updates occured");
		   }
		   else
		   {
			   System.out.println("sorry failed");
		   }
	   }
		

}
}
