<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<!-- Include Bootstrap 5 CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container text-center mt-4 p-5">
        <!-- Change button type to submit and add name attribute for input -->
        <form class="form-inline d-flex justify-content-center" action="welcome" method="post">
            <button type="submit" class="btn btn-outline-primary me-2">Say Hello !</button>
            <input type="text" name="user" class="form-control w-25" placeholder="Type here...">
        </form>
    </div>
    <!-- Include Bootstrap 5 JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
