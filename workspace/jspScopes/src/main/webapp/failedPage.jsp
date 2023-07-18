<%@ page 

	language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
 %>
 
<!DOCTYPE html>
<html>
	<head>
		<title>JSP Failed Page</title>
	</head>
	<body>
	
		<% 
		
			String fileName = (String) request.getParameter("fileName");
		
			if( fileName.equals("index") ) {
				
		%>
		
		<jsp:include page="./index.jsp" flush="true" ></jsp:include>
		
		<% 
			} else if( fileName.equals("login") ){
		%>
		
		<jsp:include page="./login.jsp" flush="true"></jsp:include>
		
		<% 
			}
		%>
		
	
	</body>
</html>