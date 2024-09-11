package ex1;
//생성자란 그 클래스의 자원을 초기화한다. ( 객체 초기화 시 사용 )

public class Ex2_Const {
	private int num;

	public Ex2_Const(int num) {
		this.num = num;
		// System.out.println("생성자가 호출 될 때 받은 매개변수 값 : " + num);
	}

	public void myMethod() {
		System.out.println("메서드가 호출 될 때 받은 매게변수 값 : " + num);
	}

	public static void main(String[] args) {
		Ex2_Const ref = new Ex2_Const(100);
		ref.myMethod();
		Ex2_Const ref2 = new Ex2_Const(200);
		ref2.myMethod();
	}
}
