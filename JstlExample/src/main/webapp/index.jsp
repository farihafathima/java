<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Example</title>
</head>
<body>
<h1>This is JSTL Example</h1>
<!-- 1.out tag to print -->
<!-- 2.set tag  to declare variables -->
<c:set var="i" value="14" scope="application"></c:set>
<h1><c:out value="${i}"></c:out></h1>

<!-- 
3.Remove tag -->
<%-- <c:remove var="i"/> --%>
<h1><c:out value="${i}">this is default value</c:out></h1>

<!-- 4.if:test condition:true=>print the body -->
<c:if test="${i==14}"><h1>i values is 14 </h1>
<p>this is paragraph,hello how are you</p>
</c:if>
<!-- 5.choose when otherwise:java switch -->
<c:choose>
<c:when test="${i>0}">
<h1>this is my  first case</h1>
<h2>Number is positive</h2>

</c:when>
<c:when test="${i<0}">

<h1>This is my second case</h1>
<h2>Number is negative</h2>

</c:when>
<c:otherwise>
<h1>This is default case</h1>
<h1>Number is Zero</h1>


</c:otherwise>

</c:choose>

<!-- 6.for each =>for repeating and traversing -->
<c:forEach var="j" begin="1" end="10">


<h1>value of j is <c:out value="${j}"></c:out></h1>


</c:forEach>
<!-- 7.redirect -->
<!-- 8.url param -->


<%-- <c:redirect url="https://www.google.com"></c:redirect> --%>
<c:url var="myurl" value="http://www.google.com/search">

<c:param name="q" value="center for good governance"></c:param>
</c:url>



<h1><c:out value="${myurl}"></c:out></h1>
<%-- <c:redirect url="${myurl}"></c:redirect> --%>

</body>
</html>