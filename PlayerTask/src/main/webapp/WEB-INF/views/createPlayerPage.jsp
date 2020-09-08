<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Create Player</title>

</head>
<body bgcolor="black">
<br>
<center>
<div style="background-color: black">
<font face="Trebuchet MS" size="8" color="white">Welcome To Player Portal</font>
</div>
<div style="background-color: white;width: 550px;height: 450px">
<br>
<font face="Trebuchet MS" size="5">Fill the details to create player</font>

<form action="createPlayer">
<br>
<font face="Trebuchet MS">Player ID:</font><br><input type="text" name="playerId" placeholder="Enter Player ID">
<br><br>
<font face="Trebuchet MS">Name:</font><br><input type="text" name="playerName" placeholder="Enter Player Name">
<br><br>
<font face="Trebuchet MS">Team:</font><br>
<select name="playerTeam">
<option value="FC Barecelona">FC Barcelona</option>
<option value="Real Madrid">Real Madrid</option>
<option value="Manchester City">Manchester City</option>
<option value="Manchester United">Manchester United</option>
<option value="PSG">PSG</option>
<option value="Juventus">Juventus</option>
<option value="Bayern Munchen">Bayern Munchen</option>
<option value="Liverpool">Liverpool</option>
</select>
<br><br>
<input type="submit" value="Create">
</form>


</div>
</center>
</body>
</html>