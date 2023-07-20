<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Book Info</title>
		<style>
			* {
				box-sizing: border-box;
				color: #fff;
				
				font-weight: 900;
				font-size: 20px;
				
				margin: 0;
				padding: 0;
			}
		
			body{
				background-color: #000;
				
				height: 100vh;
				
				display: flex;
				justify-content: center;
				align-items: center;
			}
			
			table{
				width: 50vw;
				
				border: none;
				
				box-shadow: 0 0 20px #fff;
			}
		
			td {
				border: none;
				border-bottom: 2px solid #fff;
				
				padding: 50px 0 50px 20px; 
			}
			
		</style>
	</head>
	<body>
	
		<jsp:useBean id="javaBean" class="bean.JavaBean" scope="request" />
		
		<jsp:setProperty name="javaBean" property="bookId" value="${ param.bookId }" />
		<jsp:setProperty name="javaBean" property="bookName" value="${ param.bookName }" />
		<jsp:setProperty name="javaBean" property="arthur" value="${ param.arthur }" />
		<jsp:setProperty name="javaBean" property="publishedDate" value="${ param.published }" />
			
		<table cellspacing="0">
			<tbody>
				<tr>
					<td>Book Id</td>
					<td> <jsp:getProperty name="javaBean" property="bookId" /> </td>
				</tr>
				<tr>
					<td>Book Name</td>
					<td> <jsp:getProperty name="javaBean" property="bookName" /> </td>
				</tr>
				<tr>
					<td>Arthur</td>
					<td> <jsp:getProperty name="javaBean" property="arthur" /> </td>
				</tr>
				<tr>
					<td>Published Date</td>
					<td> <jsp:getProperty name="javaBean" property="publishedDate" /> </td>
				</tr>
			</tbody>
		</table>
	</body>
</html>
