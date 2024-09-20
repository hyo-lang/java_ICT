package ex1;
//추상메서드
//일반 메서드선언과의 차이점은 abstract 키워드가 붙고, 메서드실행 내용인 중괄호 {} 가 없다.
//추상메서드 가진 클래스는 반드시 추상 클래스여야 한다.

public abstract class Ex2_AbstractSuper {
	//맴버필드
	private int num;
	//일반 메서드
	public String msg(char ch) {
		return ch + " 이고 에너지는 " + num;
	}
	//추상메서드 정의
	public abstract void myAbstractMethod();
}
