package com.telusko.jdbclearnig;
import java.sql.*;
public class Launch6
{
	
	public static void main(String args[])
	{
		//Loading & Register
		
		Connection Connect= null;
		
		Statement statement = null;
		
		try
		{
		//Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connect=	jdbcutil.getConnection();
		
		//Establish connection 
		
		/*String user="root";
		String url="jdbc:mysql://localhost:3306/jdbclearning";
		String password="sabu123" ;
		 Connect = DriverManager.getConnection(url,user,password);*/
		
		//Create statement 
		
	    statement = Connect.createStatement();
	   
	   String sql="Insert into student values(8,'kamae' ,22,'uruy');";
	   //Executing the query
	   int n= statement.executeUpdate(sql);
	   
	   if(n!=0)
	   {
		   System.out.println("  Successfully inserted ");
	   }
	   else
	   {
		   System.out.println("Not Inserted  ");
	   }
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try
			{
				jdbcutil.CloseConnection(Connect, statement);
				
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		

}
}
