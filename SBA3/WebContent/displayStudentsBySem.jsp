<%@page import="com.attendance.model.Students"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students By Semester</title>

<style>

#students {
  font-family: "Trebuchet MS";
  border-collapse: collapse;
  width: 75%;
}

#students td, #students th {
  border: 1px solid #ddd;
  padding: 8px;
}

#students tr:nth-child(even){background-color: #ffffff;}
#students tr:nth-child(odd){background-color: #ffffff;}

#students tr:hover {background-color: #ddd;}

#students th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #000000;
  color: white;
}
</style>

<style>
/* The container */
.container {
  display: block;
  position: relative;
  padding-left: 35px;
  margin-bottom: 12px;
  cursor: pointer;
  font-family: "Trebuchet MS";
  font-size: 18px;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}

/* Hide the browser's default checkbox */
.container input {
  position: absolute;
  opacity: 0;
  cursor: pointer;
  height: 0;
  width: 0;
}

/* Create a custom checkbox */
.checkmark {
  position: absolute;
  top: 0;
  left: 0;
  height: 25px;
  width: 25px;
  background-color: #eee;
}

/* On mouse-over, add a grey background color */
.container:hover input ~ .checkmark {
  background-color: #ccc;
}

/* When the checkbox is checked, add a blue background */
.container input:checked ~ .checkmark {
  background-color: #2196F3;
}

/* Create the checkmark/indicator (hidden when not checked) */
.checkmark:after {
  content: "";
  position: absolute;
  display: none;
}

/* Show the checkmark when checked */
.container input:checked ~ .checkmark:after {
  display: block;
}

/* Style the checkmark/indicator */
.container .checkmark:after {
  left: 9px;
  top: 5px;
  width: 5px;
  height: 10px;
  border: solid white;
  border-width: 0 3px 3px 0;
  -webkit-transform: rotate(45deg);
  -ms-transform: rotate(45deg);
  transform: rotate(45deg);
}
</style>

<style>
         input[type=submit] {
            background-color: white;
            border: none;
            text-decoration: none;
            color: black;
            padding: 10px 60px;
            margin: 20px 20px;
            cursor: pointer;
         }
      </style>

</head>
<body bgcolor="black">
<br><br><br>
<form action="markAttendVal">

<center>
	<font face="Trebuchet MS" size="6" color="white">Mark the Attendance</font>
</center><br>

<table id="students" align="center">

<tr> <th> Stud Id </th> <th> Name </th>  <th> Select </th> </tr>
<%

ArrayList<Students> studentlList=(ArrayList<Students>)session.getAttribute("studentList");

for(Students p:studentlList)
{
	out.print("<tr>");
	out.print("<td>"+p.getStudId()+"</td>");
	out.print("<td>"+p.getStudName()+"</td>");
	out.print("<td> <label class='container'>Mark<input type='checkbox' name='status' value='"+p.getStudId()+"'> <span class='checkmark'></span></label></td>");
	out.print("</tr>");
}

%>

</table>
<center>

<input type="submit" style="font-family: Trebuchet MS;">
</center>
</form>
</body>
</html>