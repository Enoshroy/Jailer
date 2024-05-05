<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.dto.Criminal"%>
	
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
  /* Custom CSS */
  body {
    background-color: #f0f0f0;
  }
  table {
    background-color: #fff;
  }
  th {
    background-color: #007bff;
    color: #fff;
  }
  td {
    background-color: #f7f7f7;
  }
</style>
</head>
<body>
<jsp:include page="CriminalHomePage.jsp" />

<div class="container mt-5">
  <table class="table table-bordered">
    <thead class="thead-dark">
      <tr>
        <th>Criminal Name</th>
        <th>Crime</th>
        <th>Year of Release</th>
        <th>Punishment Period</th>
        <th>Khadhi No</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${cr.name}</td>
        <td>${cr.crime}</td>
        <td>${cr.dateofrealse}</td>
        <td>${cr.punishmentperiod}</td>
        <td>${cr.khadhino}</td>
      </tr>
    </tbody>
  </table>
</div>

<!-- Bootstrap JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>

