package ex2.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//AutoWired : �ڵ��� ���� , �������� �ڵ����� ����  *****
//byName, byType�����ϱ� 
public class Ex1_AutoWired {
	// ByType�� ��� ���� �ڷ����� �˻��� ��쿡 ���ľ ó���� �� �ִ�.
	// ���ľ�� byName���� ���ϴ�.
	@Autowired
	@Qualifier("ictToday")
	private String msg;
//	@Autowired
//	public void setMsg(String msg) {
//		this.msg = msg;
//	}
	public String getMessage() { //�����Ͻ� ����
		StringBuffer sb= new StringBuffer();
		sb.append("<p style='color:blue'>");
		sb.append(msg.charAt(0)).append(",");
		sb.append(msg);
		sb.append("</p>");
		return sb.toString();
	}
}
