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
                        <h1 class="mt-4">Students</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item"><a href="Index.jsp">Dashboard</a></li>
                            <li class="breadcrumb-item active"><a href="students.jsp">Students</a></li>
                            <li class="breadcrumb-item active">Add Student</li>
                        </ol>
                    </div>
                </main>
            </div>
        </div>
       <div class="container">
       	<form action="SaveStudent" method="POST" class="form">
       	
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
			     <label for="phone"> Registration Number</label>
			     <input class="form-control" type="text" name="regno" required>
     		</div>
     		<div class="form-group col-md-6">  	 	
			     <label for="email"> Phone Number:</label>
			     <input class="form-control" type="number" name="phone">
     		</div>
     	</div>
     	<div  class ="row form-horizontal">
     		<div class="form-group col-md-6">  	 	
			     <label for="email"> Email Address:</label>
			     <input class="form-control" type="text" name="email">
     		</div>
     		<div class="form-group col-md-6">  	 	
			     <label for="email"> Address:</label>
			     <input class="form-control" type="text" name="add">
     		</div>
     	</div>
     	
     	<div class ="row form-horizontal">
       	 	<div class="form-group col-md-6">
       	 		<label>Gender</label><br>  	 	
			    <div class="form-check-inline">
				  <label class="form-check-label">
				    <input type="radio" class="form-check-input" name="gender" value="Male" checked>Male
				  </label>
				</div>
				<div class="form-check-inline">
				  <label class="form-check-label">
				    <input type="radio" class="form-check-input" name="gender" value="Female">Female
				  </label>
				</div>
     		</div>
     		<div class="form-group col-md-6">  	 	
			     <label for="user"> Username:</label>
			     <input class="form-control" type="text" name="user">
     		</div>
     	</div>
     	<div class ="row form-horizontal">
     		<div class="form-group col-md-6">  	 	
			     <label for="pass">Password:</label>
			     <input class="form-control" type="password" name="pass">
     		</div>
     	</div>
     	<input class="btn btn-success btn-lg" type="submit" name="save_user" value="SAVE">
    </form>
       </div>
    </body>
</html>