package aopspring;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Servlet implementation class AopDemoServlet
 */
@WebServlet("/AopDemoServlet")
public class AopDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//스프링 컨테이너를 선언한다.
	private ApplicationContext ctx;
	public void init() throws ServletException {
		ctx = new GenericXmlApplicationContext("aopspring/ex1_aop.xml");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DaoInter dao = ctx.getBean("dao", DaoInter.class);
		//System.out.println(dao.firstStatementTest(1));// statement 테스트 -- 수행 된 속도 :3504초
		System.out.println(dao.firstStatementTest(2)); //PreparedStatement   수행 된 속도 :1819초
	}

}
