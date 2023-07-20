<%@ page 

	language="java"
	contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	isELIgnored="false"
	
%>

<!DOCTYPE html>
<html>
	<head>
		<title>JSP Student Info</title>
	</head>
	<body>
		
		<h1>Welcome, ${ student.name }'s Info </h1>
		
		<table border="1">
		
			<thead>
				<tr>
					<th>Roll</th>
					<th>Name</th>
					<th>Email</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td> ${ student.roll } </td>
					<td> ${ student.name } </td>
					<td> ${ student.email }</td>
				</tr>
			</tbody>
			
		</table>
	
	</body>
</html>