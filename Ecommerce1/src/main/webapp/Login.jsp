<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
<%@ include file="/css/common_cs_js.jsp" %>
</head>
<body>
<%@ include file="/components/NavBar.jsp" %>
<div  class="container text-center d-flex row justify-content-center m-4">
<h2 class="m-3 display-4">Login</h2>
<form action='loginServlet' method="post" class='text-light h-75 w-50 d-flex row justify-content-center p-5 ml-5 border border-dark' style="background-color:rgba(0,0,0,0.5);box-shadow:2px 2px 3px rgba(0,0,0,0.3);border-radius:7px;">
	
		
			<div class="p-4 text-center d-flex row justify-content-center">
				<label class="lead text">Enter Your UserName</label>
				<input type="text" name="username" placeholder="Enter your Username" required class="h-75 w-75"/>
			</div>
			<div class="p-4 text-center d-flex row justify-content-center">
				<label class="lead text">Enter Your Password</label>
				<input type="password" name="password" placeholder="Enter your Password" required class="h-75 w-75"/>
			</div>
			<div class="text-center d-flex justify-content-center">
				<button type="submit" class="p-2 m-4 w-50" style="border-radius:10px;">Submit</button>
				<button type="reset" class="p-2 m-4 w-50"  style="border-radius:10px;">Reset</button>
			</div>
</form>
</div>
</body>
</html>