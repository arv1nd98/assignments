<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
body{
background-size: cover;
}
</style>

</head>
<body background="resources/images/wallpaper.jpg">
<center>
<h4><font face="Times New Roman" size="8" color="white">Please select the required Method</font>
</h4>
<div style="background-color: white;width: 550px;height: 430px">
<br><br>
<form action="updatePage">
<input type="submit" value="Update">
</form>
<form action="searchPage">
<input type="submit" value="  Search   ">
</form>
<form action="deletePage">
<input type="submit" value="     Delete     ">
</form>
<form action="home">
<input type="submit" value="Home">
</form>
</div>
</center>
</body>
</html>