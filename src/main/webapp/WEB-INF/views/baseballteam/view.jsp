<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>球団名</h2><br>
<c:out value="${team.teamName}"></c:out><br>

<h2>本拠地</h2><br>
<c:out value="${team.headquarters}"></c:out><br>

<h2>発足</h2>
<c:out value="${team.inauguration}"></c:out><br>

<h2>歴史</h2><br>
<pre><c:out value="${team.history}"></c:out></pre>

</body>
</html>