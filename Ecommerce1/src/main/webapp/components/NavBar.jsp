<nav class="navbar navbar-expand-lg navbar-dark bg-dark text-light">
	<div class="container-fluid text-light">
		<a class="navbar-brand" href="#">Navbar</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">
						Dropdown </a>
					<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
						<li><a class="dropdown-item" href="#"></a></li>
						<li><a class="dropdown-item" href="#"></a></li>
						<li><hr class="dropdown-divider"></li>
						<li><a class="dropdown-item" href="#"></a></li>
					</ul></li>
				<li class="nav-item"><a class="nav-link disabled" href="#"
					tabindex="-1" aria-disabled="true">Disabled</a></li>
			</ul>
			<%
			  // Check if the "loggedInUser" attribute exists in the session
			  String loggedInUser = (String) session.getAttribute("username");
				String userType=(String) session.getAttribute("userType");
			
			  if (loggedInUser != null) {
					   
					    if (userType.equals("normal")){
					    	
					    
					%>
								<div >
									<!-- Display a "Logout" button -->
									<form action="LogoutServlet" class="d-flex">
									<a class="navbar-text text-light me-3" href="cart.jsp" class="m-5">
								      <!-- Bootstrap cart icon -->
								      <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-cart" viewBox="0 0 16 16" >
								        <path d="M0 0h1l2.277 5.674A2 2 0 0 0 4 8h8a2 2 0 0 0 1.723-2.326L16 0H0zm5.764 6.5a.5.5 0 1 1-.212.98L7.55 6H4.45l1.524 1.48a.5.5 0 0 1-.212.82l-3-1.5a.5.5 0 1 1 .424-.912L4 7.56l1.288-1.26zm-.212 4.48a.5.5 0 0 1 .424-.82l2.824 1.411-1.288 1.26-2.825-1.41a.5.5 0 0 1 .212-.942l3 1.5z"/>
								      </svg></a>
										<h5 class="mb-0 mt-3"><%=loggedInUser %></h5>
										<button class="btn btn-outline-danger m-2" type="submit">Logout</button>
									</form>
								</div>
								
								
								
								<%
					    }else{%>
					    	<div >
							<!-- Display a "Logout" button -->
							<form action="LogoutServlet" class="d-flex">
							<a class="navbar-text text-light me-3" href="cart.jsp" class="m-5">
						      <!-- Bootstrap cart icon -->
						      <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-cart" viewBox="0 0 16 16" >
						        <path d="M0 0h1l2.277 5.674A2 2 0 0 0 4 8h8a2 2 0 0 0 1.723-2.326L16 0H0zm5.764 6.5a.5.5 0 1 1-.212.98L7.55 6H4.45l1.524 1.48a.5.5 0 0 1-.212.82l-3-1.5a.5.5 0 1 1 .424-.912L4 7.56l1.288-1.26zm-.212 4.48a.5.5 0 0 1 .424-.82l2.824 1.411-1.288 1.26-2.825-1.41a.5.5 0 0 1 .212-.942l3 1.5z"/>
						      </svg></a>
								<h5 class="mb-0 mt-3"><%=loggedInUser %></h5>
								<button class="btn btn-outline-danger m-2" type="submit">Logout</button>
							</form>
						</div>

								
								
								
								<%
					  }} else {
					    // User is not logged in
					%>
								<div class="d-flex">
									<!-- Display "Login" and "Register" buttons -->
									<form action="Login.jsp">
										<button class="btn btn-outline-success m-2" type="submit">Login</button>
									</form>
									<form action="register.jsp">
										<button class="btn btn-outline-success m-2" type="submit">Register</button>
									</form>
								</div>
								<%
					  }
					%>

		</div>
	</div>
</nav>