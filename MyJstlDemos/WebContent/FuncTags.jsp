<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
   <%@ taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>Substring:</h4>
<c:set var="string" value="Ronaldo and Messi is the G.O.A.T"/>  
${fn:substring(string, 12, 34)} <br>
<h4>substringBefore:</h4>
<c:set var="string" value="Messi is the best player in the world"/>  
${fn:substringBefore(string, "in")}  <br>
<h4>substringAfter:</h4>
<c:set var="string" value="Lionel Messi"/>  
${fn:substringAfter(string, "Lionel")}  <br>
 <h4>EndsWith function:</h4>
<c:set var="String" value="Welcome to the Football World"/>  
  
<c:if test="${fn:endsWith(String, 'World')}">  
   <p>String ends with World<p>  
</c:if>  
  
<c:if test="${fn:endsWith(String, 'Football')}">  
   <p>String ends with Football<p>  
</c:if>
<h4> StartsWith function:</h4>
<c:set var="String" value="Messi is the best player"/>  
  
<c:if test="${fn:startsWith(String, 'Messi')}">  
   <p>String starts with Messi<p>  
</c:if>  
  
<c:if test="${fn:startsWith(String, 'Best')}">  
   <p>String starts with Best<p>   
</c:if>

<c:set var="string" value="The Greatest player in the world is Messi"/>    
 
<h4>Lower string:</h4>
${fn:toLowerCase(string)}<br>
 
<h4>Upper string:</h4>
${fn:toUpperCase(string)} 
<br>
<h4> Trim Tag:</h4>
<c:set var="str1" value="FC        Barcelona         "/>  
<p>String-1 Length is : ${fn:length(str1)}</p>  
  
<c:set var="str2" value="${fn:trim(str1)}" />  
<p>String-2 Length is : ${fn:length(str2)}</p>  
<p>Final value of string is : ${str2}</p> 

<h4>Formatting of Number:</h4>
<c:set var="Amount" value="10.555" />

<fmt:formatNumber type="number" pattern="##.#" value="${Amount}" />

</body>
</html>