package ex1;

public class Ex2_AbstractSub extends Ex2_AbstractSuper {

	@Override
	public void myAbstractMethod() {
		System.out.println("부모의 추상메서드를 강제로 재정의함!");
	}
	public static void main(String[] args) {
		Ex2_AbstractSuper ref = new Ex2_AbstractSub();
		ref.myAbstractMethod();
	}

}
