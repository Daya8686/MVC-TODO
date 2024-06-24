<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet">
<title>Welcome to TODO application</title>
</head>
<body>
<div class="container">
<h2>Welcome to TODO Application</h2>
<hr>
<pre>${error}</pre>
<form method="post">
Username:<input type="text" name="username" placeholder="User Name">
Password:<input type="password" name="password" placeholder="Password">
<input type="submit" value="Login" class="btn btn-primary">
</form>
</div>
<script src="webjars/bootstrap/5.3.2/js/bootstrap.bundle.min.js" type="text/javascript"></script>
<script src="webjars/jquery/3.7.1/jquery.min.js" type="text/javascript"></script>
</body>
</html>