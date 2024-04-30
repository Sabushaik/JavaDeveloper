import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
	
	String uname;
	String uage;
	String ucity;
	String uemail;
	String upass;
	Connection connect =null;
	PreparedStatement pst =null;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUage() {
		return uage;
	}
	public void setUage(String uage) {
		this.uage = uage;
	}
	public String getUcity() {
		return ucity;
	}
	public void setUcity(String ucity) {
		this.ucity = ucity;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	
	
	public int register()
	{
		int row=0 ;
		try {
			connect=jdbcutil.getConnection();
		
		String sql="insert into sabu (uname , ucity,uage,uemail,upassword) values (?,?,?,?,?);";
		
		         pst=  connect.prepareStatement(sql);
		pst.setString(1, uname);
		pst.setString(2, ucity);
		pst.setString(3, uage);
		pst.setString(4, uemail);
		pst.setString(5, upass);
	row=pst.executeUpdate();
		
		 
		}
	 catch (SQLException e) {
		// TODO Auto-generated catch block
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
		
		return row;	
		
	}
	
}
