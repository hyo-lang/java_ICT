package ex1;

public abstract class Ex2_AbstractSuper {
	private int num;

	public String msg(char ch) {
		return ch + " 이고 에너지는 " + num;
	}
	//추상메서드
	public abstract void myAbstractMethod();
}
