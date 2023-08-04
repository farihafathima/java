<%@ page import="java.util.List" %> 
<%@ page import="cgg.doa.UserDao" %>  
<%@ page import="cgg.entities.Users" %>
<%@ page import="cgg.doa.CategoryDoa" %>  
<%@ page import="cgg.entities.Category" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AdminDashboard</title>
<%@ include file="/css/common_cs_js.jsp" %>
<style>
  /* CSS for the hover effect */
  .col-md-3:hover {
    background-color: rgba(0, 0, 0, 0.7);
    cursor: pointer;
    transform: scale(1.05); /* You can adjust the scale factor to control the zoom-in effect */
    transition: background-color 0.3s, transform 0.3s;
    border:2px solid black;
  }
  button:hover{
    cursor: pointer;
    transform: scale(1.05); /* You can adjust the scale factor to control the zoom-in effect */
    transition: background-color 0.3s, transform 0.3s;
    box-shadow:2px 2px 5px black;
  }
</style>
</head>
<body>
<%@ include file="/components/NavBar.jsp" %>
<div class="container ">
	<h1 class="display-3 d-flex row justify-content-center">Admin DashBoard</h1>
	
  <div class="row d-flex justify-content-center p-2">
    <div class="col-md-3 my-5 mx-3 py-5 text-center" style="background-color:rgba(0,0,0,0.5)">
    <a href="users.jsp"  style="text-decoration:none; color:black">
    <img alt="image not available" src="Images/users.png">
      <h1>Users</h1>
      <%List<Users> list = UserDao. getAllDetails(); %>
     	<h1><%=list.size() %></h1>
      </a>
    </div>
    <div class="col-md-3 my-5 mx-3 py-5 text-center" style="background-color:rgba(0,0,0,0.5)">
    <a href="categories.jsp" style="text-decoration:none; color:black">
     <img alt="image not available" src="Images/lists.png">
      <h1>Category</h1>
      </a>
    </div>

    <div class="col-md-3 my-5 mx-3 py-5 text-center" style="background-color:rgba(0,0,0,0.5)">
    <a href="products.jsp"  style="text-decoration:none; color:black">
     <img alt="image not available" src="Images/products.png">
      <h1>Products</h1>
      </a>
    </div>

   <div class="col-md-3 my-5 mx-3 py-5 text-center" style="background-color:rgba(0,0,0,0.5)">
    <img alt="image not available" src="Images/add_users.png">
    <h1>Add User</h1>
    	<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#addUser" data-bs-whatever="@getbootstrap">Add User</button>
    </div>
   

    <div class="col-md-3 my-5 mx-3 py-5 text-center" style="background-color:rgba(0,0,0,0.5) ">
    <img alt="image not available" src="Images/add_categories.png" height="70" width="70">
      <h1>Add Categories</h1>
     
      <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#addCategory" data-bs-whatever="@getbootstrap">Add Category</button>
     
    </div>

    <div class="col-md-3 my-5 mx-3 py-5 text-center" style="background-color:rgba(0,0,0,0.5)">
    <img alt="image not available" src="Images/plus.png">
      <h1>Add Products</h1>
       <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#addProduct" data-bs-whatever="@getbootstrap">Add Product</button>
     
    </div>
  </div>

</div>
<div class="modal fade" id="addUser" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Add User</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <form action="AddUser"  method="post">
          <div class="mb-3">
            <label for="recipient-name" class="col-form-label">Enter UserName</label>
            <input type="text" class="form-control" id="recipient-name"  name="username">
          </div>
          <div class="mb-3">
            <label for="recipient-name" class="col-form-label">Enter Email</label>
            <input type="text" class="form-control" id="recipient-name" name="email">
          </div>
          <div class="mb-3">
            <label for="recipient-name" class="col-form-label">Enter PassWord</label>
            <input type="text" class="form-control" id="recipient-name" name="password">
          </div>
          <div class="mb-3">
            <label for="recipient-name" class="col-form-label">Enter PhoneNumber</label>
            <input type="text" class="form-control" id="recipient-name" name="phonenumber">
          </div>
          <div class="mb-3">
            <label for="message-text" class="col-form-label">Enter Address:</label>
            <textarea class="form-control" id="message-text"  name="address"></textarea>
          </div>
          <div class="modal-footer">
        <input type="submit" class="btn btn-primary" value="AddUser" name="addType">
      </div>
        </form>
      </div>
      </div>
  </div>
</div> 
      
      
      <div class="modal fade" id="addProduct" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Add Product</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <form action="AddUser"  method="post">
          <div class="mb-3">
            <label for="recipient-name" class="col-form-label">Enter Product Title</label>
            <input type="text" class="form-control" id="recipient-name"  name="productTitle">
          </div>
          <div class="mb-3">
            <label for="recipient-name" class="col-form-label">Enter Product Price</label>
            <input type="number" class="form-control" id="recipient-name" name="productDiscription">
          </div>
          <div class="mb-3">
            <label for="recipient-name" class="col-form-label">Enter product discount </label>
            <input type="number" class="form-control" id="recipient-name" name="discount">
          </div>
          <div class="mb-3">
            <label for="recipient-name" class="col-form-label">Enter Quantity </label>
            <input type="number" class="form-control" id="recipient-name" name="quantity">
          </div>
          <div class="mb-3">
            <label for="message-text" class="col-form-label">Enter Product Description</label>
            <textarea class="form-control" id="message-text"  name="address"></textarea>
          </div>
          <div class="mb-3">
          
         	<label for="message-text" class="col-form-label">Choose Product Category</label>
			 <select class="form-select" id="recipient-name" name="quantity">
				  <% 
				  List<String> list1 = CategoryDoa.getAllCategoryNames();
				  for(String name : list1) {
				  %>
				  <option value="1"><%= name %></option>
				  <% 
				  }
				  %>
				</select>
			</div>
			 <div class="mb-3">
            <label for="message-text" class="col-form-label">Upload the Image</label>
          	<input type="file" id="imageUpload" name="image" accept="image/*">
          </div>

          <div class="modal-footer">
        <input type="submit" class="btn btn-primary" value="AddProduct" name="addType">
      </div>
        </form>
      </div> 
    </div>
  </div>
</div>







<div class="modal fade" id="addCategory" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Add Category</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <form action="AddUser"  method="post">
         
          <div class="mb-3">
            <label for="recipient-name" class="col-form-label">Enter Category Name </label>
            <input type="text" class="form-control" id="recipient-name" name="categoryName">
          </div>
          <div class="mb-3">
            <label for="message-text" class="col-form-label">Enter Description</label>
            <textarea class="form-control" id="message-text"  name="Description"></textarea>
          </div>
          <div class="modal-footer">
        <input type="submit" class="btn btn-primary" value="AddCategory" name="addType">
      </div>
        </form>
      </div> 
    </div>
  </div>
</div>


</body>
</html>
