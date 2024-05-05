<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add to Cart</title>
    <!-- Add Bootstrap CDN link for styling -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>

<jsp:include page="CriminalHomePage.jsp" />

<div class="container">
    <h1>Food Items</h1>
    <table class="table">
        <thead>
            <tr>
                <th>Food Name</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="item" items="${List}">
                <tr>
                    <td>${item.foodnames}</td>
                    <td>
                        
                        <form action="order.jsp" method="post">
                            <input type="hidden" name="foodId">
                            <button type="submit" class="btn btn-success">Order</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<!-- Add Bootstrap CDN script for JS -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
