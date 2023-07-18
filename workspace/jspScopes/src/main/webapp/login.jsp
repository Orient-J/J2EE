<%@ page 

	language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"	
 %>
 
<!DOCTYPE html>
<html>
	<head>
		<title>JSP Login Page</title>
	</head>
	<body>
	
		<form action="./checkLogin.jsp" method="post">
			
			<div class="form-group">
				<label class="form-label" for="username">Username</label>
				<input type="text" name="username" id="username" class="form-control" placeholder="Enter Your Username" />
			</div>
			
			<div class="form-group">
				<label class="form-label" for="password">Password</label>
				<input type="password" name="password" id="password" class="form-control" placeholder="Enter Your Password" />
			</div>
			
			<input type="submit" class="btn btn-login" value="Login" />
		</form>
	
	</body>
</html>