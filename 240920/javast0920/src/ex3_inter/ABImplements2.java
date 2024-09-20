package ex3_inter;

public class ABImplements2 implements A, B {

	@Override
	public void bcd() {
		System.out.println("interface의 상수 참조 : " + b);

	}

	@Override
	public void abc() {
		System.out.println("interface의 상수 참조 : " + a);
		System.out.println("interface의 상수 참조 : " + A.a);

	}

	public static void main(String[] args) {
		A ref = new ABImplements2();
		ref.abc();
		B ref1 = new ABImplements2();
		ref1.bcd();
	}
}
