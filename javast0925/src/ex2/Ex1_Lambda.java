package ex2;

public class Ex1_Lambda {
	public static void main(String[] args) {
		// 내부클래스 :
		// 익명 내부클래스 :
		MyInter ref = new MyInter() {

			@Override
			public void myMethod() {
				System.out.println("익명 실행 2");
			}
		};
		ref.myMethod();
		System.out.println("============================");
		//람다 표기
		MyInter ref2 = () -> {System.out.println("람다 실행2!");};
		ref2.myMethod();
	}
}
