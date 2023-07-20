<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List, java.util.ArrayList"%>
    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSP ForEach</title>
	</head>
	<body>
	
		<h1>JSTL For Each</h1>
		
		<!-- in forEach, to use 0 , you need to conver to int from String with Integer.parseInt(number) -->
		
		<core:set var="begin" value="0" />
		<core:set var="end" value="2999" />
		<core:set var="step" value="1000" />
		
		<core:forEach var="index" begin="${ begin }" end="${ end }" step="${ step }">
			<strong style="display:block;"> I Love You <core:out value="${ index + 1 }" /> </strong>
		</core:forEach>
		
		<hr/>
		
		<%
		
			List<String> accessories = new ArrayList<String>();
			accessories.add("Phone");
			accessories.add("EarPhone");
			accessories.add("Money");
			accessories.add("Book");
		%>
		
		<core:forEach var="name" items="<%= accessories %>"  >
			<core:out value="${ name }" /> <br/>
		</core:forEach>
	
	</body>
</html>