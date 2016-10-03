<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
	<form:form method="POST" modelAttribute="user"
		action="${pageContext.request.contextPath}/register">
		<table>
			<tbody>
				<tr>
					<td>Name:</td>
					<td><form:input path="name"></form:input></td>
				</tr>
				<tr>
					<td><input value="Add" type="submit"></td>
					<td></td>
				</tr>
			</tbody>
		</table>
	</form:form>

	<p>
		<a href="${pageContext.request.contextPath}/home">Home page</a>
	</p>
</body>
</html>