package my;

public class B {
	private String msg;
	
	public B(String msg) {
		this.msg = msg;
		System.out.println("생성자가 호출 될 때 받은 매개변수 값 : " + msg);
	}
	
	public String myMethod() {
		System.out.println("메서드가 호출될 때 받은 매게변수 값 : " + msg);
		return msg;
	}
	
	public static void main(String[] args) {
		B ref = new B("안녕하세요!");
		String  sb = ref.myMethod();
		System.out.println(sb);
	}
}
