<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Candidate</title>
</head>
<body>
 <h3>${initParam.appTitle}</h3>
  <jsp:useBean id="ucb" class="com.sunbeam.beans.UpdateCandidateBean"/>
  <jsp:setProperty name="ucb" property="*"/>
  ${ucb.updateCandidate()}
  <c:choose>
     <c:when test="${ucb.count==1}">
       <c:redirect url="ctl?page=result"/>
  </c:when>
  <c:otherwise>
  Candidate update failed.
  <a href="ctl?page=result">Show result</a>
  </c:otherwise>
  </c:choose>


</body>
</html>