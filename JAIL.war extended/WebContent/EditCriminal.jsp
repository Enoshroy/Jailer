<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Edit Employee</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<%@ include file='Jailer.jsp' %>

<div class="container">
	<div class="row justify-content-center">
		<div class="col-md-6">
			<h2 class="text-center mb-4"><u>Update Criminal</u></h2>
			<form action="UpdateCriminal" method="post">
				<div class="form-group">
					<label for="name">Criminal Name:</label>
					<input type="text" class="form-control" name="name" value="${crm.name}" readonly>
				</div>
				<div class="form-group">
					<label for="crime">Crime:</label>
					<input type="text" class="form-control" name="crime" value="${crm.crime}" readonly>
				</div>
				<div class="form-group">
					<label for="dateofrealse">Date of Release:</label>
					<input type="text" class="form-control" name="dateofrealse" value="${crm.dateofrealse}">
				</div>
				<div class="form-group">
					<label for="punishmentperiod">Punishment Period:</label>
					<input type="text" class="form-control" name="punishmentperiod" value="${crm.punishmentperiod}">
				</div>
				<div class="form-group">
					<label for="khadhino">Khadhino:</label>
					<input type="text" class="form-control" name="khadhino" value="${crm.khadhino}" readonly>
				</div>
				<button type="submit" class="btn btn-primary btn-block">Update Criminal</button>
			</form>
		</div>
	</div>
</div>

</body>
</html>



