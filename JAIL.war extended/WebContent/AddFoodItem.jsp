<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>ADDFOODITEM</title>
	<!-- Bootstrap CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

	<%@ include file="Jailer.jsp" %>
	<br/>

	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<form action="AddFoodServlet" method="post">
					<div class="form-group">
						<label for="foodname">Enter FoodName:</label>
						<input type="text" name="foodname" class="form-control" id="foodname">
					</div>
					<div class="form-group">
						<label for="itemno">Enter itemno:</label>
						<input type="text" name="itemno" class="form-control" id="itemno">
					</div>
					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
		</div>
	</div>

	<!-- Bootstrap JS -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
