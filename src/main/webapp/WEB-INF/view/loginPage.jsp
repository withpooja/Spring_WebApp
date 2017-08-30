<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body bgcolor="pink">
	<form method="post" action="/QuoteManager/home">
		<center>
			<h2>Welcome to Quotation Manager Tool</h2>
			<div>
				<input type="text" value="admin"><br> <input
					type="password" value="passwordAdmin">
			</div>
			<div>
				<input type="submit" value="submit" />
			</div>
		</center>
	</form>
</body>
</html>