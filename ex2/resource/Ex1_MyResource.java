package ex2.resource;
//DI대상이 되는 객체
public class Ex1_MyResource {
	private String conts;
	public void setConts(String conts) { //안녕하세요.
		this.conts = conts;
	}
	//DI후 주입받은 클래스에서 호출할 메서드 
	public String resource1() {
		return conts;
	}
}
