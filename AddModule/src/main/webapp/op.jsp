<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page errorPage="ErrorExe.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//fetch two numbers
String n1=request.getParameter("n1");
String n2=request.getParameter("n2");

//converting the string to number

int a=Integer.parseInt(n1);
int b=Integer.parseInt(n2);
int c=a/b;



%>
<h1>Result is :<%= c %></h1>

</body>
</html>