<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
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
<font face="Trebuchet MS" size="8" color="white">Welcome To Player Portal</font>
</div>
<div style="background-color: white;width: 550px;height: 430px">
<br><br>
<form action="createPlayerPage">
<input type="submit" value="   Create New Player   ">
</form>
<form action="updatePlayerPage">
<input type="submit" value="Update Existing Player">
</form>
<form action="searchDirectoryPage">
<input type="submit" value="          Directory          ">
</form>
<form action="deleteEntryPage">
<input type="submit" value="     Delete an Entry     ">
</form>
</div>
</center>
</body>
</html>