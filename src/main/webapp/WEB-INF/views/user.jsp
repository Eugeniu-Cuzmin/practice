<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User</title>
</head>
<body>
	<h1>Hello ${user.name}</h1>

	<a href="${pageContext.request.contextPath}/addArticle/${user.id}">Add
		article</a>
	<a href="${pageContext.request.contextPath}/">Home page</a>

	<table style="text-align: center;" border="1px" cellpadding="0"
		cellspacing="0">
		<thead>
			<tr>
				<th width="25px">id</th>
				<th width="150px">title</th>
				<th width="150px">reviews</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="article" items="${user.articles}">
				<tr>
					<td>${article.articleId}</td>
					<td>${article.name}</td>
					<td><a href="${pageContext.request.contextPath}/review/${article.articleId}">reviews</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>