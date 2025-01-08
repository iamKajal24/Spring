<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Error Page</title>
    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa; /* Light gray background */
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }
        .error-container {
            text-align: center;
        }
        .error-links a {
            margin: 0 10px;
            text-decoration: none;
        }
    </style>
</head>
<body>
    <div class="error-container">
        <h1 class="display-1">Oops! Sorry</h1>
        <h2>${msg }</h2>
        <!-- <h3>Something went wrong!!</h3> -->
        <p class="text-muted">Sorry, an error has occurred. Requested page not found.</p>
        <div class="error-actions">
            <a href="#!" class="btn btn-primary">Take me Home</a>
            <a href="/contact-support" class="btn btn-secondary">Contact Support</a>
        </div>
    </div>

    <!-- Bootstrap 5 JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>