package ex1;
// static => 생성없이 자원에 접근 가능, 오직 static영역에 하나만 생성이 되기 때문에
// 다른 객체들이 공유의 목적으로 사용한다.
public class Ex1_StaticBasic {

	//static은 생성 없이 사용이 가능하다.
	static int num1=100;
	
	public static void testMethod() {
		System.out.println(num1+"는 static 자원을 사용한다.");
	}
	//main또한 static메서드이다. 
	public static void main(String[] args) {
		//Ex1_StaticBasic ref = new Ex1_StaticBasic();//객체 생성(인스턴스화)
		
		// 클래스이름.static자원[속성,메서드] 사용
		// static속성 사용
		int locNum = Ex1_StaticBasic.num1; //100이 저장
		System.out.println(locNum);
		System.out.println(num1);
		// static메서드 호출
		Ex1_StaticBasic.testMethod(); // 대외용
		testMethod(); //내부적으로 호출할 때
		
		
	}
}
