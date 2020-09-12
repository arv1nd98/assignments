<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="/css/main.css" type="text/css">
  

<title>Login Page</title>
<style>
input[type=submit] {
font-family: Trebuchet MS;
 background-color: white; 
  color: black; 
  border: 2px solid #f44336;
text-decoration: none;
color: black;
padding: 10px 60px;
margin: 20px 20px;
cursor: pointer;
}
input[type=submit]:hover {
background-color: #f44336;
  color: white;
}

</style>
</head>
<body >
<center>

<h3>Welcome To National Stock Exchange Ltd.</h3>
<br>
<div style="background-color: white;width: 550px;height: 430px">

<form action="validateUser">
<br>
<i class="glyphicon glyphicon-user"></i>User Id: <input type="text"  required name="userId" placeholder="Enter your UserId" >
<br>

<br>
<i class="glyphicon glyphicon-user"></i>User Name: <input type="text"  name="userName" placeholder="Enter your UserName">
<br>

<br>
<i class="glyphicon glyphicon-lock"></i>Password: <input type="password"  name="password" placeholder="Enter ur password">
<br>


<input type="submit" value="Login"  >
</form>
<br><br>
<p><a href="ForgotPassword" class="text-danger">Forgot Password</a></p>
<form action="New User">
<input type="submit" value="Sign up">
</form>
</div>
</center>
</body>
</html>