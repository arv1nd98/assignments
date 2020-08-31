<%@page import="com.attendance.model.Attendance"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>

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

</head>
<body bgcolor="black">
<center>
	<font face="Trebuchet MS" size="6" color="white">Students Attendance Status</font>
</center>
<br>

<table id="students" align="center">
<%



ArrayList<Attendance> attendanceList= (ArrayList<Attendance>)session.getAttribute("attendanceList");


	out.print("<tr> <th> Stud Id </th> <th> Name </th>  <th> Status </th> </tr>");
for(Attendance p:attendanceList)
{
	out.print("<tr>");
	out.print("<td>"+p.getStudId()+"</td>");
	out.print("<td>"+p.getStudName()+"</td>");
	out.print("<td>"+p.getAttendance()+"</td>");
	out.print("</tr>");
}

%>

</table>

</body>
</html>