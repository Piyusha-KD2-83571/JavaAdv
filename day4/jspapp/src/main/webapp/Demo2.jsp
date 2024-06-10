<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
int count =0 ;
public void jspInit(){
	System.out.println("Inside Init");
}

public void jspDestroy()
{
	System.out.println("Inside Destroy");
}
%>
<br/><hr/> <br/>
<%count++; %>
<% if(count % 2 == 0) { %>
    Even Count : <%= count %>
 <%} else { %>
    Odd Count : <%= count %>
   <%} %> 
<br/><hr/> <br/>  
  <%
  if(count%2==0)
	  out.println("Even Count:"+count);
  else
	  out.println("Odd Count:"+count);
  
  %> 
    

</body>
</html>