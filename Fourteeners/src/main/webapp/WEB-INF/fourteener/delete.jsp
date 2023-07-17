<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<body style ="background-color: silver;">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="deleteFourteener.do" method="POST" id="formDel">
	<p>Do you want to delete this fourteener?</p>
	<input type="hidden" name="fourteenerId" value="${fourteener.id}" />
	<button type="submit">Delete Film</button>
	<br>
</form>
</body>
</html>