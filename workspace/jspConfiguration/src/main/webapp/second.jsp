<%@ page 

	language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>


<!DOCTYPE html>
<html>
	<head>
		<title>Second</title>
	</head>
	<body>
	
		<%
		
			PageContext.getAttribute("user", PageContext.SESSION_SCOPE);
		
			
		%>
	
	</body>
</html>