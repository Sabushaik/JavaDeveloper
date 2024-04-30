package com.telusko.jdbclearnig;
import java.util.*;
import java.sql.*;
public class Launch8select {

	
	public static void main(String args[])
	{
		Connection connect = null;
		PreparedStatement pst=null;
		try 
		{
			connect=jdbcutil.getConnection();
			
			String sql = "select * from student where ID=?";
			
			pst=connect.prepareStatement(sql);
			
			Scanner sc = new Scanner(System.in);
			
		System.out.println("The person data ");
		
		System.out.println("enter the id ");
		int id = sc.nextInt();
		
		pst.setInt(1, id);
		
		ResultSet rs = pst.executeQuery();
		if(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2) +" "+ rs.getInt(3)+" "+rs.getString(4));
			
		}
			
		}
		catch(SQLException e)
		{
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
