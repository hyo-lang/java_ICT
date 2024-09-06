package ex1;
//상수 : 프로그램 영역안에서 한번 지정하면 변경할 수 없는 값을 말한다.
//final을 사용함.
//명명규칙 : 대문자로 작성한다. 변수처럼 소문자로 작성하는 경우도 있다.

public class Ex3_Constant {
	// 클래스 영역 선언하는 변수는 맴버필드 (변수,상수)
		// 상수만 설명
	
	static final int MAX_NUM = 132;
	int num = 10; //맴버변수
	public static void main(String[] args) {
		//지역상수
		final int MAX_NUM2 = 13222;
		//상수는 프로그램 영역 안에서 한번 선언하고 초기화 됨
		final int MIN_NUM;
		// 상수를 선언, 초기화 안됨
		//아래의 조건문을 가지고 동적으로 초기화가 가능함!
		if(false) {
			MIN_NUM = 10;
		} else {
			MIN_NUM = 20;
		}
		System.out.println(MIN_NUM);
	}

}
