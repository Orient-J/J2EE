<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%= "This is expression" %>
	
	<br/>
	
	<%! String str = "This is declartion"; %>
	
	<br/>
	
	<% out.println("This is javacode and " + str); %>
	
	<br/>
	
	<%= "<b>This is bold tag</b>" %>
	
	<hr/>
	
	<% 
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	%>
	
	<%! Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/userdb", "root", "root@password#007"); %>
	
	<table>
		
	</table>

</body>
</html>