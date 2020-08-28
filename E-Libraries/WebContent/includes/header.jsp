<head>
<meta charset="ISO-8859-1">
<link href ="bootstrap/css/bootstrap.css" rel="stylesheet">
<%
session =request.getSession(false);
String myUser =(String)session.getAttribute("username");
if(myUser==null){
	out.print("Please login first");
	RequestDispatcher rs = request.getRequestDispatcher("loginForm.jsp");
	rs.forward(request, response);
}

%>
<title>E-Library</title>
</head>