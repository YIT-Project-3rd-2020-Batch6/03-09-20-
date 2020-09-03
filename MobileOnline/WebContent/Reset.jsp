<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reset password form</title>
<link rel="stylesheet" type="text/css" href="./css/reset.css">
<%@ page import="java.util.*" %>
<%@ page import="MobileController.*" %>
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
      <div class="Reset">
     
	  <h1>Reset Password</h1>
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

	  <form action="ResetServlet">
	  <%
String userid = (String) session.getAttribute("userid");
  out.println("<p>UserID</p>");
  out.println("<input type=text name=userid readonly value='"+userid+"'>");
%>
	        <p>New Password</P>
			<input type="Password" name="newpwd" placeholder="Enter New Password">
			  <p>Confirm New Password</P>
			<input type="Password" name="confirmpwd" placeholder="Confirm New Password">
			<input type ="submit" name="reset" value="Reset">
	  </form>
	  
      </div>

</body>
</head>
</html>