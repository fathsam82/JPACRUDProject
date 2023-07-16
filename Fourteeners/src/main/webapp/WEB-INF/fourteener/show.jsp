<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fourteeners in Colorado</title>
</head>
<body>
<h1>Fourteener Details</h1>
<div>
<h5>${fourteener.name} (${fourteener.nearestTown})</h5>
<p>${fourteener.description}</p>
</div>
<form action="deleteFourteener.do" method="POST" id="formDel">
	<p>Do you want to delete this fourteener?</p>
	<input type="hidden" name="fourteenerId" value="${fourteener.id}" />
	<button type="submit">Delete Film</button>
	<br>
</form>

</body>
</html>




