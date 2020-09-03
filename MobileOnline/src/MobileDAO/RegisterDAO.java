package MobileDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import MobileModel.RegisterModel;


public class RegisterDAO {
	private static Connection con; 
	private static PreparedStatement ps;
 
 public static void getConnection()
 {
	 String JdbcURL = "jdbc:mysql://localhost:3306/mobiledb?" + "autoReconnect=true&useSSL=false";
     String Username = "root";
     String password = "";
      con = null;      
     try 
     {
   	  Class.forName("com.mysql.jdbc.Driver");    	   
      con = DriverManager.getConnection(JdbcURL, Username, password);        
     } 
     catch (Exception e) 
     {
        e.printStackTrace();
     }
	   
 }
 public static void closeConnection()
 {
	  try{
		  if(con.isClosed()==false)
	          con.close();   // closing the connection
	  }
	  catch(Exception e)
	  { e.printStackTrace();	 }
 }
 public boolean insert(RegisterModel registration)
 {
	 boolean status=false;	 
	 String sql="insert into mobiledb.register values(?,?,?,?,?,?,?,?,?,?)";
	try {
		getConnection();
		ps=con.prepareStatement(sql);
		ps.setString(1,registration.getUserid());
		ps.setString(2,registration.getName());
		ps.setString(3,registration.getGender());
		ps.setString(4,registration.getEmail());
		ps.setString(5,registration.getPassword());
		ps.setString(6,registration.getPhno());
		ps.setString(7,registration.getSecretqsn());
		ps.setString(8,registration.getSecretans());
		ps.setString(9,registration.getAddress());
		ps.setString(10,registration.getUtype());
		System.out.println("sql:"+ps.toString());
		int nor=ps.executeUpdate();
		closeConnection();
		   if(nor>0)
			   return true;
		   else
			   return false;
	  }
	  catch(SQLException e)
	  {
	  e.printStackTrace();
	  return false;
	  }
	  catch(Exception e)
	  {
	  e.printStackTrace();
	  return false;
	  }
		
	
 }
}