<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>プロ野球セントラル・リーグ一覧</h1>

<c:forEach var="team" items="${teamList}">
<a href="/team/view?id=${team.id}"><c:out value="${team.team_name}" /></a><br>
</c:forEach>


</body>
</html>