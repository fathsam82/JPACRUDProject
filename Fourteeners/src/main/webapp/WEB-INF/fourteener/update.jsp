<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Fourteener</title>
</head>
<body>
<form action="saveFourteener.do" method="POST" id="formSave">
Name: <input type = "text" name="fourteenerInfo" value= "${fourteener.name }"><br>
Description: <input type="text" name="fourteenerInfo" value= "${fourteener.description }" /><br>
Nearest Town: <input type="text" name="fourteenerInfo" value= "${fourteener.nearestTown }" /><br>
<button type="submit">Submit Changes</button>
</form>


</body>
</html>
 --%>