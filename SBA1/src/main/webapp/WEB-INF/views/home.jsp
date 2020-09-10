<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href="${pageContext.request.contextPath}/resources/css/design.css"
    rel="stylesheet">
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
input[type=text] {
 border:2px solid #456879;
	border-radius:10px;
	height: 22px;
	width: 230px;
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
body{
background-size: cover;
}
</style>
</head>
<body background="resources/images/wallpaper.jpg">
<br>
<center>

<div >
<font face="Times New Roman" size="8" color="White">Welcome To FootBall Player Portal</font>
</div>

<div style="background-color: white;width: 550px;height: 430px">
<br>
<form action="createPlayer">
<h3>Fill up the Player Details</h3>
<br>
<font face="Trebuchet MS">Player ID:</font><br><input type="text" name="playerId" placeholder="Enter Player ID" required>
<br><br>
<font face="Trebuchet MS">Name:</font><br><input type="text" name="playerName" placeholder="Enter Player Name" required>
<br><br>
<font face="Trebuchet MS">Team:</font><br>
<select name="playerTeam">
<option value="Fc Barcelona">Fc Barcelona</option>
<option value="Real Madrid">Real Madrid</option>
<option value="Manchester City">Manchester City</option>
<option value="Manchester United">Manchester United</option>
<option value="PSG">PSG</option>
<option value="Juventus">Juventus</option>
<option value="Bayern Munchen">Bayern Munchen</option>
<option value="Liverpool">Liverpool</option>
</select>
<br><br>
<input type="submit" value="create">
</form>
<form action="EditPage">
<input type="submit" value="For More Info">
</form>

</div>
</center>
</body>
</html>
