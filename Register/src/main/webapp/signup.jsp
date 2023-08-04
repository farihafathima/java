<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<title>Sign Up</title>
</head>
<body style="background:url(images/image.jpg);background-attachment:fixed;background-size:cover;" >
<div class="container">
<div class="row">
<div class="col m6 offset-m3">
<div class="card">
<div class="card-content">
<h3 style="margin-top:10px;" class="center-align"> Register here!</h3>
<div id="msg"></div>

<div class="form center-align">
<form action="Register" method="post" id="myForm">
<input type="text" name="user_name" placeholder="enter username"/>
<input type="password" name="user_password" placeholder="enter password"/>
<input type="email" name="user_email" placeholder="enter email"/>
<div class="file-field input-field">
      <div class="btn">
        <span>File</span>
        <input type="file">
      </div>
      <div class="file-path-wrapper">
        <input class="file-path validate" type="text">
      </div>
    </div>
<button type="submit" class="btn light-blue accent-3">Submit</button>
</form>

</div>

<div class="loader center-align " style="margin-top:10px;display:none;">

<div class="preloader-wrapper big active">
      <div class="spinner-layer spinner-blue">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

   <div class="spinner-layer spinner-red">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

  <div class="preloader-wrapper small active">
    <div class="spinner-layer spinner-green-only">
      <div class="circle-clipper left">
        <div class="circle"></div>
      </div><div class="gap-patch">
        <div class="circle"></div>
      </div><div class="circle-clipper right">
        <div class="circle"></div>
      </div>
    </div>
     <div class="spinner-layer spinner-green">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>
    </div>
   
  </div>
   <h5>Please wait......</h5>
</div>
</div>

</div>

</div>

</div>
</div>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
integrity="sha256-KyZXEAg7qxJ5ScUzK4V4/X5MFM6ZPD9ovJqHs3l2+qA="
crossorigin="anonymous"></script>

 
<script>
$(document).ready(function(){
   $('#myForm').on('submit',function(event){
	  event.preventDefault();
	  var f=$(this).serialize();
	  console.log(f);
	  $.ajax({
		url:'Register',
		data:f,
		type:'Post',
		success:function(data,textStatus,jqXHR){
			console.log(data);
			console.log('success......');
			$('.loader').hide()
			$('.form').show()
			if(data.trim()==='done'){
				$('#msg').html("Successfully Registered...!");
				$('#msg').addClass('green-text');
			}
			else{
				$('#msg').html("Something went Wrong...!");
				$('#msg').addClass('red-text');
			}
		},
		error:function(jqXHR,textStatus,errorThrown){
			console.log(errorThrown);
			console.log("error....");
			$('.loader').hide();
			$('.form').show();
			$('#msg').html("Something went Wrong...!");
			$('#msg').addClass('red-text');
		}
	  });
   });
});
</script>

</body>
</html>
