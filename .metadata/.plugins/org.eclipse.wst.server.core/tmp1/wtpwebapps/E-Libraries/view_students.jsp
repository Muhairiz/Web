<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page import="java.io.*,java.util.*,java.sql.*" %>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<%@ include file ="includes/header.jsp" %>
<body class="sb-nav-fixed">
	<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/ELibrary" user="root" password=""/>
	<sql:query dataSource="${snapshot}" var="result">
		SELECT * from students_tb;
	</sql:query>
	
	
	<%@ include file ="includes/navbar.jsp" %>
        <div id="layoutSidenav">
            <div id="layoutSidenav_nav">
            </div>
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid">
                        <h1 class="mt-4">Students</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item"><a href="Index.jsp">Dashboard</a></li>
                            <li class="breadcrumb-item active">Students</li>
                        </ol>
                        <div class="card mb-4">
                            <div class="card-header"><i class="fas fa-table mr-1"></i>DataTable Example</div>
                            <div class="card-body">
                                <div class="table-responsive">
                                <table class="table table-bordered table-striped">
	                                <thead>
	                                	<tr>
	                                		<th>User Id</th>
		                                	<th>First Name</th>
		                                	<th>Last Name</th>
		                                	<th>Registration Number</th>
		                                	<th>Phone Number</th>
		                                	<th>Email Address</th>
		                                	<th>Address</th>
		                                	<th>Gender</th>
		                                	<th>Date Added</th>
		                                	<th>Edit</th>
		                                	<th>Delete</th>
	                                	</tr>
	                                </thead>
	                                <tbody>
	                                	<c:forEach var="row" items="${result.rows}">
	                                		<tr>
	                                			<td><c:out value="${row.std_id}"/></td>
	                                			<td><c:out value="${row.first_name}"/></td>
	                                			<td><c:out value="${row.last_name}"/></td>
	                                			<td><c:out value="${row.regno}"/></td>
	                                			<td><c:out value="${row.phone}"/></td>
	                                			<td><c:out value="${row.email}"/></td>
	                                			<td><c:out value="${row.address}"/></td>
	                                			<td><c:out value="${row.gender}"/></td>
	                                			<td><c:out value="${row.date}"/></td>
	                                			<td><a  class="btn btn-primary btn-lg" href='EditStudentForm?id=<c:out value="${row.std_id}"/>' >Edit</a></td>
	                                			<td><a  class="btn btn-danger btn-lg" href='DeleteStudent?id=<c:out value="${row.std_id}"/>' >Delete</a></td>
	                                		</tr>
	                                		
	                                	</c:forEach>
	                                </tbody>
                                </table>
                                    
                                </div>
                                <a class="btn btn-primary" href="add_student.jsp">Add Student</a>
                            </div>
                        </div>
                    </div>
                </main>
            </div>
        </div>
    </body>
</html>