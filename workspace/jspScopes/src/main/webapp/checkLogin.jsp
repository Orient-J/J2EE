<%@ page 
	language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
 %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		
		<% 
		
			 
			String username = request.getParameter("username");
			String sessionUsername = (String) session.getAttribute("username");
		
			String password = request.getParameter("password");
			String sessionPassword = (String) session.getAttribute("password");
			
			if( username.equals(sessionUsername) && password.equals(sessionPassword) ) {
				
				response.sendRedirect("./sucessfulPage.jsp");
			
			}else{
				
		%>
			<jsp:forward page="./failedPage.jsp">
				<jsp:param name="fileName" value="login" />
			</jsp:forward>
		<% 
			}
		%>
			
	</body>
</html>