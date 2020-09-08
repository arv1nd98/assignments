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
<body bgcolor="black">
<br>
<center>
<div style="background-color: black">
<font face="Trebuchet MS" size="8" color="white">Search By ID</font>
</div>
<div style="background-color: white;width: 550px;height: 450px">
<br><br><br>
<font face="Trebuchet MS" size="5">Enter Player ID</font>

<form action="searchPlayerById">
<br>
<input type="text" name="playerId" placeholder="Enter Player ID between 101 - 124">
<br>
<input type="submit" value="Search">
</form>
</div>
</body>
</html>