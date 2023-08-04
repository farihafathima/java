<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
 rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"/>
</head>
<body>
<div class="container p-3 text-center">
<img src="images/error1.jpg" class="image-fluid"/>
<h1 class="display-3">Sorry !Something went wrong</h1>
<p><%= exception %></p>
<a class="btn btn-outline-primary mt-3">Home</a>
</div>

</body>
</html>