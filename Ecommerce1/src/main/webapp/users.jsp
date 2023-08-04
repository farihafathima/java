<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %> 
<%@ page import="cgg.doa.UserDao" %>  
<%@ page import="cgg.entities.Users" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="/css/common_cs_js.jsp" %>
<title>Users</title>
<style>
.col-md-3:hover {
    background-color: rgba(0, 0, 0, 0.7);
    cursor: pointer;
    transform: scale(1.05); /* You can adjust the scale factor to control the zoom-in effect */
    transition: background-color 0.3s, transform 0.3s;
    border:2px solid black;
  }
  </style>
</head>
<body>
    <%
        String username = (String) session.getAttribute("username");
        String userType = (String) session.getAttribute("userType");
        String password = (String) session.getAttribute("password");
        List<Users> list = UserDao. getAllDetails();
    %>
	<h1 class="display-4 d-flex justify-content-center">Users Details</h1>
    <div class="container">
        <div class="row d-flex justify-content-center">
           
            <% for (Users user : list) { %>
                <div class="col-md-3 my-5 mx-3 py-5 text-center text-light" style="background-color:rgba(0,0,0,0.5)">
                   	<img src="Images/user.png" height="90" width="90">
                    <h1><%= user.getUserName() %></h1>
                    <p>Email: <%= user.getUserEmail() %></p>
                     <p>Phone: <%= user.getUserph()  %></p>
                     <p>Address: <%= user.getUseraddress()  %></p>
                    
                    <!-- Add other properties as needed -->
                </div>
            <% } %>
        </div>
    </div>
</body>
</html>
