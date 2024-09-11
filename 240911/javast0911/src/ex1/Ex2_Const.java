package ex1;
//<기본 생성자>
// 기본 생성자 : 개발자가 어떠한 생성자도 정의 하지 않으면
// 컴파일러가 만들어 주는 인자가 없는 생성자
// 만약 개발자가 특정 생성자 <매개변수가 있는 생성자>를 만들어 정의하면 컴파일러는 기본생성자를 제공하지 않는다.
//생성자란 그 클래스의 자원을 초기화한다. ( 객체 초기화 시 사용 )

public class Ex2_Const {
	private int num;
	//매개변수가 1개 있는 생성자
	public Ex2_Const(int num) {
	//맴버필드 num에 매개변수로 입력받은 값을 저장한다.
		this.num = num;
		System.out.println("생성자가 호출 될 때 받은 매개변수 값 : " + num);
	}
	//메서드
	public void myMethod() {
		System.out.println("메서드가 호출 될 때 받은 매게변수 값 : " + num);
	}
	public static void main(String[] args) {
		//객체를 생성
		Ex2_Const ref = new Ex2_Const(100);
		ref.myMethod();
		Ex2_Const ref2 = new Ex2_Const(200);
		ref2.myMethod();
	}
}
