package MobileDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import MobileModel.ProductModel;
import MobileModel.RegisterModel;



public class ProductDAO {
	
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
	  public boolean addProduct(ProductModel product)
	  {
	 	 boolean status=false;	
	 	 System.out.println("test");
	 	 String sql="insert into mobiledb.product values(?,?,?,?,?,?,?,?,?)";
	 	try {
	 		getConnection();
	 		stmt=con.prepareStatement(sql);
	 		stmt.setInt(1, product.getPid());
	 		stmt.setString(2, product.getPname());
	 		stmt.setString(3, product.getBrand());
	 		stmt.setString(4, product.getRam());
	 		stmt.setString(5, product.getRom());
	 		stmt.setString(6, product.getProcessor());
	 		stmt.setString(7, product.getBattery());
	 		stmt.setInt(8, product.getPrice());
	 		stmt.setString(9, product.getDescrptn());
	 		System.out.println("sql:"+stmt.toString());
	 		int nor=stmt.executeUpdate();
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
	 		
	  
  public static ArrayList<String> getAllBrand()
  {
  ArrayList<String> allbrand=new ArrayList<String>();	  
  try
  {
    getConnection();
    stmt=con.prepareStatement("select distinct brand from product");       
    ResultSet rs=stmt.executeQuery();  
    while(rs.next())
	  {  
	    	allbrand.add(rs.getString(1))	; 		
	  }  
     closeConnection();	 
     return allbrand;
  }
  catch(SQLException e)
  {	  e.printStackTrace();	 return null; }
  catch(Exception e)
  {	  e.printStackTrace();	 return null; }  	  
}
  public static ArrayList<ProductModel> getProductssByBrand(String brand)
  {
	  ArrayList <ProductModel> products=new ArrayList<ProductModel>();
	  ProductModel temp; 
	  	  
	  try
	  {
	  getConnection();
      stmt=con.prepareStatement("select pid,pname,ram,rom,processor,battery,price,descrptn from product where brand=?"); 
      stmt.setString(1, brand);
	  ResultSet rs=stmt.executeQuery();  
	 // System.out.println(branch);
	  while(rs.next())
		  {  		   
		  temp=new ProductModel(rs.getInt(1), rs.getString(2),brand,rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8));	
		  products.add(temp); 		  
		  
		  }  
	     closeConnection();	 
	     return products;
	  }
	  catch(SQLException e)
	  {	  e.printStackTrace();	 return null; }
	  catch(Exception e)
	  {	  e.printStackTrace();	 return null; }  	  
  }
  public static ProductModel getProductsByPid(int pid)
  {
	  ProductModel temp=null;	  	  
	  try
	  {
	  getConnection();
	  String sql="select pid,pname,brand,ram,rom,processor,battery,price,descrptn from product where pid=?";
      stmt=con.prepareStatement(sql);
      stmt.setInt(1, pid);
	  ResultSet rs=stmt.executeQuery(); 
	  System.out.println("sql:"+stmt.toString());
	  boolean flag=false;
	 // System.out.println(brand);
	  if(rs.next())
		  {  		
		//System.out.println(rs.getInt(1)+ rs.getString(2)+rs.getString(3)+rs.getString(4)+rs.getString(5));

		  temp=new ProductModel(pid, rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getString(9));	
          flag=true;
		  }  
	     closeConnection();	 
	     if(flag==true)
	       return temp;
	     else
	    	 return null;
	  }
	  catch(SQLException e)
	  {	  e.printStackTrace();	 return null; }
	  catch(Exception e)
	  {	  e.printStackTrace();	 return null; }  	  
  }
  public static boolean EditProductByPid(ProductModel temp)
  {
	 	  	  
	  try
	  {
	  getConnection();
      stmt=con.prepareStatement("update product set pname=?,brand=?,ram=?,rom=?,processor=?,battery=?,price=?,descrptn=? where pid=?"); 
      stmt.setInt(9, temp.getPid());
      stmt.setString(1, temp.getPname());
      stmt.setString(2, temp.getBrand());
      stmt.setString(3, temp.getRam());
      stmt.setString(4, temp.getRom());
      stmt.setString(5, temp.getProcessor());
      stmt.setString(6, temp.getBattery());
      stmt.setInt(7, temp.getPrice()); 
      stmt.setString(8,  temp.getDescrptn());
	  System.out.println(stmt.toString());
	  boolean flag=false;
	  int nor=stmt.executeUpdate();
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
  public static boolean deleteProductsByPid(int pid)
  {
	  try
	  {
	  getConnection();
      stmt=con.prepareStatement("delete from product where pid=?"); 
      
      stmt.setInt(1, pid);
    
	  System.out.println(stmt.toString());
	  boolean flag=false;
	  int nor=stmt.executeUpdate();
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
