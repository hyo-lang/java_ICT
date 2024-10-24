package ex1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jdbc.naming.GenericNamingResourcesFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@WebServlet("/Ex1HelloDiDemo")
public class Ex1HelloDiDemo extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	// 스프링 Container
	private ApplicationContext ctx;
    public Ex1HelloDiDemo() {
    	
    }
    // 스프링 컨테이너는 ex1.xml에 작성한 빈을 미리 생성해서 올려놓는다
    // 그리고 그 빈은 기본이 싱글톤이다.
    @Override
    public void init() throws ServletException {
    	ctx = new GenericXmlApplicationContext("ex1/ex1.xml");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get이겠지");
		// 생성된 주소를 스프링컨테이너로부터 받아서 HelloBean으로 반환받음
		HelloBeen hb = ctx.getBean("hello", HelloBeen.class);
		String msg = hb.helloMes();
		request.setAttribute("msg", msg);
		RequestDispatcher rd = request.getRequestDispatcher("ex1.jsp");
		rd.forward(request,response);
	}

}
