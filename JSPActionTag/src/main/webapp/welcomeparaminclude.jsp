<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>param include</title>
</head>
<body>
  <h3>Hello this is a param action example.</h3>
  <jsp:include page="homeincludeparam.jsp">
 <jsp:param name="websiteName" value="www.w3spoint.com"/>
</body>
</html>