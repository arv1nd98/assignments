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
<c:forTokens var="players" items="Messi,Ronaldo,Neymar,De Bruyne,Hazard" delims=",">
            <c:out value="${players}"/> <br>
        </c:forTokens>

<br>
<br>

Names of WORLDXI are as follows:<br>

<c:forEach var="name" items="${WorldXI}">
 <c:out  value="${name}"/> <br>
</c:forEach>
</body>
</html>