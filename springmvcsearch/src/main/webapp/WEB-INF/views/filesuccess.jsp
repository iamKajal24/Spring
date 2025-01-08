<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>uploaded images</title>
</head>
<body>

<h1>${msg }</h1>

<img alt="my image" src="<c:url value='/resources/image/${filename }'></c:url>" width="400" height="400" class="text-center" />

</body>
</html>