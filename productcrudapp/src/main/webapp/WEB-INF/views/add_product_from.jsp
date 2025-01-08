<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <%@ include file="./base.jsp"%>
    <style>
        .text-shadow {
            text-shadow: 1px 1px 3px rgba(0, 0, 0, 0.5);
        }
    </style>
</head>
<body class="bg-dark text-light">
    <!-- Full-page background with overlay -->
    <div class="position-fixed top-0 start-0 w-100 h-100 bg-image"
        style="background-image: url('<c:url value="/resources/image/product.jpg" />'); background-size: cover; background-position: center; opacity: 0.6;"></div>

    <!-- Form Section -->
    <div class="container d-flex justify-content-center align-items-center min-vh-100 position-relative z-index-1">
        <div class="bg-white rounded shadow p-4 col-12 col-md-8 col-lg-6">
            <h1 class="text-center mb-4 text-secondary">Fill the Product Details</h1>
            <form action="handle-product" method="post">

                <div class="mb-3 ">
                    <label for="name" class="form-label">Product Name</label>
                    <input type="text" class="form-control border border-primary border border-2" id="name" name="name" placeholder="Enter the product name here">
                </div>

                <div class="mb-3">
                    <label for="description" class="form-label">Product Description</label>
                    <textarea class="form-control border border-primary border border-2" id="description" name="description" rows="4" placeholder="Enter the product description"></textarea>
                </div>

                <div class="mb-3">
                    <label for="price" class="form-label">Price</label>
                    <input type="text" class="form-control border border-primary border border-2" id="price" name="price" placeholder="Enter product price">
                </div>

                <div class="text-center">
                    <a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger me-3">Back</a>
                    <button type="submit" class="btn btn-primary">Add</button>
                </div>
            </form>
        </div>
    </div>
</body>
</html>
