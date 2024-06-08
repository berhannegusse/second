package git;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class secpro {

	public static void main(String[] args) throws Exception
	{
		//TODO Auto-generated method stub
	String id1 = "01";
	String studentname1 ="eden";
	String section1 ="one";
	String gender1 ="female";
	String gread1 = "addis";
	
   Class.forName("com.mysql.cj.jdbc.Driver");
   Connection Con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root", "12345");
   
  PreparedStatement ps= Con.prepareStatement("insert into register values(?,?,?,?,?)");
  ps.setString(1,id1);
  ps.setString(2,studentname1);
  ps.setString(3,section1);
  ps.setString(4,gender1);
  ps.setString(5,gread1);
  
  
  int i = ps.executeUpdate();
  
  if(i >0 )
  {
	  System.out.println("true");
  }
  else
  {
	  System.out.println("fail");
  }
}

}