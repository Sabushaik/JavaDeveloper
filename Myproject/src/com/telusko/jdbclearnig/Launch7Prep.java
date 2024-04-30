package com.telusko.jdbclearnig;

import java.util.*;

import java.sql.*;



public class Launch7Prep {
	
	
	public static void main(String args[])
	{

Connection connect =null;

PreparedStatement pst =null;

try
{
	connect =jdbcutil.getConnection();
	
	String sql="update student set Sage=? where ID=?;";
	
	pst = connect.prepareStatement(sql);
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Updating age of Student");
	 
	System.out.println("Enter the id of the person");
	int id=sc.nextInt();
	System.out.println("Enter the updated age");
	
	int age =sc.nextInt();
	
	pst.setInt(1, age);
	
	pst.setInt(2, id);
	
	int n= pst.executeUpdate();
	
	if(n!=0)
	{
		System.out.println("updated the data");
	}
	else
	{
		System.out.println("failed update ");
	}
}
catch (SQLException e) {

	e.printStackTrace();
}
finally
{
	try {
		jdbcutil.CloseConnection(connect, pst);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
		

	
}
}