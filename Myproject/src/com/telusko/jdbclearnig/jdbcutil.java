package com.telusko.jdbclearnig;
import java.sql.*;

public class jdbcutil {
	
	static 
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}
	}
	
	public static Connection  getConnection() throws SQLException
	{
		String user ="root";
		String url="jdbc:mysql://localhost:3306/jdbclearning";
		String password="sabu123" ;
		
		return DriverManager.getConnection(url,user,password);
	}
	
	public static void CloseConnection(Connection connect ,Statement statement) throws SQLException
	{
		
		connect.close();
		statement.close();
		
	}
}
