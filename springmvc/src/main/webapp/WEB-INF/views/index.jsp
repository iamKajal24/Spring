<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>

	<h1>This is spring Mvc Page</h1>
	<%
	String name = (String) request.getAttribute("name");
	int id = (Integer) request.getAttribute("phone number");
	List<String> friends = (List<String>) request.getAttribute("friends");
	%>
	<h1>Name is <%=name%></h1>
	<h1>Phone number <%=id%></h1>
	<!-- <h1>All Friends <%=friends %></h1> -->

		<%

            for (String friend : friends) 
            {
         %>
	     	<h1><%= friend %></h1>
		 <%
             }
          %>
</body>
</html>