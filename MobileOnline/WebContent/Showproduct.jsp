<%@page import="MobileModel.ProductModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.*" %>
 <%@ page import="MobileModel.*" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css" href="./css/add.css">
</head>

 
<body>
<form name=show action="ShowProductServlet" method="get">
<div>

<div class="dropdown" >
<p align=center>
  <label  id="text">Choose Brand  :</label>
  <select id="category" name="category">
  <option value="Select">Select</option>
 
  <%
  String list="";
 
  if(request.getAttribute("allbrand")!=null)
   { 
	 
	   ArrayList<String> allBrand=(ArrayList<String>)request.getAttribute("allbrand");
	  
	   for(String val: allBrand)
	   {
		   list=list+"<option>"+val+"</option>";
	   }
	   
   }
  out.println(list);
  
  
  
  %>
  
</select>

<input type=submit value=Submit name=catg></p>
 
 
  
  
    <br><br>
</div>

<div>
<table id="products">
  <tr>
    <th>pid</th>
    <th>pname</th>
    <th>brand</th>
    <th>ram</th>
    <th>rom</th>
    <th>processor</th>
    <th>battery</th>
    <th>price</th>
    <th>descrptn</th>
  </tr>
 <%
 
 String record="";
 if(request.getAttribute("allProducts")!=null)
 { 
  ArrayList<ProductModel> allProduct=(ArrayList<ProductModel>)request.getAttribute("allProducts");   
   for(ProductModel s: allProduct)
    {  
 	   record=record+"<tr>";
 	   record=record+"<td>"+s.getPid()+"</td><td>"+s.getPname()+"</td><td>"+s.getBrand()+"</td><td>"+s.getRam()+"</td><td>"+s.getRom()+"</td><td>"+s.getProcessor()+"</td><td>"+s.getBattery()+"</td><td>"+s.getPrice()+"</td><td>"+s.getDescrptn()+"</td>"; 	   
 	   record=record+"<td><input type=checkbox name=choose value='"+s.getPid()+"'></td>";
 	   record=record+"<td><input type=Radio name=choose value='"+s.getPid()+"'></td>";
 	   record=record+"<td><a href='EditServlet?oper=edit&pid="+s.getPid()+"'>Edit</a></td>";
 	   record=record+"<td><a href='DeleteServlet?oper=delete&pid="+s.getPid()+"'>Delete</a></td>";
 	   record=record+"</tr>";
    }
 }
 out.println(record);
 
 
 
 
 %> 
 

   
  </tr>
  
</table>
<br><br>
</p>
</div>
</form>
</body>
</html>
</body>
</html>