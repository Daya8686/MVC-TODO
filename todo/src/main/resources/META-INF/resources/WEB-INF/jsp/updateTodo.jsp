<%@ include file="commonContent/header.jspf"%>
<%@ include file="commonContent/navbar.jspf"%>

 <form:form class="form" modelAttribute="todo">
<div class="row mb-3">
        <div class="col-md-3">
            <form:label path="courseName">Enter Course Name: </form:label>
            <form:input path="courseName" type="text" class="form-control" />
            <form:errors path="courseName" cssClass="text-danger" />
        </div>
        <div class="col-md-3">
            <form:label path="targetDate">Target Date: </form:label>
            <form:input path="targetDate" type="text" class="form-control" id="targetDate" />
            <form:errors path="targetDate" cssClass="text-danger" />
        </div>
        <div class="col-md-3">
            <form:label path="authorName">Author Name: </form:label>
            <form:input path="authorName" type="text" class="form-control" />
            <form:errors path="authorName" cssClass="text-danger" />
        </div>
        <div class="col-md-3">
            <form:label path="isDone">Status: </form:label>
            <form:select path="isDone" class="form-control">
                <form:option value="true">Completed</form:option>
                <form:option value="false">Pending</form:option>
            </form:select>
        </div>
    </div>
    <div class="row mb-3">
        <div class="col-md-3">
            <input type="submit" class="btn btn-success" value="Submit">
        </div>
    </div></form:form>



<%@ include file="commonContent/footer.jspf"%>
<script type="text/javascript">
	$('#targetDate').datepicker({
		format : 'yyyy-mm-dd',
	});
</script>