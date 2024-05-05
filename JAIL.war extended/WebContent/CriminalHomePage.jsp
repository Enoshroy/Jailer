<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Criminal</title>
  <style>h3 {
  display: inline-block;
}</style>
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.2/css/bootstrap.min.css">
</head>
<body bgcolor="lightyellow" text="blue" style= "background-image:url('m.jpg');background-repeat:no-repeat;
		    background-size:cover;">
  <div class="container">
    <% String loginId = (String) session.getAttribute("username");%>
    <h3 class="text-center"style="color:white">Welcome <%= loginId %>!</h3>
    <div class="text-end">
      <form>
        <a class="btn btn-outline-success me-2" href="CriminalHomePage.jsp">Home</a>
        <a class="btn btn-outline-danger" href="login.html">Logout</a>
      </form>
    </div>
   <div class="text-center">
    <h1 style="color:white">Welcome to Criminal Home Page</h1>
    <h3><a class="btn btn-primary mr-3" href="ps">Profile</a></h3>
    <h3><a class="btn btn-primary mr-3" href="GetALLFooditems">Show Food Items</a></h3>
    <h3><a class="btn btn-primary" href="foodList">Cart Food</a></h3>
</div>


  <!-- Bootstrap JS -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.2/js/bootstrap.min.js"></script>
</body>
</html>
