<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page errorPage="Error_page.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Example of JSTL taglib</title>
</head>
<body>
<h1>Taglib Directive Examples</h1>

<c:set var="name" value="Center for Good Governance" ></c:set>
<c:out value="${name}"></c:out>

<c:if test:"${3>2}">
<h2>this is true block</h2>
<p>${message}</p>
</c:if>
<%!

int n1=200;
int n2=10;
%>

<%
int division=n1/n2;



%>

</body>
</html>
