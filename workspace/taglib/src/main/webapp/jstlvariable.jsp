<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSTL Variable</title>
	</head>
	<body>
		
		<core:set var="num" value="${ 100 * 5 }" scope="session" />
		
		<core:set var="num" value="${ num * 5 }" scope="request" />
		
		<h1>Result is <core:out value="${ num }" /></h1>
		
		<hr/>
		
		<jsp:useBean id="bean" class="bean.JavaBean" scope="page" />
		
		<core:set target="${ bean }" property="name" value="Kyaw Pyae Sone" />
		<core:set target="${ bean }" property="age" value="20" />
		<core:set target="${ bean }" property="isMarried" value="false" />
		
		<details>
			<summary>Name</summary>
			
			<h1> <core:out value="${ bean.name }" /> </h1>
		</details>
		
		<details>
			<summary>Age</summary>
			<h1> <core:out value="${ bean.age }"/> </h1>
		</details>
		
		
		<details>
			<summary>isMarried</summary>
			<h1> <core:out value="${ bean.isMarried }" /> </h1>
		</details>
		
		<hr/>
		
		<core:remove var="num" />
		
		<h1> Computed Result = <core:out value="${ num }" /> </h1>
		
		
	</body>
</html>