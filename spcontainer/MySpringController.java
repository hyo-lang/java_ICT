package spcontainer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ex1.Ex1_Const;
import ex1.Ex2_ListDemo;


@WebServlet("/MySpringController")
public class MySpringController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String fileName;
	//spring container 선언
	private ApplicationContext ctx;
    public MySpringController() {
    	fileName ="ex1_const";
    }
    @Override
    public void init() throws ServletException {
    	ctx = new GenericXmlApplicationContext("ex1/"+fileName+".xml");
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getBean:id를 사용해서 해당 Ex1_Const 빈을 찾아오기
		Ex1_Const ref = ctx.getBean("ex2", Ex1_Const.class);
		String msg = ref.printConstRes();
		
	    //List 빈을 찾아오기
		Ex2_ListDemo ref2 = ctx.getBean("list", Ex2_ListDemo.class);
		List<String> list = ref2.getStlist();
		
		request.setAttribute("msg", msg);
		request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher(fileName+".jsp");
		rd.forward(request, response);
	}

}
