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
		<li>ActionFowerd : ���� �����ϰ� �� �� view�̸�, �̵������ ������ �ִ� Ŭ����</li>
		<li>Action interface ���� : �߻�޼���� ������ -> Factory -> Model ���������ϴ�
			�߻�޼��� �Ű�������, request, response�� �޾ƾ��Ѵ�. ��Ʈ�Ѽ��������� ȣ��� �� ��ȯ�Ǵ�
			ActionFowerd ���� ActionFowerd execute(req, rest) throws~;</li>
		<li>Action interface�� ������ ���߿� �׽�Ʈ�� ���� HelloAction�� �����.</li>
		<li>ActionFactory : Controller�� Model ���̿� �������� �����ϱ� ���ؼ� ���� �����ϰ�
			�����ϴ� ���� (å�Ӻи�)</li>
		<li>ContrilServlet : ������� ��û�� �޾Ƽ� ActionFactory���� �����ϰ� ������ ����
			Action���� ��ȯ�޾Ƽ� Action�� �߻�޼��带 ȣ���ؼ� ��Ʈ�ѷ��� ������ �۾��� �����ϴ� Ŭ���� �ۼ��ϱ�</li>
	</ol>
	<%@include file="menu.jsp"%>
</body>
</html>