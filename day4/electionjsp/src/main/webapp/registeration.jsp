<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id = "ub" class="javabeans.NewUserBean" />
<jsp:setProperty name= "ub" property="firstName" param="first_name"/>
<jsp:setProperty name= "ub" property="lastName" param="last_name"/>
<jsp:setProperty name= "ub" property="email" param="email"/>
<jsp:setProperty name= "ub" property="password" param="password"/>
<jsp:setProperty name= "ub" property="dob" param="dob"/>

<%if(ub.register()!=0) { %>
You Have Successfully Registered <jsp:getProperty property="email" name="ub"/> 
<%}else{ %>
 Registeration Failed
 <%} %>
</body>
</html>