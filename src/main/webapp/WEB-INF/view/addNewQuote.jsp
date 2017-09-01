<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Quotation</title>
</head>
<body bgcolor="#FFCB12">
	<form:form modelAttribute="quotationToAdd" action="/QuoteManager/saveQuote" method="post">
		<form:hidden path="uid"/>
		<center>
			<h3>Adding New Quote</h3>
			<form:label path="author">Author: </form:label>
			<form:input path="author" />
			<form:label path="category">Category: </form:label>
			<form:input path="category" />
			<form:label path="quotation">Words: </form:label>
			<form:input path="quotation" />
			<input type="submit" value="Save">
		</center>
	</form:form>
</body>
</html>