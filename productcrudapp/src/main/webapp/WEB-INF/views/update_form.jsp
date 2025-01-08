<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <%@ include file="./base.jsp"%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-dark text-light">
<div class="position-fixed top-0 start-0 w-100 h-100 bg-image"
        style="background-image: url('<c:url value="/resources/image/product.jpg" />'); background-size: cover; background-position: center; opacity: 0.6;"></div>

    <div class="container mt-5 d-flex justify-content-center align-items-center min-vh-100 position-relative z-index-1">
        <div class="col-lg-6 col-md-8 col-sm-10 bg-white rounded shadow p-4">
            <h1 class="text-center mb-4 fw-bold text-dark">Change Product Details</h1>
            <form action="${pageContext.request.contextPath }/handle-product" method="post">
                <input type="hidden" name="id" value="${product.id}" />

                <div class="mb-3">
                    <label for="name" class="form-label">Product Name</label>
                    <input type="text" class="form-control" id="name" name="name" 
                           placeholder="Enter the product name here" value="${product.name}" required>
                </div>

                <div class="mb-3">
                    <label for="description" class="form-label">Product Description</label>
                    <textarea class="form-control" id="description" name="description" 
                              rows="4" placeholder="Enter the product description" required>${product.description}</textarea>
                </div>

                <div class="mb-3">
                    <label for="price" class="form-label">Price</label>
                    <input type="text" class="form-control" id="price" name="price" 
                           placeholder="Enter product price" value="${product.price}" required>
                </div>

                <div class="text-center">
                    <a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger me-2">Back</a>
                    <button type="submit" class="btn btn-primary">Update</button>
                </div>
            </form>
        </div>
    </div>
</body>
</html>
