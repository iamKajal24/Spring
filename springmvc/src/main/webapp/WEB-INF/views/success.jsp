<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Success Page</title>
</head>
<body>

<h1>${Header }</h1>
<p>${Description }</p>

<h1 style="color:green">${message }</h1>
    
    <h1>Welcome, ${user.username }</h1>
    <h1>Your email address is: ${user.email }</h1>
    <h1>Your password is: ${user.password }. Try to secure it!</h1>

</body>
</html>
