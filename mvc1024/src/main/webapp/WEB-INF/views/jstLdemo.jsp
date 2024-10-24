<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>기본 for문</h2>
	<c:forEach begin="1" end="10" step="1" varStatus="num">
		<c:if test="${num.count<6}">
			<p style="background-color: orange;">${num.count}</p>
		</c:if>
		<p style="background-color: lightblue;">${num.count}</p>
	</c:forEach>
	<h2>기본 for[if 테스트]</h2>
	<c:forEach begin="1" end="10" step="1" varStatus="num">
		<c:choose>
			<c:when test="${num.count % 2 == 0}">
				<p style="background-color: orange;">${num.count}</p>
			</c:when>
			<c:otherwise>
				<p style="background-color: lightblue;">${num.count}</p>
			</c:otherwise>
		</c:choose>
	</c:forEach>
	<h2>모델에서 가져온 값 출력해보기</h2>
	<ol>
		<c:forEach var="m" items="${moveList}">
			<li>Name : ${m}</li>
		</c:forEach>
	</ol>
</body>
</html>