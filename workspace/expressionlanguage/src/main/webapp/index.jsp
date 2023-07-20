<%@ page 

	language="java"
	contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
 %>
 
<!DOCTYPE html>
<html>
	<head>
		<title>Student Form JSP</title>
	</head>
	<body>
		
		<form action="register.jsp" method="post">
		
			<div class="form-group">
				<label class="form-label" for="name">Name</label>
				<input type="text" name="name" id="name" class="form-control" placeholder="Enter Name" />
			</div>
			
			<div class="form-group">
				<label class="form-label" for="roll">Roll</label>
				<input type="text" name="roll" id="roll" class="form-control" placeholder="Enter Roll" />
			</div>
			
			<div class="form-group">
				<label class="form-label" for="email" >Email</label>
				<input type="email" name="email" id="email" class="form-control" placeholder="Enter Email" />
			</div>
			
			<input type="submit" class="btn" value="submit" />
		
		</form>
	
	</body>
</html>