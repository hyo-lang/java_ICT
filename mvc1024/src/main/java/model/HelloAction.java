package model;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controler.ActionFoward;

// � ���� ���� �� ���ΰ�
// ��û�� //main.ict?cmd=hello �����ϴ� ��
public class HelloAction implements Action{

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//true -> redirect -> mystudy.ict?cmd=newTest
		//false -> forward -> hello.jsp
		String msg  = "�ȳ��ϼ��� ���� ù��° MVC�Դϴ�.";

		request.setAttribute("msg", msg);

		return new ActionFoward("hello", false); // "���� �̸�",�̵���ġ-��������
	}

}