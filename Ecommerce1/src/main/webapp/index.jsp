<%@ page import="java.util.List" %> 
<%@ page import="cgg.entities.Category" %>
<%@ page import="cgg.doa.CategoryDoa" %>  
<%@ page import="cgg.doa.ProductDoa" %>  
<%@ page import="cgg.entities.Products" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="/css/common_cs_js.jsp" %>
<title>

</title>
<style>
    /* Add a background color and transition to smoothly animate the hover effect */
    table tr:hover {
        background-color: rgba(0, 0, 0, 0.5);
        transition: background-color 0.3s;
    }

    /* Style the text color and add padding to the table cells */
    table tr:hover td {
        color: white;
        padding: 10px;
    }
</style>
</head>
<body>
	<%@ include file="/components/NavBar.jsp"%>
			<%-- <div class="d-flex align-items-start w-100 h-100">
			<div class="nav flex-column nav-pills me-3" id="v-pills-tab"
				role="tablist" aria-orientation="vertical">
				<button class="nav-link active px-5 my-2" id="allProducts"
					data-bs-toggle="pill" data-bs-target="#v-pills-home" type="button"
					role="tab" aria-controls="v-pills-home" aria-selected="true">Home</button>

				<%
            List<Category> list = CategoryDoa.getCategory();
            for (Category cat : list) {
            %>
				<button class="nav-link px-5 my-2"
					id="v-pills-<%=cat.getCategoryName()%>-tab" data-bs-toggle="pill"
					data-bs-target="#v-pills-<%=cat.getCategoryName()%>" type="button"
					role="tab" aria-controls="v-pills-<%=cat.getCategoryName()%>"
					aria-selected="false"><%=cat.getCategoryName()%></button>
				<%
            }
            %>
			</div>

		</div> --%>
		
			<div class="d-flex align-items-start">
  					<div class="nav flex-column nav-pills me-3" id="v-pills-tab" role="tablist" aria-orientation="vertical">
  						 <button class="nav-link active" id="home" data-bs-toggle="pill" data-bs-target="#home" type="button" role="tab" aria-controls="home" aria-selected="true">Home</button>
							
								<%
				            List<Category> list = CategoryDoa.getCategory();
				            for (Category cat : list) {
				            %>
								<button class="nav-link px-5 my-2"
									id="v-pills-<%=cat.getCategoryName()%>-tab" data-bs-toggle="pill"
									data-bs-target="#<%=cat.getCategoryName()%>" type="button"
									role="tab" aria-controls="v-pills-<%=cat.getCategoryName()%>"
									aria-selected="false"><%=cat.getCategoryName()%></button>
								<%
				            }
				            %>
				     </div>
				      <div class="tab-content" id="v-pills-tabContent">
    						<div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home">
    							<% List<Products> list1 = ProductDoa.getAllProducts(); %>
    								  <% for (Products prod : list1) { %>
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
    						
    						
    						
    						
    						    <div class="tab-pane fade" id="Mobile" role="tabpanel" aria-labelledby="Mobile">
    						       
    						       
    						       
				    		   <% for (Category cat : list) { %>
								            <div class="tab-pane fade" id="<%=cat.getCategoryName()%>" role="tabpanel" aria-labelledby="v-pills-<%=cat.getCategoryName()%>-tab">
								                <% List<Products> categoryProducts =ProductDoa.getProductsByCategory(cat.getCategoryName());
								                for (Products prod : categoryProducts) { %>
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
								                    </div>
								                <% } %>
				    						      </div>
      							  <% } %>  		
    						       		
    						       		
    						    
    						    
    						    </div>
		
		
		
<div class="container"></div>

	<!-- JavaScript for Bootstrap -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"></script>
</body>
</html>
