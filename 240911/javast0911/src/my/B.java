package my;

public class B {
	private String msg;
	//생성할 때 특정 문자열을 입력받아서 맴버변수 MSG에 값을 초기화하는
	//생성자를 정의하고
	public B(String msg) {
		this.msg = msg;
		System.out.println("생성자가 호출 될 때 받은 매개변수 값 : " + msg);
	}
	//메인에서 생성자 호출 시 메세지 문자열을 매개변수로 전달해서 생성자를 호출 한 후
	//클래스 안에서 MSG값을 문자열을 반환 해주는 메서드를 정의하고, 메인에서 호출해서 출력 해봅시다
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
