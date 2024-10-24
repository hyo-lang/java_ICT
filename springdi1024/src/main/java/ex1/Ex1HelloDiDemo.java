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
	// ������ Container
	private ApplicationContext ctx;
    public Ex1HelloDiDemo() {
    	
    }
    // ������ �����̳ʴ� ex1.xml�� �ۼ��� ���� �̸� �����ؼ� �÷����´�
    // �׸��� �� ���� �⺻�� �̱����̴�.
    @Override
    public void init() throws ServletException {
    	ctx = new GenericXmlApplicationContext("ex1/ex1.xml");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get�̰���");
		// ������ �ּҸ� �����������̳ʷκ��� �޾Ƽ� HelloBean���� ��ȯ����
		HelloBeen hb = ctx.getBean("hello", HelloBeen.class);
		String msg = hb.helloMes();
		request.setAttribute("msg", msg);
		RequestDispatcher rd = request.getRequestDispatcher("ex1.jsp");
		rd.forward(request,response);
	}

}
