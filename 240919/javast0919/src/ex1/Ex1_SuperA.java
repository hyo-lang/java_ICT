package ex1;
//부모 클래스
public class Ex1_SuperA {
	//상속관계에서 자식이 접근을 허용 안함
	private int num1;
	//default : 같은 패키지에서는 허옹
	int num2;
	// 상속관계에서 다른 패키지에서 허용 
	protected String name;
	// 기본 생성자 정의 - 현재 클래스의 자원을 초기화 하는 것 목적 
	public Ex1_SuperA() {
		num1 = 10000;
		num2 = 20000;
		name = "ICTPassword1기";
		System.out.println("Log: 부모 클래스 생성");
	}
	//getter를 추가 num1, num2에 대해서만...
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
	//이름을 출력 하는 메서드 제공
	public void printA() {
		System.out.println(name+"부모의 메서드 호출!");
	}
}
