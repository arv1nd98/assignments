<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  
   pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="${'hello welcome to jstl world'}"/>


<c:set var="age" scope="session" value="20"/>

<c:if test="${age > 15}">
age is more than 15
</c:if>
<br>
----------------------------------
<br>
<br>
below is the result of c:choose
<br>


<c:choose>

<c:when test="${age > 20}"> age > 20 </c:when>

<c:when test="${age > 25}"> age > 25 </c:when>

<c:otherwise> else less < = 20 </c:otherwise>

</c:choose>

</body>
</html>