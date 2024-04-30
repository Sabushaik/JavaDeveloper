import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Model2 {
	
	String name ;
	String password;
	Connection connect=null;
	PreparedStatement pst =null;
	String name2;
	String password2;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public boolean login()
	{
		
		boolean res =false ;
		try {
			connect=jdbcutil.getConnection();
			String sql ="select * from sabu where uname =? and upassword=?;";
			pst=connect.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, password);
		 ResultSet rs=	pst.executeQuery();
		
	if(rs.next())
	{
		String str=   rs.getString(1);
		 String str2=  rs.getString(5);
		 
		 if(str.equals(name)&&str2.equals(password))
		 {
			 res=true ;
		 }
			 
		 }
	else
	{
		res=false;
	}	
		
		} catch (SQLException e) {
			
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
		
		return res;
		
		
	}

}
