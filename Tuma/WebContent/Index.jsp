<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bootstrap Example</title>
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<div class="container">
<p class="text-primary"> WELCOME
<form action="Servlet1" method="post">
	<div class="form-group">
		<label for="fname">First Name</label>
		<input type="text" name="fname" class="form-control" placeholder="Enter First Name">
	</div>

	<div class="form-group">
		<label for ="lname">Last Name</label>
		<input type="text" name="lname" class="form-control" placeholder="Enter Last Name">
	</div>
	
	<div class="form-group">
		<label for ="lname">Username</label>
		<input type="text" name="user" class="form-control" placeholder="Enter Username">
	</div>
	<button type="submit" name="btnsubmit" class="btn btn-active">SUBMIT</button>

</form>
</div>
</body>
</html>