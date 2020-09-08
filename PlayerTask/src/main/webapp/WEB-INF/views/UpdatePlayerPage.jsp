<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Update Player</title>
<style type="text/css">
input[type=text], select {
  width: 50%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=submit] {
font-family: Trebuchet MS;
background-color: black;
border-color: black;
border-width: 2px solid black;
text-decoration: none;
color: white;
padding: 10px 60px;
margin: 20px 20px;
cursor: pointer;
}
input[type=submit]:hover {
background-color: white;
color: black;
}
</style>

</head>
<body bgcolor="black">
<br>
<center>
<div style="background-color: black">
<font face="Trebuchet MS" size="8" color="white">Update Existing Player</font>
</div>
<br>
<div style="background-color: white;width: 550px;height: 440px">
	<br><br>
<form action="searchForUpdate">
<font face="Trebuchet MS">Player ID:</font><br><input type="text" name="playerId" placeholder="Search Player ID" value="${player.playerId}">
<input type="submit" value="Search">

</form>
<br>
<font face="Trebuchet MS">Modify Player Name / Player Team</font>
<form action="updatePlayer">
<br>
<font face="Trebuchet MS">Name:</font><input type="text" name="playerName" placeholder="Modify Player Name" value="${player.playerName}">
<br>
<br><font face="Trebuchet MS">Team:</font><input type="text" name="playerTeam" placeholder="Modify Player Team" value="${player.playerTeam}">
<br>
<input type="submit" value="Update Player">
</form>
</div>
</body>
</html>