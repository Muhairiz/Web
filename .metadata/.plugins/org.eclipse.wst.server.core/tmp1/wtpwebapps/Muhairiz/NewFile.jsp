
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*,java.util.*,java.sql.*" %>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello jsp</title>
</head>
<body>
<%!

%>

<form action="Hello" method="post">
	<input type="text" name="fname"  placeholder="First Name"><br>
	<input type="text" name="lname"  placeholder="Last Name"><br>
	<input type="text" name="uname" placeholder="Username"><br>
	<input type="submit" name="btnsub">
</form>
</body>
</html>