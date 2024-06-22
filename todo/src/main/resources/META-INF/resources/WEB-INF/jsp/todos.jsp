<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Todos page</title>
</head>
<body>
	<div>Welcome ${username}</div>
	<hr>
	<div>
		<table>
			<thead>
				<tr>
					<th>Todo Id</th>
					<th>Author</th>
					<th>Course Name</th>
					<th>Target Date to complete</th>
					<th>Completion ?</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.id}</td>
						<td>${todo.authorName}</td>
						<td>${todo.courseName}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.isDone}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>