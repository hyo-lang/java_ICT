package ex1;
//추상클래스의 문법 기초
//클래스 선언에 abstract 키워드를 붙임 - 추상클래스
//new 연산자를 이용해서 객체를 직접 만들지 못하고 상속을 통해 자식 클래스만 만들 수 있다.
public abstract class Ex1_AbstractSuper {

	private int num;
	//일반메서드
	public String msg(char ch) {
		return ch + " 이고 에너지는 " + num;
	}

	public static void main(String[] args) {
		// 추상메서드가 존재하지않아도 abstract를 붙이면 [추상] 클래스이다.
		// 목적은? 명시적 객체 생성을 허용 안한다, 반드시 상속으로..
		// 그러나 익명내부클래스로 정의하고 생성이 가능하다. *****
		// 익명 내부 클래스이다.
		Ex1_AbstractSuper ref = new Ex1_AbstractSuper() {

			@Override
			public String msg(char ch) {
				return ch + " 익명이 재정의한 메서드";
			}
	
		};
		
		System.out.println(ref.msg('A'));
	}
}
