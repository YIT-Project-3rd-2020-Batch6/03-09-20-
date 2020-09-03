<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add product form</title>
<link rel="stylesheet" type="text/css" href="./css/add.css">
<body>
<a href="admin.jsp" >
      <button style="border:none;
	                outline:none;
	                 height:40px;
	                 background:#fb2525;
	                 color:#fff;
	                 font-size:18px;
					 width:100px;
	                 border-radius:3px;
					 cursor:pointer;
	                ;">Back</button>
        </a>
      <div class="add-product-form">
	  <h1>Add product</h1>
	  
		 <form action="AddProductServlet" method="post">
			<p>Product-id</P>
			<input type="text" name="pid" id="name" placeholder="Product-id">
			<p>Product Name</P>
			<input type="text" name="pname" id="name" placeholder="Product-name">
			<p>Brand</P>
			<input type="text" name="brand" id="name" placeholder="Brand-name">
			<p>Ram</P>
			<input type="radio" id="4gb" name="ram" value="4gb">
            <label for="4gb">4gb</label>
            <input type="radio" id="6gb" name="ram" value="6gb">
            <label for="6gb">6gb</label>
            <input type="radio" id="8gb" name="ram" value="8gb">
            <label for="8gb">8gb</label>
			<input type="radio" id="12gb" name="ram" value="12gb">
            <label for="12gb">12gb</label>
			<p>Rom</P>
			            <input type="radio" id="64gb" name="rom" value="64gb">
                        <label for="64gb">64gb</label>
                        <input type="radio" id="128gb" name="rom" value="128gb">
                        <label for="128gb">128gb</label>
                        <input type="radio" id="256gb" name="rom" value="256gb">
                        <label for="256gb">256gb</label>
			
			<p>Processor</P>
			<select id="pro" name="processor">
			<option>snapdragon 865 plus</option>
			<option>snapdragon 865</option>
			<option>snapdragon 855 plus</option>
			<option>snapdragon 855</option>
			<option>A13 bionic</option>
			<option>A12 bionic</option>
			<option>A11 bionic</option>
			<option>kirin 990</option>
			<option>exynos 990</option>
			</select>
		     <p>Battery</P>
			<select id="bat" name="battery">
			<option>3180mah</option>
			<option>3810mah</option>
			<option>4000mah</option>
			<option>4500mah</option>
			</select>	
			 <p>Price</P>
			<input type="text" name="price" id="name"placeholder=" Product price">
			 <p>Description</P>
			<input type="text" name="descrptn" id="name"placeholder="Product Description">
			
			
			<input type ="submit" name="add" id="sub" value="Add">
			
	  
	  
			
	  </form>
	  
      </div>

</body>
</head>
</html>