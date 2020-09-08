<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Search Directory</title>
<style>
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
<font face="Trebuchet MS" size="8" color="white">Directory</font>
</div>
<br>
<div style="background-color: white;width: 550px;height: 480px">
<br><br>
<form action="viewAllPlayers">
<input type="submit" value="      View All Players      ">
</form>
<br><br>
<font face="Trebuchet MS" size="2">or search by:</font>
<form action="searchPlayerByIdPage">
<input type="submit" value="   Player ID   ">
</form>
<form action="searchPlayerByNamePage">
<input type="submit" value="Player Name">
</form>
<form action="searchPlayerByTeamPage">
<input type="submit" value="     Team     ">
</form>
</div>
</center>
</body>
</html>