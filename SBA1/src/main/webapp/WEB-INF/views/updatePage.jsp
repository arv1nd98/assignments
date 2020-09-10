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
input[type=text] {
 border:2px solid #456879;
	border-radius:10px;
	height: 22px;
	width: 230px;
  background-color: #f44336;
  color: white;
}

</style>
</head>
<body>
<center>
<div >
<font face="Trebuchet MS" size="8" color="#f44336">Update Player</font>
</div>
<br>
<div style="background-color: white;width: 550px;height: 440px">
	<br><br>
<form action="searchForUpdate">
<font face="Trebuchet MS">Player ID:</font><br><input type="text" name="playerId" placeholder="Search Player ID" value="${player.playerId}">
<input type="submit" value="Search">

</form>
<br>
<font face="Trebuchet MS">Modify Player By......</font>
<form action="updatePlayer">
<br>
<font face="Trebuchet MS">Name:</font><input type="text" name="playerName" placeholder="Modify Player Name" value="${player.playerName}">
<br>
<br><font face="Trebuchet MS">Team:</font><input type="text" name="playerTeam" placeholder="Modify Player Team" value="${player.playerTeam}">
<br>
<input type="submit" value="Update Player">
</form>
</div>
</center>
</body>
</html>