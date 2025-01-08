<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="./base.jsp"%>
</head>
<body class="bg-dark text-light">

	<!-- Full-page background image with overlay -->
	<div class="position-fixed top-0 start-0 w-100 h-100 bg-image"
		style="background-image: url('<c:url value="/resources/image/product.jpg" />'); background-size: cover; background-position: center; opacity: 0.6;"></div>

	<!-- Product Table Section (Centered on page) -->
	<div
		class="container d-flex justify-content-center align-items-center min-vh-100 position-relative z-index-1">
		<div class="col-md-12">
			<!-- Stylish Welcome Text -->
			<h1 class="text-center mt-3 mb-4 fs-3 fw-bold text-shadow">Welcome
				to Product App</h1>

			<!-- Product Table with Shadow -->
			<table
				class="table table-light table-hover table-bordered text-center shadow">
				<thead class="table-dark text-white">
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Product Name</th>
						<th scope="col">Description</th>
						<th scope="col">Price</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${products}" var="p">
						<tr>
							<th scope="row">TECHONLY${p.id}</th>
							<td>${p.name}</td>
							<td>${p.description}</td>
							<td>${p.price}</td>
							<td><a href="delete/${p.id}" class="text-danger me-3"> <i
									class="bi bi-trash" style="font-size: 1.2em;"></i>
							</a> <a href="update/${p.id}" class="text-primary"> <i
									class="bi bi-pencil" style="font-size: 1.2em;"></i>
							</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

			<!-- Add Product Button with Icon -->
			<div class="text-center mt-4">
				<a href="add-product" class="btn btn-outline-success btn-lg"> <!-- <i class="bi bi-plus-circle"></i> -->
					Add Product
				</a>
			</div>
		</div>
	</div>

	<!-- Footer -->
	<footer class="bg-dark text-center text-white py-3 mt-5">
		<p class="mb-0">© 2025 Product App. All rights reserved.</p>
	</footer>
</body>
</html>
