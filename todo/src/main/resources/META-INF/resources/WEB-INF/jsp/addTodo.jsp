<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet">
<title>Add TODO</title>
</head>
<body>
<div class="container">
<form:form class="form" modelAttribute="todo">
<form:label path="courseName">Enter Course Name: </form:label>
<form:input path="courseName" type="text"/>
<form:errors path="courseName" cssClass="text-danger"/>
<br>
<form:input path="authorName" type="hidden"/>
<br>
<form:input path="targetDate" type="hidden"/>
<br>
<input type="submit" class="btn btn-success">


</form:form>
</div>

<script src="webjars/bootstrap/5.3.2/js/bootstrap.bundle.min.js" type="text/javascript"></script>
<script src="webjars/jquery/3.7.1/jquery.min.js" type="text/javascript"></script>
</body>
</html>