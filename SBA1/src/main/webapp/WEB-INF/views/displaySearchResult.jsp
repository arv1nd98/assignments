<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
#players {
  font-family: "Trebuchet MS";
  border-collapse: collapse;
  width: 75%;
}
#players td, #players th {
  border: 1px solid #ddd;
  padding: 8px;
}
#players tr:nth-child(even){background-color: #ffffff;}
#players tr:nth-child(odd){background-color: #ffffff;}
#players tr:hover {background-color: #ddd;}
#players th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #000000;
  color: white;
}

</style>

</head>
<body>
<center>
	<font face="Times New Roman" size="6" color="white">Players List</font>
</center>
<br>
<table id="players" align="center">
<tr> <th> Player ID </th> <th> Name </th> <th> Team </th>  </tr>
<c:forEach items="${player}" var="player">
<tr>
<td> ${player.playerId}</td>
<td> ${player.playerName} </td>
<td> ${player.playerTeam} </td>
</tr>
</c:forEach>
</table>

<center>
<form action="home">
<input type="submit" value="Home">
</form>
</center>
</body>
</html>