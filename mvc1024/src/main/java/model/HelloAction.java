package model;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controler.ActionFoward;

// 어떤 모델을 정의 할 것인가
// 요청이 //main.ict?cmd=hello 동작하는 모델
public class HelloAction implements Action{

	@Override
	public ActionFoward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//true -> redirect -> mystudy.ict?cmd=newTest
		//false -> forward -> hello.jsp
		String msg  = "안녕하세요 나의 첫번째 MVC입니다.";

		request.setAttribute("msg", msg);

		return new ActionFoward("hello", false); // "뷰의 이름",이동위치-포워드방식
	}

}
