<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fourteeners in Colorado</title>
</head>
<body style ="background-color: silver;">
<body>
	<h1>Fourteener Details</h1>
	<div>
		<h5>${fourteener.name}(${fourteener.nearestTown})</h5>
		<h5>Have I hiked this mountain?</h5>
		<h4>${fourteener.hiked}</h4>
		<p>${fourteener.description}</p>
	</div>
	<form action="deleteFourteener.do" method="POST" id="formDel">
		<p>Do you want to delete this fourteener?</p>
		<input type="hidden" name="fourteenerId" value="${fourteener.id}" />
		<button type="submit">Delete Fourteener</button>
		<br>
	</form>
	<br>
	<form action="updateFourteener.do" method="POST" id="formSave">
	<input type="hidden" name="id" value="${fourteener.id}" />
		Title: <input type="text" name="name"value="${fourteener.name }"><br> 
		Description: <input type="text" name="description"value="${fourteener.description }" /><br>
		Nearest Town: <input type="text" name="nearestTown"value="${fourteener.nearestTown }" /><br>
		<button type="submit">Submit Changes</button>
	</form>

</body>
</html>



