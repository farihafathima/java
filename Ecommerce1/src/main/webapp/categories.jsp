<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ page import="java.util.List" %> 
<%@ page import="cgg.doa.CategoryDoa" %>  
<%@ page import="cgg.entities.Category" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="/css/common_cs_js.jsp" %>
<title>Categories</title>
</head>
<body>
<% List<Category> list=CategoryDoa.getCategory(); %>
<h1 class="display-4 d-flex justify-content-center">Cateroty Details</h1>
    <div class="container">
        <div class="row d-flex justify-content-center">
           
            <% for (Category cat : list) { %>
                <div class="col-md-3 my-5 mx-3 py-5 text-center text-light" style="background-color:rgba(0,0,0,0.5)">
                   	
                    <h1><%= cat.getCategoryName()%></h1>
                    <p><%= cat.getCategoryDescription() %></p>

                    
                </div>
            <% } %>
        </div>
    </div>

</body>
</html>