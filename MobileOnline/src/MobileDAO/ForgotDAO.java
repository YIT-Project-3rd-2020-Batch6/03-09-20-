package MobileDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import MobileModel.ProductModel;
import MobileModel.RegisterModel;

public class ForgotDAO {
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
	  
	  public static boolean validate(RegisterModel val)
	  {
		  try
		  {
			  getConnection();
			  String sql="select userid from register where userid=? and secretqsn=? and secretans=?";
			  stmt=con.prepareStatement(sql);
			  stmt.setString(1, val.getUserid());
			  stmt.setString(2, val.getSecretqsn());
			  stmt.setString(3, val.getSecretans());
			  ResultSet rs=stmt.executeQuery();
			  System.out.println("sql:"+stmt.toString());
			  int nor=0;
			  if(rs.next())
			  {
				  nor=1;
			  }
			  closeConnection();
			  if(nor==1)
				  return true;
			  else
				  return false;
		  }
		  catch(SQLException e)
		  {	  e.printStackTrace();	 return false; }
		  catch(Exception e)
		  {	  e.printStackTrace();	 return false; } 
	  }
	  
	  public static boolean reset(RegisterModel rst)
	  {
		  try
		  {
			  getConnection();
			  String sql="update register set password=? where userid=?";
			  stmt=con.prepareStatement(sql);
			  stmt.setString(2, rst.getUserid());
			  stmt.setString(1, rst.getPassword());
			  int nor=stmt.executeUpdate();
			  System.out.println("sql:"+stmt.toString());
			  
			    closeConnection();	 
			     if(nor>0)
			       return true;
			     else
			    	 return false;
			  }
			  catch(SQLException e)
			  {	  e.printStackTrace();	 return false; }
			  catch(Exception e)
			  {	  e.printStackTrace();	 return false; } 
		  
	  }

}
