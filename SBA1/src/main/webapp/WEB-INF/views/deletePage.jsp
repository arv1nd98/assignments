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
input[type=text]{
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
<div>
<font face="Trebuchet MS" size="5">Enter Player ID</font>
<form action="deletePlayerById">
<br>
<input type="text" name="playerId" placeholder="Enter Player ID" required>
<br>
<input type="submit" value="Delete">
</form>
<br><br><br>
<font face="Trebuchet MS" size="5">Enter Player Name</font>
</div>
<div>
<form action="deletePlayerByName">
<br>
<input type="text" name="playerName" required>
<br>
<input type="submit" value="Delete">
</form>





</div>
</body>
</html>