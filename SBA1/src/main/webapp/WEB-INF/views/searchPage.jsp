<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

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
body{
background-size: cover;
}
</style>
</head>
<body>
<div style="background-color: white;width: 550px;height: 480px">
<br><br>
<font face="Times New Roman" size="6"> To View All Players</font>

<form action="viewAllPlayers">
<input type="submit" value="      View All Players      ">
</form>
<br><br>
<font face="Times New Roman" size="6"> Search by:</font>
<div>
<br><br><br>
<font face="Times New Roman" size="6">Enter Player ID</font>

<form action="searchPlayerById">
<br>
<input type="text" name="playerId" placeholder="Enter Player ID ">
<br>
<input type="submit" value="Search">
</form>
</div>

<font face="Times New Roman" size="6" color="#f44336">Select a Team</font>
<div style="background-color: white;width: 550px;height: 200px">
	<br><br><br>
<form action="searchPlayerByTeam">
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
<input type="submit" value="Search">
</form>

<form action="home">
<input type="submit" value="Home">
</form>

</div>



</body>
</html>