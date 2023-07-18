<%@ page 

	language="java"
	contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	
 %>
 
 <jsp:useBean id="myBean" scope="page" class="jspaction.CourseBean" />
 <jsp:setProperty name="myBean" property="*" />
 
 <!DOCTYPE html>
 <html>
 	<head>
 		<title>Bean JSP</title>
 	</head>
 	<body>
 	
 		<h1>Here, You will figure out your course along with your course_id</h1>
 		
 		<p>The Course You Choose is <b>
 		
 		<jsp:getProperty name="myBean" property="course_name"  />
 		</b> </p>
 		
 		<p>The id of course you choose is <jsp:getProperty name="myBean" property="course_id" /></p>
 	
 	</body>
 </html>