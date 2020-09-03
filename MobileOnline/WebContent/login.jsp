<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
<link rel="stylesheet" type="text/css" href="./css/login.css">
</head>
<body>
 <%@ page import="java.util.*" %>

 <div class="loginbox">
      <img src="images/img.jpg" class="image">
	  <h1>Login</h1>
	  <%
	  String msg="";
if(request.getAttribute("errormsg")!=null)
{
	msg=(String)request.getAttribute("errormsg");
    out.println("<font color=red size=5>Worng userid and password</font>");
}
else
	out.println("<font color=red size=5>"+msg+"</font>");
%>
	  <form action="LoginServlet" method="get"  >
	        <p>Userid</P>
			<input type="text" name="userid" placeholder="Enter Userid" required="required">
			  <p>Password</P>
			<input type="Password" name="password" placeholder="Enter Password" required="required">
			<input type ="submit" name="" value="Login">
			<a href="Forgotpassword.jsp">Forgot Password?</a><br>
			<a href="signup.jsp">Sign up</a>
	  </form>
	  
      </div>

</body>
</html>