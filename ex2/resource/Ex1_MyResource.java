package ex2.resource;
//DI����� �Ǵ� ��ü
public class Ex1_MyResource {
	private String conts;
	public void setConts(String conts) { //�ȳ��ϼ���.
		this.conts = conts;
	}
	//DI�� ���Թ��� Ŭ�������� ȣ���� �޼��� 
	public String resource1() {
		return conts;
	}
}
