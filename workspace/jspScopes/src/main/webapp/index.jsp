<!-- JSP PAGE DIRECTIVE -->

<%@ page 

	language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
 %>
 
 <!-- HTML PAGE -->
 
<!DOCTYPE html>
<html>
	<head>
		<title>JSP Register Page</title>
	</head>
	<body>
	
		<form action="./setSession.jsp" method="post">
		
			<div class="form-group">
				<label class="form-label" for="username">Username</label>
				<input type="text" name="username" id="username" class="form-control" placeholder="Enter Your Username"  />
			</div>
			
			<div class="form-group">
				<label class="form-label" for="email">Email</label>
				<input type="email" name="email" id="email" class="form-control" placeholder="Enter Your email" />
			</div>		
			
			<div class="form-group">
				<label class="form-label" for="passowrd">Password</label>
				<input type="password" name="password" id="password" class="form-control" placeholder="Enter Your Password" />
			</div>
			
			<input type="submit" name="submit" id="submit" class="btn btn-sumit" value="Submit" />
			
		</form>
	
	</body>
</html>
 
