<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<style>
a:link {
color:red;
}
a:visited {
color:blue;
}
a:hover {
color:green
}
</style>
</head>
<body bgcolor="EECA21">
<form:form>

	<center>
		<div>
			<h2>Quotations</h2>
		</div>
		<div>
			<table border="1" bgcolor="#FFAA32">
				<thead>
					<tr>
						<th>Category</th>
						<th>Author</th>
						<th>Quote</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var ="quote" items="${allQuotes}">
					<tr>
						<td><c:out value="${quote.author}"></c:out></td>
						<td><c:out value="${quote.category}"></c:out></td>
						<td><c:out value="${quote.quotation}"></c:out></td>
						<td><a href="updateQuote/${quote.uid}">Edit</a>
							<a href="deletion/${quote.uid}">Delete</a>
						</td>
					</tr>
				</c:forEach>
				</tbody>
				
				<tfoot>
					<tr>
					<td colspan="4">That's It for now. keep adding new words.</td></tr>
				</tfoot>
			</table>
		</div>
	</center>
	</form:form>
</body>
</html>