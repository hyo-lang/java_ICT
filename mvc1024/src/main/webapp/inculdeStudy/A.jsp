<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>A������</h1>
	<%
	//A���� ����
	int num = 10;
	%>
	<%--inculde �����ڸ� ��� 
	inculde �����ڸ� ����� �� A�� ����� B�� ����Ǹ鼭 ABServlet �� �ϳ��� ���ļ� �����ϵȴ�.******
	--%>
	<%@include file="B.jsp"%>
</body>
</html>