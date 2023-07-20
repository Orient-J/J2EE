<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib 

	uri="http://java.sun.com/jsp/jstl/core"
	prefix="core"
 %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSTL implicit Objects</title>
	</head>
	<body>
	
		<h1>JSTL Implicit Objects</h1>
		
		<details>
			<summary>CORE FOR TOKENS</summary>
			
			<core:set var="str" value="I am a Student.I am 18 years old.I like Milk,Apple." scope="page" />
			
			<strong>The String is </strong><core:out value="${ str }" />
			
			<br/>
			<br/>
			
			<core:forTokens items="${ str }" delims=" " var="tokens">
				<em> <core:out value="${ tokens }" /> </em> <br/>
			</core:forTokens>
			
		</details>
		
		<hr/>
		
		<details>
			<summary>CORE IF</summary>
			
			<br/>
			
			<core:forEach var="var" begin="1" end="10">
				<core:if test="${ var % 2 != 0 }">
					<core:out value="${ var }"/> <br/>
				</core:if>
			</core:forEach>
			
		</details>
		
		<hr/>
		
		<details>
			<summary>CORE IMPORT</summary>
			
			<core:import var="data" url="https://www.google.com">
			</core:import>
			
			<core:out value="${ data }" />
		</details>
	
	</body>
</html>