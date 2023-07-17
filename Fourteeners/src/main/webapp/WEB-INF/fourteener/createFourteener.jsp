<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>create Fourteener</title>
</head>
<body style="background-color: silver;">

	<h1>Create Fourteener</h1>

	<form action="createFourteener.do" method="POST">


		Title: <input type="text" name="name" value="${fourteener.name}"><br>
		Nearest town: <input type="text" name="nearestTown"value="${fourteener.nearestTown}"><br> 
		Description: <input type="text" name="description" value="${fourteener.description}"><br>
		Peak Elevation: <input type="number" name="maxElevation" value="${fourteener.maxElevation}"><br>
		Elevation Gained: <input type="number" name="elevationGained" value="${fourteener.elevationGained}"><br>



		<button type="submit">Submit Fourteener</button>
		<br>

	</form>





</body>
</html>