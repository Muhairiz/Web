<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ include file ="includes/header.jsp" %>
<body class="sb-nav-fixed">
	<%@ include file ="includes/navbar.jsp" %>
        <div id="layoutSidenav">
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid">
                        <h1 class="mt-4">Users</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item"><a href="index.jsp">Dashboard</a></li>
                            <li class="breadcrumb-item active"><a href="users.jsp">Users</a></li>
                            <li class="breadcrumb-item active">Add User</li>
                        </ol>
                    </div>
                </main>
            </div>
        </div>
       <div class="container">
       	<form action="#" method="POST" class="form">
       	
       	 <div class ="row form-horizontal">
       	 	<div class="form-group col-md-6">  	 	
			     <label for="fname"> First Name:</label>
			     <input class="form-control" type="text" name="fname">
     		</div>
     		<div class="form-group col-md-6">  	 	
			     <label for="lname">Last Name:</label>
			     <input class="form-control" type="text" name="lname">
     		</div>
     	</div>
     	
     	<div class ="row form-horizontal">
       	 	<div class="form-group col-md-6">  	 	
			     <label for="phone"> Phone Number:</label>
			     <input class="form-control" type="text" name="phone">
     		</div>
     		<div class="form-group col-md-6">  	 	
			     <label for="email"> Email Address:</label>
			     <input class="form-control" type="text" name="email">
     		</div>
     	</div>
     	
     	<div class ="row form-horizontal">
     		<div class="form-group col-md-6">  	 	
			     <label for="email">Address:</label>
			     <input class="form-control" type="text" name="address">
     		</div>
       	 	<div class="form-group col-md-6">
       	 		<label>Gender</label><br>  	 	
			    <div class="form-check-inline">
				  <label class="form-check-label">
				    <input type="radio" class="form-check-input" name="gender" value="male" checked>Male
				  </label>
				</div>
				<div class="form-check-inline">
				  <label class="form-check-label">
				    <input type="radio" class="form-check-input" name="gender" value="female">Female
				  </label>
				</div>
     		</div>
     	</div>
     	<div class ="row form-horizontal">
       	 	<div class="form-group col-md-6">  	 	
			     <label for="user"> Username:</label>
			     <input class="form-control" type="text" name="phone">
     		</div>
     		<div class="form-group col-md-6">  	 	
			     <label for="pass">Password:</label>
			     <input class="form-control" type="password" name="email">
     		</div>
     	</div>
     	<input class="btn btn-success btn-lg" type="submit" name="save_user" value="SAVE">
    </form>
       </div>
    </body>
</html>