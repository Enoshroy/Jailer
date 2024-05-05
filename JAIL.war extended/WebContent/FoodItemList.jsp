<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List, com.dto.Criminal"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Food Items</title>
	<!-- Bootstrap CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<!-- Custom CSS -->
	<style>
		table {
			margin-top: 20px;
			border-collapse: collapse;
			width: 100%;
			text-align: center;
			color: #333;
			font-size: 16px;
			border: 1px solid #ccc;
		}

		th, td {
			padding: 10px;
			border: 1px solid #ccc;
		}

		th {
			background-color: #007bff;
			color: #fff;
			font-weight: bold;
			text-align: center;
			vertical-align: middle;
		}

		tr:nth-child(even) {
			background-color: #f2f2f2;
		}

		a {
			color: #007bff;
			text-decoration: none;
		}

		a:hover {
			color: #0056b3;
			text-decoration: underline;
		}
	</style>
</head>
<body>

	<jsp:include page="CriminalHomePage.jsp" />

	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<table>
					<thead>
						<tr>
							<th>Food Items Name</th>
							<th>Item Number</th>
							<th>Actions</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="emp" items="${foodList}">
							<tr>
								<td>${ emp.foodnames }</td>
								<td>${ emp.itemno }</td>
								<td><a href='CartServlet?foodnames=${emp.foodnames}' class="btn btn-primary">Add to Cart</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>

	<!-- Bootstrap JS -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>

