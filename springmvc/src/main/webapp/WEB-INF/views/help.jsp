<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@page isELIgnored="false" %>
	
	<!-- jst uri -->
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>help page</title>
</head>
<body>


	<!-- <%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("Rollno");
	LocalDateTime time = (LocalDateTime) request.getAttribute("DateAndTime");
	%> -->

	<!-- <h1>Name : <%=name%></h1>
	<h1>Roll no :<%=id%></h1>
	<h1>This is help page</h1>
	<h1>Date and Time : <%=time %></h1> -->
	
	<!-- or -->
	<h2>NAME : ${name}</h2>
	<h2>Roll Number : ${Rollno}</h2>
	<h2>Time : ${DateAndTime}</h2>
	<!-- list -->
	
	<c:forEach var="item" items="${marks}">
	   <h1>Marks: ${item}</h1>
	</c:forEach>

</body>
</html>