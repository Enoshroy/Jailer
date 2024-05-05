<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.List, com.dto.Criminal" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>GetAllEmployees</title>
    <!-- Link to Bootstrap CSS file -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
    <jsp:include page="Jailer.jsp" />

    <div class="container mt-5">
        <table class="table table-striped">
            <thead class="bg-primary text-white">
                <tr>
                    <th>Criminal Name</th>
                    <th>Crime</th>
                    <th>Date of Release</th>
                    <th>Punishment Period</th>
                    <th>Khadhino</th>
                    <th colspan="2">Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="emp" items="${empList}">
                    <tr class="table-light">
                        <td>${ emp.name   }</td>
                        <td>${ emp.crime }</td>
                        <td>${ emp.dateofrealse  }</td>
                        <td>${ emp.punishmentperiod  }</td>
                        <td>${ emp.khadhino }</td>
                        <td><a href="EditCriminal?Khadhino=${emp.khadhino}" class="btn btn-sm btn-primary">Edit</a></td>
                        <td><a href="DeleteCriminal?Khadhino=${emp.khadhino}" class="btn btn-sm btn-danger">Delete</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <!-- Link to Bootstrap JS file -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
