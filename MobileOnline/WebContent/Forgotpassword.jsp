<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>forgot password form</title>
<link rel="stylesheet" type="text/css" href="./css/frgtstyle.css">
<%@ page import="java.util.*" %>
<body>
<a href="login.jsp" >
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
      <div class="forgotpassword">
      
	  <h1>Forgot password</h1>
	  <%
	  String msg="";
if(request.getAttribute("errormsg")!=null)
{
	msg=(String)request.getAttribute("errormsg");
    out.println("<font color=red size=5>"+msg+"</font>");
}
else
	out.println("<font color=red size=5>"+msg+"</font>");
%>
	  <form action="ForgotServlet" method="get">
	        <p>Userid</P>
			<input type="text" name="userid" id="name" placeholder="Enter Username">
			 <p>Secrect Question</P>
			<select id="secretqsn" name="secretqsn">
			<option>Your birth place?</option>
			<option>your mothers Name?</option>
			<option>Your fathers Name?</option>
			<option>Your childhood best freind Name</option>
			<option>which sports you like to play?</option>
			</select>
			 <p> Answer</P>
			<input type="text" name="secretans" id="name" placeholder=" Secret Question Answer">
			<input type="submit" name="submit" value="Submit">
			
			
	  </form>
	  
      </div>

</body>
</head>
</html>