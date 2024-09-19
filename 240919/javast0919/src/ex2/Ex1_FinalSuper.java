package ex2;

//class에 final - 상속불가 클래스
public  class Ex1_FinalSuper {
	// 메소드를 선언할 때 final 키워드를 붙이면 오버라이딩할 수 없음
	public final void finalMethod() {
		System.out.println("Final메서드는 재정의  불가 ");
	}
	// 오버라이딩 가능하다.
	public void unfinalMethod() {
		//System.out.println("unfinalMethod");
	}
}
