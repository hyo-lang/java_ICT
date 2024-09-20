package ex1;

//추상클래스의 문법 기초
public abstract class Ex1_AbstractSuper {

	private int num;

	public String msg(char ch) {
		return ch + " 이고 에너지는 " + num;
	}

	public static void main(String[] args) {
		// 추상메서드가 존재하지않아도 abstract를 붙이면 [추상] 클래스이다.
		// 목적은? 명시적 객체 생성을 허용 안한다, 반드시 상속으로..
		// 그러나 익명내부클래스로 정의하고 생성이 가능하다. *****
		// 익명 내부 클래스이다.
		Ex1_AbstractSuper ref = new Ex1_AbstractSuper() {
		};
		
		System.out.println(ref.msg('A'));
	}
}
