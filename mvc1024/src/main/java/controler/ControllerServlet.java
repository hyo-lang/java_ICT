package controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Action;

@WebServlet(description = "��Ʈ����", urlPatterns = { "*.ict" })
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControllerServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	// get/post �Ѵ� �����ϴ� �޼���
	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ��û�� ���� ���ڵ�
		request.setCharacterEncoding("UTF-8");
		// ��û�� ���� �Ķ���� cmd
		String cmd = request.getParameter("cmd");
		//// http://localhost/mvc1024/mt.ict?cmd=index
		if (cmd != null) {
			ActionFactory factory = ActionFactory.getFactory();
			Action action = factory.getAction(cmd);
			ActionFoward af = action.execute(request, response);
			if (!af.isMethod()) {
				String path = "/WEB-INF/views/" + af.getVname() + ".jsp";
				RequestDispatcher rd = request.getRequestDispatcher(path);
				rd.forward(request, response);
			} else {
				response.sendRedirect(af.getVname());
			}
		} else {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset=\"EUC-KR\">");
			out.println("<title>Insert title here</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h3 style=\"color: red\">�������� ��û�� �ƴմϴ�</h3>");
			out.println("<a href=\"index.jsp\">�������� ����</a>");
			out.println("</body>");
			out.println("</html>");
		}
	}

}