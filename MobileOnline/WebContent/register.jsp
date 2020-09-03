<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>sign Up form</title>
<link rel="stylesheet" type="text/css" href="./css/signup.css">
<body>
  <div class="sign-up-form">
	  <h1>Sign Up</h1>
	  <form action="RegisterServlet" method="get">
	        <p>Userid</P>
			<input type="text" name="userid" id="name" placeholder="Enter Username" required="required">
			<p>Name</P>
			<input type="text" name="name" id="name" placeholder="Enter Username" required="required">			
			<p>Gender</P>
			<input type="radio" id="male" name="gender" value="male" required="required">
            <label for="male">Male</label>
            <input type="radio" id="female" name="gender" value="female" required="required">
            <label for="female">Female</label>
            <input type="radio" id="other" name="gender" value="other" required="required">
            <label for="other">Other</label>
			<p>Email</P>
			<input type="Email" name="email" id="name" placeholder="Enter Email" required="required">
			<p>Password</P>
			<input type="Password" name="password" id="name" placeholder="Enter Password" required="required">
			  <p>Phone Number</P>
			<select id="ph">
			<option>+91</option>
			<option>+92</option>
			<option>+93</option>
			<option>+94</option>
			<option>+95</option>
			</select>
			<input type="Number" name="phno" id="num" placeholder="Enter Phone Number">
			 <p>Secrect Question</P>
			<select id="secretquestion" name="secretqsn">
			<option>Your birth place?</option>
			<option>your mothers Name?</option>
			<option>Your fathers Name?</option>
			<option>Your childhood best freind Name</option>
			<option>which sports you like to play?</option>
			</select>
			 <p>Secret Answer</P>
			<input type="text" name="secretans" id="name"placeholder=" Secrect Question Answer">
			 <p>Address</P>
			<input type="text" name="address" id="name"placeholder="Enter Address">
			
			
			<input type ="submit" name="sub" id="sub" value="Sign Up">
			
	  </form>
      </div>

</body>
</head>
</html>