package com.telusko.jdbclearnig;
import java.sql.*;
import java.util.*;
public class LaunchPrep
{
	
	public static void main(String args[])
	{
		//Loading & Register
		
		Connection Connect= null;
		
		Statement statement = null;
		PreparedStatement pst=null;
		
		try
		{
		Connect=	jdbcutil.getConnection();
		
		String query="Insert into student Values(?,?,?,?);";
		
	    pst=Connect.prepareStatement(query);
	    
	    System.out.println("enter the id ");
	    Scanner sc = new Scanner(System.in);
	   int id = sc.nextInt();
	   System.out.println("enter the name");
	   String str=sc.next();
	   System.out.println("enter the age ");
	   int age = sc.nextInt();
	   System.out.println("enter the city ");
	   String city = sc.next();
	   
	   pst.setInt(1,id);
	   pst.setInt(3,age);
	   pst.setString(2,str);
	   pst.setString(4,city);
	   
	   
	   
	   
	   //Executing the query
	   int n= pst.executeUpdate();
	   
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
				jdbcutil.CloseConnection(Connect, pst);
				
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		

}
}
