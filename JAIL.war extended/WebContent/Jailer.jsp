<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Jailer</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body class="bg-light text-dark" style= "background-image:url('https://www.filmibeat.com/fanimg/movie/20740/jailer-photos-images-79656.jpg');background-size:cover;">

  
  <% String loginId = (String) session.getAttribute("username"); %>
  
  <div class="container">
    <div class="row">
      <div class="col">
        <h3 style="color:Red">Welcome <%= loginId %>!</h3>
      </div>
      <div class="col text-right">
        <a href='Jailer.jsp' class="btn btn-primary mr-2">Home</a>
        <a href='login.html' class="btn btn-danger">Logout</a>
      </div>
    </div>
    
    <div class="text-center mt-5">
      <h1 style="color:Green">Welcome to Jailer Home Page</h1>
      <div class="mt-5">
        <h3>
          <a href='GetAllCrimanalss' class="btn btn-primary mr-2">Get All Criminals</a>
          <a href='InputGetCriminalById.jsp' class="btn btn-primary mr-2">Get Criminal</a>
          <a href='AddFoodItem.jsp' class="btn btn-primary mr-2">Add Food Items</a>
        </h3>
      </div>
    </div>
  </div>
  
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
    integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi4hCE"
    crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
    integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
    crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
    integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
    crossorigin="anonymous"></script>
</body>
</html>
