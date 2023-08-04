<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <h4>Student detail:</h4>
	 <jsp:useBean id="student" class="cgg.beans.Student"/>
         <jsp:setProperty name="student" property="*"/>
         Name:<jsp:getProperty name="student" property="name"/><br>
         RollNo:<jsp:getProperty name="student" property="rollNo"/><br>
	</body>
</html>