<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Random,java.util.ArrayList,java.io.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Header.jsp" %>
<h1>
Random Numbers
<%
Random random=new Random();
int r=random.nextInt(6);
out.println(r);

%>
<%= r %>

</h1>

</body>
</html>

