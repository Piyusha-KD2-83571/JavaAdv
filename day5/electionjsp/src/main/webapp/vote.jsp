<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <h3>${initParam.appTitle}</h3>
    <jsp:useBean id="vb" class="com.sunbeam.beans.VoteBean"/>
   <jsp:setProperty name="vb" property="candidateId" param="candidate"/>
   <jsp:setProperty property="userId" name="vb" value="${lb.user.id}"/>
    Hello : ${lb.user.email}
    <c:choose>
    <c:when test="${lb.user.status==0}">
    ${vb.votedCandidate()}
    <br/><hr/>
    Thank you For Voting!!!
    </c:when>
    <c:otherwise>
    You Have Already Voted!!
    </c:otherwise>
    
    </c:choose>
    
   <a href="logout.jsp">Log out</a>    

</body>
</html>
