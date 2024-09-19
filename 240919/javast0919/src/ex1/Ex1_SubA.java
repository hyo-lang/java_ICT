package ex1;

import javax.swing.JFrame;

//상속관계 키워드 : extends <부모클래스>
//부모의 자원을 접근제한자 범위 내에서 자식클래스가 활용할 수 있다.
public class Ex1_SubA extends Ex1_SuperA {
	// 자식의 속성
	private int mynum;

	// 자식의 기본 생성자
	public Ex1_SubA() {
		// 부모의 기본 생성자를 호출 : 생성이 됨!
		// 기본 생성자일 경우 생략이 되어도 컴파일러가 만들어 줌.
		// super();
		mynum = 50000;
		System.out.println("자식의 생성자 호출");
	}

	public void printB() {
		System.out.println(mynum);
		System.out.println("자식의 메서드 호출 해보기 ----------------");
		System.out.println(getNum1() + ": 부모의 자원");
		System.out.println(getNum2() + ": 부모의 자원");
		System.out.println("부모의 " + name + "입니다.");
	}

	public static void main(String[] args) {
		// case1
		// 자식을 참조 자료형으로 생성
		// 부모,자식도 참조 -> Ex1_SubA
		// Ex1_SubA ref = new Ex1_SubA();
		// 자식은 상속관계에서 부모의 자원을 자기것인것 처럼 사용한다.
		// int num = ref.getNum1();
		// 상속관계에서 default,protected의 속성은 접근이 가능하다.
		// System.out.println(ref.num1); //private 은 자식이 참조 불가능
		// System.out.println(ref.num2);
		// System.out.println(ref.name);
		// ref.printA(); // 부모
		// ref.printB();//자식

		// case2
		// 부모를 참조 자료형으로 생성
		// 부모 참조 ref2
		// 참조자료형이 부모일 경우에는 부모의 자원만 접근이 가능하다. =******
		// 부모자료형 변수 = new 자식생성자호출(); //부모와 자식이 생성이 됨
		Ex1_SuperA ref2 = new Ex1_SubA();
		//부모의 메서드는 호출이 가능
		ref2.printA();
		//ref.printB(); //위의 참조자료형은 부모를 참조해서 생성된 자식의 자원은 호출 안됨!

	}
}
