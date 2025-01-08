<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Page</title>
<!-- bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
	<!-- <link href="<c:url value='/resources/css/style.css' />" rel="stylesheet" type="text/css"> -->
<!-- <script src="<c:url value='/resources/js/script.js' />"></script> -->

</head>
<body>

<!-- <img alt="my image" src="<c:url value='/resources/image/img1.jpg'></c:url>" width="100" height="100" class="text-center" /> -->


	<div class="container">
	<h1 class="text-center mt-3">This is my Home Page</h1>
		<div class="card mx-auto mt-5 bg-secondary" style="width: 400px">
			<div class="card-body p-5">
				<h3 class="text-center text-white" style="font-style: italic;">My
					Search</h3>
				<form action="search" class="mt-3">
					<div class="form-group">
						<input type="text" name="querybox"
							placeholder="enter your keyword" class="form-control" />
					</div>

					<div class="container text-center">
						<button class="btn btn-outline-light mt-4">Search</button>
					</div>


				</form>

			</div>
		</div>
	</div>








	<!-- js link -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>
</body>
</html>