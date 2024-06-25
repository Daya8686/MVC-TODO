<%@ include file="commonContent/header.jspf" %>
<%@ include file="commonContent/navbar.jspf" %>
<h2>Welcome to TODO Application</h2>
<hr>
<pre>${error}</pre>
<form method="post">
Username:<input type="text" name="username" placeholder="User Name">
Password:<input type="password" name="password" placeholder="Password">
<input type="submit" value="Login" class="btn btn-primary">
</form>
<%@ include file="commonContent/footer.jspf"%>