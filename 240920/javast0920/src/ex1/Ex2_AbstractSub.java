package ex1;
//추상메서드(강제구현=재정의강제)를 가진 추상클래스 즉 부모를 상속받은
//자식은 반드시 추상메서드를 재정의 해야 한다.
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
