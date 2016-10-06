<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add article</title>
</head>
<body>
	<form:form method="POST" modelAttribute="article"
		action="${pageContext.request.contextPath}/addArticle/${user.id}">
		<table>
			<tbody>
				<tr>
					<td>Title:</td>
					<td><form:input path="name"></form:input></td>
				</tr>
<!-- 				<tr> -->
<!-- 					<td>Author id:</td> -->
<%-- 					<td><form:input path="userId"></form:input></td>  --%>
<!-- 				</tr> -->
<%-- 				<form:input type="text" path="userId" disabled="true"/> --%>
<%-- 					<form:input type="hidden" path="id" id="id"/> --%>
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