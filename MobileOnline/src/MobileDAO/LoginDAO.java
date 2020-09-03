package MobileDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import MobileModel.RegisterModel;
public class LoginDAO {
	private static Connection con; 
	  private static PreparedStatement stmt;	  
	public static void getConnection()
	  {	 	
		  con = null;      
	      try 
	      {
	    	 Class.forName("com.mysql.jdbc.Driver");	    	
	    	 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledb", "root", "");
	         
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

	  
	public static String  validate(RegisterModel registerModel)
	  {
		  boolean status=false;
		  try
		  {
		  getConnection();
		  stmt=con.prepareStatement("select utype from register where userid=? and password=?");
		  stmt.setString(1, registerModel.getUserid());
	      stmt.setString(2, registerModel.getPassword());
		  ResultSet rs=stmt.executeQuery();
		  String ut="";
		  if(rs.next())
		  {
			 ut=rs.getString(1);
		  }
		  closeConnection();
		  
		  return ut;
		  }
		  catch(SQLException e)
		  {	  e.printStackTrace();	 return ""; }
		  catch(Exception e)
		  {	  e.printStackTrace();	 return ""; }  	  
		  
	            
	 }
 

}