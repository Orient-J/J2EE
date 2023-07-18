<!-- page directive -->

<%@ page 

	language="java"
	contentType="text/html; charset=UTF-8"
	session="true"
	buffer="16kb"
	autoFlush="true"
	info="Page Directive Info"
	import="java.util.Date"
	pageEncoding="UTF-8"

	errorPage="./jspErrorPage.jsp"
 %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>

		<%@ include 
		
			file="./headerandfooter/header.jsp"
		%>
	
		<h1>
			<%= new Date() %>
		</h1>
		
		<h3>There are 3 types of Directives</h3>
		
		<ol>
			<li>Page</li>
			<li>Include</li>
			<li>Taglib = tag library</li>
		</ol>
		
		<p>
			
			<h3>Format</h3>
			
			<pre>
				&lt;%@ [type of directive] [attributes = values] %&gt;
			</pre>
		
		</p>
		
		<hr/>
		
		<h3>Attributes of Page Directive</h3>
		
		<table border="2" >
			<tr>
				<th>Attributes</th>
				<th>Default Value</th>
			</tr>
			
			<tr>
				<td>language</td>
				<td>Java</td>
			</tr>

			<tr>
				<td>extends</td>
				<td>Not Used</td>
			</tr>


			<tr>
				<td>import</td>
				<td>Not Used</td>
			</tr>


			<tr>
				<td>session</td>
				<td>true</td>
			</tr>


			<tr>
				<td>buffer</td>
				<td>Container Implementation dependent. Usually at least 8kb</td>
			</tr>

			
			<tr>
				<td>autoFlush</td>
				<td>true</td>
			</tr>


			<tr>
				<td>isThreadSafe</td>
				<td>true</td>
			</tr>
			

			<tr>
				<td>info</td>
				<td>Not Used</td>
			</tr>


			<tr>
				<td>errorPage</td>
				<td>Not Used</td>
			</tr>


			<tr>
				<td>isErrorPage</td>
				<td>false</td>
			</tr>


			<tr>
				<td>contentType</td>
				<td>For MIME type => text/html <br/>
					For JSP pages => text/xml <br/>
					For charset => ISO-8895-1
				</td>
			</tr>

			
			<tr>
				<td>pageEncoding</td>
				<td>ISO-8895-1</td>
			</tr>


			<tr>
				<td>isELIgnored</td>
				<td>false => web.xml v2.3 <br/>
					true => web.xml v2.4
				</td>
			</tr>
			
		</table>
		
		<%@ include 
		

			file="./headerandfooter/footer.jsp"
		%>
		
	</body>
</html>