package ex2.diref;
// ���� Ŭ���� 
public class MySource {
	private String source;

	public MySource(String source) {
		this.source=source;
	}
	public String reTurnSource() {
		StringBuilder sb = new StringBuilder();
		sb.append("����� ��û�� �ҽ��� :").append(source).append("�Դϴ�.");
		return sb.toString();
	}
}
