<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registeration</title>
</head>
<body>
<h3>New User Registeration</h3>
<form method="post" action="registeration.jsp">
  First Name : <input type = "text" name = "first_name"/><br/><br/>
  Last Name : <input type = "text" name = "last_name"/><br/><br/>
  Email : <input type = "email" name = "email"/><br/><br/>
  Password : <input type = "password" name = "password"/><br/><br/>
  Date Of Birth : <input type = "date" name = "dob"/><br/><br/>
  <input type = "submit" value = "Sign up"/>
  <a href = "index.html">Sign In</a>
</body>
</html>