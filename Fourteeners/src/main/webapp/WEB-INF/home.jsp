<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<body style ="background-color: tan;">
<meta charset="UTF-8">
<title>Fourteeners</title>
</head>
<body>

<h1>Fourteeners</h1>

<form action="getFourteener.do" method="GET">
  Fourteener ID: <input type="text" name="id" />
  <input type="submit" value="Show Fourteener" />
</form>

	<style>
a {
	color: green;
}

</style>

<a href="getCreateFourteener.do">Create Fourteener</a><br/>


</body>
</html>