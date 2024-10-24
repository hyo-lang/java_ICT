package ex1;
//스프링이 관리할 객체
public class HelloBeen {
	//자원
	private String msg;
	
	public HelloBeen() {
		System.out.println("HelloBeen 기본 생성자 호출!");
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
		System.out.println("스프링에 의해서 메세지를 DI 받음");
	}
	//======================================================
	public String helloMes() {
		return msg;
	}
}
