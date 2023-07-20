<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>JSTL Core OUTPUT</h1>
		
		<core:out value="<h3>This is Output with true escapeXml</h3>" escapeXml="true" />
		
		<core:out value="<h3>This is Output with false escapeXml</h3>" escapeXml="false" />		
	</body>
</html>