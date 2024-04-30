package com.telusko.jdbclearnig;
import java.sql.*;
import java.util.Collections;
import java.io.*;
public class Launch {
	
	
		 public static void main(String args[]) throws ClassNotFoundException, SQLException
		 {
		     //load and register 
		     Class.forName("com.mysql.cj.jdbc.Driver");

		     //Establish the connection

		     String url ="jdbc:mysql://localhost:3306/jdbclearning";
		     String user ="root";
		     String password="sabu123";
		     

		     Connection connection = DriverManager.getConnection(url, user, password);

		     Statement statement=connection.createStatement();

		     String Insert = "Insert into student(ID , Sname,Sage,Scity) values(2,'Mawa' ,78,'nellore')";
		     int n =statement.executeUpdate(Insert);

		     if(n!=0)
		     {
		         System.out.println("Successfully");
		     }
		     else{
		         System.out.println("not happened");
		     }

		     statement.close();
		     connection.close();


		 }

	}

