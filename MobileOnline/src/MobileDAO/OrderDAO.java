package MobileDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import MobileModel.OrderModel;

public class OrderDAO {
	private static Connection con; 
	 private static PreparedStatement stmt;
	  
	public static void getConnection()
	  {	 	
		  String JdbcURL = "jdbc:mysql://localhost:3306/mobiledb?" + "autoReconnect=true&useSSL=false";
	      String Username = "root";
	      String password = "";
	       con = null;      
	      try 
	      {
	    	 Class.forName("com.mysql.jdbc.Driver");   // Driver should be registered
	    	 // con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/test1","root","");  
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
	  
	  
}
