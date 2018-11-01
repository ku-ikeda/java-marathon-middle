<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 金額入力フォーム -->
	<h2>ホテル検索</h2>
	<form:form action="${pageContext.request.contextPath}/hotel/findByPrice" method="post">
	一泊料金<input type="text" name="price">以下<br>
	<input type="submit" value="検索">
	</form:form>
	
	<!-- 表示部分 -->
	<table border="1">
	<c:forEach var="hotel" items="${hotelList}">
	<tr>
		<td>ホテル名：</td>
		<td><c:out value="${hotel.hotelName}"></c:out></td>
	</tr>
	
	<tr>
		<td>最寄り駅：</td>
    	<td><c:out value="${hotel.nearestStation}"></c:out></td>
	</tr>
	
	<tr>
		<td>料金</td>
		<td><c:out value="${hotel.price}"></c:out></td>
	</tr>
	
	
	</c:forEach>
	</table>
</body>
</html>