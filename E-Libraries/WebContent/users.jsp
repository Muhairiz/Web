<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ include file ="includes/header.jsp" %>
<body class="sb-nav-fixed">
	<%@ include file ="includes/navbar.jsp" %>
        <div id="layoutSidenav">
            <div id="layoutSidenav_nav">
            </div>
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid">
                        <h1 class="mt-4">Users</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item"><a href="Index.jsp">Dashboard</a></li>
                            <li class="breadcrumb-item active">Users</li>
                        </ol>
                        <div class="card mb-4">
                            <div class="card-header"><i class="fas fa-table mr-1"></i>DataTable Example</div>
                            <div class="card-body">
                                <div class="table-responsive">
                                    
                                </div>
                                <a class="btn btn-primary" href="add-user.jsp">Add user</a>
                                <a class="btn btn-warning" href="view_user.jsp">View Users</a>
                            </div>
                        </div>
                    </div>
                </main>
            </div>
        </div>
    </body>
</html>