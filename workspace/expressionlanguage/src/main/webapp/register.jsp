<%@ page 

	language="java"
	contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	isELIgnored="false"
%>

<!DOCTYPE html>
<html>
	<head>
		<title>JSP Register</title>
	</head>
	<body>
	
		<jsp:useBean id="student" class="pkg.Student" scope="request" />
		
		<jsp:setProperty name="student" property="name" value="${ param.name }" />
		<jsp:setProperty name="student" property="roll" value="${ param.roll }" />
		<jsp:setProperty name="student" property="email" value="${ param.email }" />
	
		<jsp:forward page="studentInfo.jsp"></jsp:forward> 
		
	</body>
</html>