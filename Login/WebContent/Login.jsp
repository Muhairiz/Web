<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<div class="container">
	<form action="LoginServlet" method="post">
		<div class="form-group">
			<label for="username">Username</label>
			<input type="text" class="form-control" name="uname" placeholder="Enter Username">
		</div>
		<div class="form-group">
			<label for="password">Password</label>
			<input type="password" class="form-control" name="pass" placeholder="Enter Password">
		</div>
		<input type="submit" name="login" class="btn btn-success" value="LOGIN">
	</form>
</div>
</body>
</html>