package ex2.diref;
// 사용될 클래스 
public class MySource {
	private String source;

	public MySource(String source) {
		this.source=source;
	}
	public String reTurnSource() {
		StringBuilder sb = new StringBuilder();
		sb.append("당신이 요청한 소스는 :").append(source).append("입니다.");
		return sb.toString();
	}
}
