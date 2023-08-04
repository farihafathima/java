<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
     <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> JSTL sql tags</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h1>All users are :</h1>
<sql:setDataSource driver="org.postgresql.Driver"
 url="jdbc:postgresql://localhost:5432/register" 
 user="postgres" password="#Fariha9515" var="ds"/>

<sql:query var="rs" dataSource="${ds}">
    SELECT * FROM users;
</sql:query>

<div class="container">
<table class="table">
<tr>
<th>User Id</th>
<th>User Name</th>
<th>UserEmail</th>
</tr>
<c:forEach items="${rs.rows}" var="row">

<tr>
<td><c:out value="${row.id}"></c:out></td>
<td><c:out value="${row.name}"></c:out></td>
<td><c:out value="${row.email}"></c:out></td>
</tr>
</c:forEach>


</table>



</div>
</body>
</html>