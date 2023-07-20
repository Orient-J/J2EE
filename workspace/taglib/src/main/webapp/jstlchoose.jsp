<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Core Choose</title>
		</head>
	<body>
	
		<core:set var="mark" value="46" scope="page" />
		
		<core:choose >
		
			<core:when test="${ mark <= 45 && mark >= 0 }">
				You Failed The Exam
			</core:when>
			
			<core:when test="${ mark >= 50 && mark <= 100 }">
				You Passed The Exam
			</core:when>
			
			<core:otherwise>
				You must take reExam;
			</core:otherwise>
			
		</core:choose>
	
	</body>
</html>