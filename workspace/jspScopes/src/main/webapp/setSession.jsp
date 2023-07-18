<!-- JSP PAGE DIRECTIVE -->

<%@ page 
	
	language = "java"
	contentType="text/html, charset=UTF-8"
	pageEncoding="UTF-8"
 %>
 
<!DOCTYPE html>
<html>
	<head>
		<title>JSP Set Session Page</title>
	</head>
	<body>
	
	
		<% 
		
			String username = request.getParameter("username");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
		
			if( !username.equals("") && !email.equals("") && !password.equals("") ) {
				
				session.setAttribute("username", username);
				session.setAttribute("email", email);
				session.setAttribute("password", password);
				
				response.sendRedirect("./login.jsp");
			
			}else{
				
		%>
		
		<jsp:forward page="./failedPage.jsp">
			<jsp:param name="fileName" value="index"  />
		</jsp:forward>
		
		<% 
		
			}
		%>
	
	</body>
</html>