<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Model2 Page</h1>
	<ol>
		<li>ActionFowerd : 모델이 실행하고 난 후 view이름, 이동방식을 가지고 있는 클래스</li>
		<li>Action interface 제작 : 추상메서드로 서블릿 -> Factory -> Model 구현해햐하는
			추상메서드 매개변수가, request, response를 받아야한다. 컨트롤서블릿에게 호출된 후 반환되는
			ActionFowerd 정의 ActionFowerd execute(req, rest) throws~;</li>
		<li>Action interface를 구현한 모델중에 테스트를 위한 HelloAction을 만든다.</li>
		<li>ActionFactory : Controller와 Model 사이에 유연함을 제공하기 위해서 모델을 생성하고
			관리하는 역할 (책임분리)</li>
		<li>ContrilServlet : 사용자의 요청을 받아서 ActionFactory에게 전달하고 조립된 모델을
			Action으로 반환받아서 Action의 추상메서드를 호출해서 컨트롤러가 수행할 작업을 실행하는 클래스 작성하기</li>
	</ol>
	<%@include file="menu.jsp"%>
</body>
</html>