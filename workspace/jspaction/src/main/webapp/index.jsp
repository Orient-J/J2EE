<%@ page 

	language="java"
	contentType="text/html, charset='ISO-8859-1'"
	pageEncoding="ISO-8859-1"
 %>
 
 <!DOCTYPE html>
 <html>
 	<head>
		<title>JSP Selection Box</title>
 	</head>
 	<body>
 		
		<form action="bean.jsp" method="post">
		
			<select name="course_name" id="course_name" class="select-group" >
	 			<option selected disabled>Choose Your Course Name</option>
	 			<option value="se">Software Engineering</option>
	 			<option value="ke">Knowledge Engineering</option>
	 			<option value="bis">Business Information System</option>
	 			<option value="csf">Cyber Security Forensis</option>
	 		</select>
		
			<input type="submit" name="submit" id="submit" class="btn" value="Sumit Your Selection" />
		
		</form>
 		
 	</body>
 </html>
 