<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Player Created</title>
<style>
input[type=submit] {
font-family: Trebuchet MS;
background-color: white;
border-color: white;
border-width: 2px solid black;
text-decoration: none;
color: black;
padding: 10px 60px;
margin: 20px 20px;
cursor: pointer;
}
input[type=submit]:hover {
background-color: black;
color: white;
}
</style>
</head>
<body bgcolor="black">
<center>
<br><br><br><br>
<font face="Trebuchet MS" size="6" color="white"><b>Player Created Successfully...!</b></font>
<br><br>
<form action="home">
<input type="submit" value="Home">
</form>

</center>
</body>
</html>