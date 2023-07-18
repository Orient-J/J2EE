<%@ page 

	language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
 %>
 
<!DOCTYPE html>
<html>
	<head>
		<title>JPS Successful Page</title>
	</head>
	<body>
	
		<%
			
			String username = (String) session.getAttribute("username");
		
			out.println("Welcome " + username);
		
		%>
	
	</body>
</html>