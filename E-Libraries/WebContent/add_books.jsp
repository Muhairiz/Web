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
                        <h1 class="mt-4">Books</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item"><a href="Index.jsp">Dashboard</a></li>
                            <li class="breadcrumb-item active"><a href="Books.jsp">Books</a></li>
                            <li class="breadcrumb-item active">Add Books</li>
                        </ol>
                    </div>
                </main>
            </div>
        </div>
       <div class="container">
       	<form action="SaveBook" method="POST" class="form">
       	
       	 <div class ="row form-horizontal">
       	 	<div class="form-group col-md-6">  	 	
			     <label for="fname"> Book Name:</label>
			     <input class="form-control" type="text" name="bname">
     		</div>
     		<div class="form-group col-md-6">  	 	
			     <label for="lname">Author Name:</label>
			     <input class="form-control" type="text" name="aname">
     		</div>
     	</div>
     	
     	<div class ="row form-horizontal">
       	 	<div class="form-group col-md-6">  	 	
			     <label for="phone"> Book Type:</label>
			     <input class="form-control" type="text" name="btype" required>
     		</div>
     		<div class="form-group col-md-6">
			  <label>Book Course:</label>
			  <select class="form-control" name="bcourse">
			    <option value="ICT">ICT</option>
			    <option value="Account">Account</option>
			    <option value="Bank">Bank</option>
			  </select>
			</div>
     	</div>
     	
     	<input class="btn btn-success btn-lg" type="submit" name="save_user" value="SAVE">
    </form>
       </div>
    </body>
</html>