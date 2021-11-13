<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>SPRING MISSION 004</title>
</head>
<body>
<h1>
	SPRING MISSION 004
</h1>
<form method="get" action="board/register">
<input type="submit" value="register(GET)">
</form>

<form method="post" action="board/register">
<input type="submit" value="register(POST)">
</form>

<form method="get" action="board/modify">
<input type="submit" value="modify(GET)">
</form>

<form method="post" action="board/modify">
<input type="submit" value="modify(POST)">
</form>

<form method="get" action="board/read">
<input type="text" id="boardno" name ="boardno">
<input type="submit" value="read(GET)">
</form>

<form method="get" action="board/list">
<input type="submit" value="list(GET)">
</form>

<form method="post" action="board/modify">
<input type="submit" value="remove(POST)">
</form>

</body>
</html>
