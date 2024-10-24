<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>A페이지</h1>
	<%
	//A에서 선언
	int num = 10;
	%>
	<%--inculde 지시자를 사용 
	inculde 지시자를 사용할 때 A가 실행될 B도 실행되면서 ABServlet 즉 하나로 합쳐서 컴파일된다.******
	--%>
	<%@include file="B.jsp"%>
</body>
</html>