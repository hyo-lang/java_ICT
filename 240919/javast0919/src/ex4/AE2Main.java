package ex4;

public class AE2Main {
public static void main(String[] args) {
	// 큰 자료형(부모) -> 작은 자료형(자식) : Demotion, casting 
	// A ref 주소 범위는 : A  > B > D
	// Demotion 의미) A를 보는 주소 ref에서 자식까지를 범위를 넓힌다.
	// A ref = new D("type1"); // 참조 범위는 A의 자원과, 오버라이딩된 자식의 메서드 실행
	// D ref = new D("type1"); //->A~ 자식인D까지 참조할 수 있다.
	// B ref = new D("type1"); //->A~ 자식인B까지 참조할 수 있다.
	System.out.println("Demotion ==============");
	//A를 참조하는 변수값을 다시 D로 참조 시킨다.(캐스팅)
	A ref = new D("type1_1");
	//이주소로 무엇을 할 수 있나? : A만 참조가능하다.
	ref.aMethod();
	//참조영역을 넓히기 위해서 캐스팅을 한다.
	D ref2 = (D) ref;
	//이주소로 무엇을 할 수 있나? : 이주소로 A ~ D까지의 자원을 참조 할 수 있다. *****
	ref2.aMethod();
	ref2.bMethod();
	ref2.dMethod();
	// 문제) ClassCastException 발생하는 이유는?
	E refx = (E) ref;
	refx.testA();
}
}



