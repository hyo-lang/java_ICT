package model;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controler.ActionFoward;

public class JSTLDemoAction implements Action {

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//PDF forEach ���� ����
		String[] moveList = {"�ƹ�Ÿ3", "���׶�2", "����3", "��Ŀ2","����� ������"};
		request.setAttribute("moveList", moveList);
		
		return new ActionFoward("jstLdemo",false);
	}
	
}