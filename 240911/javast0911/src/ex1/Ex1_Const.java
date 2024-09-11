package ex1;
//생성자란 클래스를 객체로 생성하기 위해서 메서드 처럼 정의 해놓는 문법
//생성자 정의 문법
/* - 생성자의 이름은 클래스의 명과 동일하다.
 * - 반환형이 없다
 * - public 클래스 이름 () {
 *  실행문
 // }
//사용: 호출 -> new 생성자 호출() ex) new Ex1_Const();
 /*<기본 생성자>
  * 기본 생성자 : 개발자가 어떠한 생성자도 정의 하지 않으면
  * 컴파일러가 만들어 주는 인자가 없는 생성자
  */
 
 
public class Ex1_Const {
	// 기본 생성자 정의해보기
	public Ex1_Const() {
		System.out.println("기본 생성자 호출!");
	}
	
	public void test1 () {
		
	}
	
	public static void main(String[] args) {
		Ex1_Const ref = new Ex1_Const();
		ref.test1();
	}
}
