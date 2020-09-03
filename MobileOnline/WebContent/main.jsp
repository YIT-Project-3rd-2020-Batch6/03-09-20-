<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main page</title>
<link rel="stylesheet" href="./css/main.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link  rel="stylesheet" link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap" >
</head>
<body>
<div class="header">
<div class="menu-bar">
<ul>
<li class="active"><a href="#"><i class="fa fa-home" aria-hidden="true"></i>Home</a></li>

<li><a href="#"><i class="fa fa-android" aria-hidden="true"></i>Android</a>
   <div class="sub-menu-1">
	   <ul>
	      <li><a href="samsung.html">Samsung</a></li>
	      <li><a href="oneplus.html">OnePlus</a></li>
	      <li><a href="motorola.html">Motorola</a></li>
		   <li><a href="xiaomi.html">xiaomi</a></li>
		    <li><a href="realme.html">Realme</a></li>
			<li><a href="vivo.html">Vivo</a></li>
			<li><a href="#">Oppo</a></li>
			<li><a href="#">Huawei</a></li>
	  </ul>
	 </div>
	 </li>

<li><a href="#"><i class="fa fa-apple" aria-hidden="true"></i>IOS</a>
   <div class="sub-menu-1">
	   <ul>
	      <li><a href="#">iphone</a></li>
	  </ul>
	 </div>
	 </li>

<li><a href="cart.jsp"><i class="fa fa-shopping-cart" aria-hidden="true"></i>Cart</a></li>
<li><a href="#"><i class="fa fa-truck" aria-hidden="true"></i>My Order</a></li>
<li><a href="Login.jsp"><i class="fa fa-sign-out" aria-hidden="true"></i>Logout</a></li>
<li><a href="#"><i class="fa fa-info" aria-hidden="true"></i>About us</a>
     <div class="sub-menu-1">
	   <ul>
	      <li><a href="mision.html">Mission</a></li>
	      <li><a href="vision.html">Vision</a></li>
	      <li><a href="#">Team</a></li>
	  </ul>
	 </div>
	 </li>
	 
	 <form class="search-form">
	 <input type="text" placeholder="Search" list="datalist1"/>
	 <datalist id="datalist1">
	 <option value="samsung">
	  <option value="oneplus">
	   <option value="motorola">
	    <option value="xiaomi">
		 <option value="realme">
		  <option value="vivo">
		   <option value="oppo">
		    <option value="huawei">
			 <option value="iphone">
			
	 </datalist>
	 <button>Search</button>
	 </form>

</ul>

</div>
<h1>MobileX Store</h1>
<div class="show">

</div>
<div class="row">
<div class="col-2">
<h1>The World Of Mobiles!</h1>
<p>"If your plans dont include mobile, your plans are not finished"</p>
<a href="Explore.html"class="btn">Explore Now &#8594;</a>
</div>
</div>
</div>

<!---------featured categories-------->
<div class="categories">
<div class="small-container">
<div class="row">
<div class="col-3"><img src="1.jpg"> </div>
<div class="col-3"><img src="2.jpeg"></div>
<div class="col-3"><img src="3.jpg"></div>
</div>
</div>


</div>

</body>
</html>