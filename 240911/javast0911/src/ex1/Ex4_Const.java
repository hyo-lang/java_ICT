package ex1;
//메서드에서 this의 의믜와 같다
//생성자 목적 : 현재 객체를 생성할 때 초기화 하는 목적

public class Ex4_Const {
	//자원을 초기화
	private int num;
	private String name;
	private int age;
	private String typev;
	//기본 생성자로 초기화
	public Ex4_Const() {
		num = 1;
		name = "김길동";
		age = 18;
		typev = "미성년자다";

		System.out.println("기본 생성자 호출 : ");
	}
	//또 다른 초기화 방법을 제공하겠다. -> 생성자 오버로딩
	public Ex4_Const(int num,String name,int age) {
		this.num = num;
		this.name = name;
		this.age = age;
		this.typev = typev;
		if (age < 19) {
			typev = " 미성년자다";
		} else {
			typev = "성인이다.";
		}
		printMethod();
	}
	
	private void printMethod() {
		System.out.println("num : " + num);
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("typev : " + typev);
	}
	//다른 클래스의 메인
	public static void main(String[] args) {
		Ex4_Const ref = new Ex4_Const();
		System.out.println("=================");
		Ex4_Const ref2 = new Ex4_Const(2, "테스형", 30);
	}
}
