<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fourteeners in Colorado</title>
</head>
<body style="background-color: tan;">
<body>
	<h1>Fourteener Facts</h1><style>a {color: green;}</style><a href="/">Look up more Fourteeners!</a>
	<div>
		<h5>${fourteener.name}(${fourteener.nearestTown})</h5>
		<h4>Have I hiked this mountain?</h4>
		<h5>${fourteener.hiked ? fourteener.hiked : 'false'}</h5>
		<h5>${fourteener.elevationGained}</h5>
		<h5>${fourteener.maxElevation}</h5>
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
		<input type="hidden" name="id" value="${fourteener.id}" /> Name: <input
			type="text" name="name" value="${fourteener.name }"><br>
		Description: <input type="text" name="description"
			value="${fourteener.description }" /><br> Nearest Town: <input
			type="text" name="nearestTown" value="${fourteener.nearestTown }" /><br>
		Have Hiked: <input type="text" name="hiked"
			value="${fourteener.hiked != null ? fourteener.hiked : 'false'}" /><br>
		<button type="submit">Submit Changes</button>
	</form>


</body>
</html>



