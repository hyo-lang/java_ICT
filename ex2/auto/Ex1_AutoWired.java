package ex2.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//AutoWired : 자동빈 묶기 , 의존성을 자동으로 연결  *****
//byName, byType구분하기 
public class Ex1_AutoWired {
	// ByType일 경우 같은 자료형이 검색될 경우에 수식어를 처리할 수 있다.
	// 수식어는 byName보다 강하다.
	@Autowired
	@Qualifier("ictToday")
	private String msg;
//	@Autowired
//	public void setMsg(String msg) {
//		this.msg = msg;
//	}
	public String getMessage() { //비지니스 로직
		StringBuffer sb= new StringBuffer();
		sb.append("<p style='color:blue'>");
		sb.append(msg.charAt(0)).append(",");
		sb.append(msg);
		sb.append("</p>");
		return sb.toString();
	}
}
