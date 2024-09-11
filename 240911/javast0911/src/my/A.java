package my;

public class A {
	private String msg;
	//생성할 때 특정문자열을 입력받아서 멤버변수 msg에 값을 초기화 하는 
	//생성자를 정의하고 
	public A(String msg) {
		this.msg=msg;
	}
	// 메인에서 생성자 호출시 메세지 문자열을 매개변수로 전달해서 생성자를 호출 한 후
	// 클래스 안에서 msg값을 문자열을 반환 해주는 메서드를 정의하고, 메인에서 호출해서 출력 해봅시다.
	public String getB() {
		return msg +"생선은 맛있다.";
	}
	public static void main(String[] args) {
		A ref = new A("고등어");
		String mm = ref.getB();
		System.out.println(mm);
		A ref1 = new A("갈치");
		System.out.println(ref1.getB());
	}

}
