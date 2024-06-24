<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet">
<title>List Todos page</title>

</head>
<body>
<div class="container">
	<h2>Welcome ${username}</h2>
	<hr>
	<div>
	<a href="add-todo" class="btn btn-success">Add Todo</a>
		<table class="table">
			<thead>
				<tr>
					<th>Todo Id</th>
					<th>Author</th>
					<th>Course Name</th>
					<th>Target Date to complete</th>
					<th>Completion ?</th>
					<th></th>
					<th></th>
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
						<td><a href="update-todo" class="btn btn-primary">Update</a></td>
						<td><a href="delete-todo" class="btn btn-danger">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	</div>
<script src="webjars/bootstrap/5.3.2/js/bootstrap.bundle.min.js" type="text/javascript"></script>
<script src="webjars/jquery/3.7.1/jquery.min.js" type="text/javascript"></script>
</body>
</html>