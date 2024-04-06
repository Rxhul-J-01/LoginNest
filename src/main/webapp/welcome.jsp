<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="index.css">
<title>Welcome</title>
</head>
<body>

	<%
	
		response.setHeader("cache-control","no-cache, no-store, must-revalidate");
	
		if(session.getAttribute("name")== null && session.getAttribute("pass") == null){
			response.sendRedirect("login.jsp");
		}
	%>
	

	<div class = "container">
		<h1>Welcome</h1> ${name }
		<h3>I'm happy to have you on my platform</h3>
		<p>Feel free to stay as long as you like</p>
		<p>And you can easily logout everything will be secured</p>
		
		<div class = "links">
		
			<form action = "logoutServlet" method = "post">
				<button>Logout</button>
			</form>
			
			
		</div>
	
	</div>
	
	
	
</body>
</html>