 <c:url var="saveOrUpdateUrl" value="/app/post/saveOrUpdate" />
 <form:form action="${saveOrUpdateUrl}" method="post" modelAttribute="postForm" id="postForm">
<form:input path="message"/>
<input name="saveBtn" value="Save" type="submit">
</form:form>