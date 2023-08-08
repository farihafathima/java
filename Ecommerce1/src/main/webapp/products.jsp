<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %> 
<%@ page import="cgg.doa.ProductDoa" %>  
<%@ page import="cgg.entities.Products" %>
<%@ page import="java.io.File" %>
<%@ page import="jakarta.servlet.http.HttpServletRequest" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>
<%@ include file="/css/common_cs_js.jsp" %>
</head>
<body>
<% List<Products> list = ProductDoa.getAllProducts(); %>
<h1 class="display-4 d-flex justify-content-center">Category Details</h1>
    <div class="container">
        <div class="row d-flex justify-content-center">
           
            <% for (Products prod : list) { %>
                <div class="col-md-3 my-5 mx-3 py-5 text-center text-light" style="background-color:rgba(0,0,0,0.5)">
                 <% String path = request.getContextPath() + "/Images/" + prod.getProductPic(); %>
 
                    <img src="<%= path %>" alt="Product Image" style="max-width: 200px; max-height: 200px;">
                   	
                    <h1><%= prod.getProductName() %></h1>
                    <p>Description: <%= prod.getProductDescription() %></p>
                    <p>Product Price: <%= prod.getProductPrice() %> /rs</p>
                    <p>Product Discount: <%= prod.getProductDiscount() %>%</p>
                    <p>Product Quantity: <%= prod.getProductQuantity() %> items</p>
                    <p>Product Category: <%= prod.getProductCategory() %></p>
                    

                    
                </div>
            <% } %>
        </div>
    </div>


</body>
</html>
