<%@ page 

	language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
 %>
 
<!DOCTYPE html>
<html>
	<head>
		<title>Welcome</title>
	</head>
	<body>
	
		<%
		
			String username = request.getParameter("username");
			out.println("Welcome User " + username + "<br/>");
			
			String dbName = config.getInitParameter("dbName");
			out.println("database name is " + dbName + "<br/>");
			
			String driver = application.getInitParameter("driverName");
			out.println("driver name is " + driver + "<br/>");
			
			String serverInfo = application.getServerInfo();
			out.println("Server information is " + serverInfo + "<br/>");
			
			pageContext.setAttribute("user",username,PageContext.SESSION_SCOPE);
			
		%>	
		
		<br/>
		
		<a href="./second.jsp" target="_blink">Go TO Second JSP</a>
	
	</body>
</html>