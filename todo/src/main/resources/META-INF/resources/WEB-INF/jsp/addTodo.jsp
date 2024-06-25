<%@ include file="commonContent/header.jspf" %>
<%@ include file="commonContent/navbar.jspf" %>
		<form:form class="form" modelAttribute="todo">
		<fieldset class="mb-3">
			<form:label path="courseName">Enter Course Name: </form:label>
			<form:input path="courseName" type="text" />
			<form:errors path="courseName" cssClass="text-danger" />
			</fieldset>
			<fieldset class="md-3">
			<form:label path="targetDate">Target Date: </form:label>
			<form:input path="targetDate" />
			<form:errors path="targetDate" cssClass="text-danger"/>
			</fieldset>
			<form:input path="authorName" type="hidden" />
			<br>
			<form:input path="targetDate" type="hidden" />
			<br>
			<input type="submit" class="btn btn-success">


		</form:form>
	

	
<%@ include file="commonContent/footer.jspf"%>
<script type="text/javascript">
	$('#targetDate').datepicker({
	    format: 'yyyy-mm-dd',
	});
	</script>