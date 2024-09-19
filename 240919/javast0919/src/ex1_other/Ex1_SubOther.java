package ex1_other;
// 다른 패키지에서 상속일 때 접근제한자를 테스트 
import ex1.Ex1_SuperA;

//Ex1_SuperA 상속하고
//main에서 자식 클래스를 참조자료형으로 생성해보기 
public class Ex1_SubOther extends Ex1_SuperA{

	//생성자를 정의 
	public Ex1_SubOther() {
		super();
		System.out.println("Other 자식 Class  생성");
		//상속관계에서는 접근 가능하다.
		System.out.println("protect =>"+name);
	}
	public static void main(String[] args) {
		Ex1_SubOther ref = new Ex1_SubOther();
	}
}
