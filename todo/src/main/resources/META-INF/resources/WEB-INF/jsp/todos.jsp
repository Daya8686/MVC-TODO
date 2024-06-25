<%@ include file="commonContent/header.jspf" %>
<%@ include file="commonContent/navbar.jspf" %>
		<h2>Welcome ${username}</h2>
		<hr>
		<div>
			<a href="add-todo" class="btn btn-success">Add Todo</a>
			<table class="table">
				<thead>
					<tr>

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

							<td>${todo.authorName}</td>
							<td>${todo.courseName}</td>
							<td>${todo.targetDate}</td>
							<td>${todo.isDone}</td>
							<td><a href="update-todo?id=${todo.id}"
								class="btn btn-primary">Update</a></td>
							<td><a href="delete-todo?id=${todo.id}"
								class="btn btn-danger">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	
	<%@ include file="commonContent/footer.jspf"%>