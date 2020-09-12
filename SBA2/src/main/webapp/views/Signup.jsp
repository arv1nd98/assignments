<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
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
input[type=text], select {
  width: 50%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
</style>



</head>
<body>
<h1>Please Provide your details to register!...</h1>
<form class="form-horizontal" action="display">
<div class="form-group">

<i class="glyphicon glyphicon-user"></i>User Name:<input type="text" name="userName" placeholder="USER NAME">
<br><br><i class="glyphicon glyphicon-user"></i>User Id:<input type="text" name="userId"placeholder="USER ID">
<br><br><i class="glyphicon glyphicon-lock"></i>Password: <input type="password" name="password" placeholder="PASSWORD">
<br><br>SECURITY QUESTION:<select name="security_question">
<option value="-----------------------------">----------------------------------</option>
<option value="Which is your first school?">Which is your first school?</option>
<option value="Which is your birth place?">Which is your birth place?</option>
<option value="Which is your first college?">Which is your first college?</option>
<option value="Which is your first Name?">Which is your first Name?</option>
<option value="Which is your favorite food?">Which is your favorite food?</option>
<option value="Which is your favorite animal?">Which is your favorite animal?</option>
</select><br>
<br><br>Security Answer: <input type="text" name="security_answer" placeholder="SECURITY ANSWER">
<br><br>
<input type="submit" value="SAVE USER" >

</div>
</form>
</body>
</html>