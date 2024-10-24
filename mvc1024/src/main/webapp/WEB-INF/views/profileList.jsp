<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@include file="../../menu.jsp"%>
<%--	request.setAttribute("pList", getProfileList()); --%>
<ul>
<c:forEach var="v" items="${pList}">
	<li>Num : ${v.num}, Name : ${v.name}, Age : ${v.age}</li>
</c:forEach>
</ul>
</body>
</html>