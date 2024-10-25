package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controler.ActionFoward;
import vo.MyProfile;

public class MyProfileAction implements Action{

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
	request.setAttribute("pList", getProfileList());
		
		return new ActionFoward("profileList", false);
	}
	private List<MyProfile> getProfileList(){
		String[] names = {"��ȿ��", "ȿ��", "�Ƹ��", "�긮��", "�ȳ�"};
		int[] age = {30, 32, 29, 20, 15};
		List<MyProfile> profileList = new ArrayList<MyProfile>();
		for(int i=0; i< names.length; i++) {
			MyProfile v = new MyProfile();
			v.setNum(i+1);
			v.setName(names[i]);
			v.setAge(age[i]);
			profileList.add(v);
		}
		return profileList;
	}
}
