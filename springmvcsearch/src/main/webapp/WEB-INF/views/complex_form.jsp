<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Bootstrap Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body class="bg-light">

	<div class="container mt-3">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<div class="card">
					<div class="card-header bg-primary text-white text-center">
						<h4>Complex Form</h4>
					</div>
					<!-- error -->
					<div class="alert alert-danger" role="alert">
					<form:errors path="student.*" />	
					</div>
					<!-- error end -->
					<div class="card-body">
						<form action="handleform" method="post">
							<div class="mb-3">
								<label for="name" class="form-label">Your Name</label> <input
									type="text" class="form-control" id="name" name="name"
									placeholder="Enter Name">
							</div>
							<div class="mb-3">
								<label for="id" class="form-label">Your ID</label> <input
									type="text" class="form-control" id="id" name="id"
									placeholder="Enter ID">
							</div>
							<!--   <div class="mb-3">
                                <label for="dob" class="form-label">Your DOB</label>
                               <input type="text" class="form-control" id="dob" name="date" placeholder="dd/MM/yyyy">
                            </div>  -->
							<div class="mb-3">
								<label for="courses" class="form-label">Select Course</label> <select
									name="course" class="form-select" id="courses" multiple>
									<option>Java</option>
									<option>Python</option>
									<option>C++</option>
									<option>Hibernate</option>
									<option>Spring Framework</option>
								</select>
							</div>
							<div class="mb-3">
								<label class="form-label">Select Gender</label>
								<div class="form-check">
									<input class="form-check-input" type="radio" name="gender"
										id="male" value="male" checked> <label
										class="form-check-label" for="male">Male</label>
								</div>
								<div class="form-check">
									<input class="form-check-input" type="radio" name="gender"
										id="female" value="female"> <label
										class="form-check-label" for="female">Female</label>
								</div>
							</div>
							<div class="mb-3">
								<label for="type" class="form-label">Select Type</label> <select
									class="form-select" name="type" id="type">
									<option value="oldstudent">Old Student</option>
									<option value="normalstudent">Normal Student</option>
								</select>
							</div>

							<div class="card">
								<div class="card-body">
									<p>Your address</p>
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="enter your street" name="address.street" />
									</div>
									<div class="form-group mt-2">
										<input type="text" class="form-control"
											placeholder="enter your city" name="address.city" />
									</div>
								</div>
							</div>

							<div class="text-center mt-3">
								<button type="submit" class="btn btn-primary w-100">Submit</button>
							</div>
						</form>
					</div>
					<div class="card-footer text-center text-muted">&copy; 2025
						Complex Form. All rights reserved.</div>
				</div>
			</div>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>
