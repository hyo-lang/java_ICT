package ex2.lambda;

import ex2.MyInter;

public class AImple implements AInter {

	@Override
	public void methodA() {
		System.out.println("A를 구현한 객체의 메서드");

	}
	public void myRefCall(AInter inter) {
		inter.methodA();
	}
	public static void main(String[] args) {
		AInter ref = new AImple();
		ref.methodA();
		System.out.println("========================");
		
		new AInter() {
			@Override
			public void methodA() {
				System.out.println("익명 A 객체의 메서드");
			}
		}.methodA();
		System.out.println("========================");
		
		AInter ref2 = () -> {System.out.println("람다 A");};
		ref2.methodA();
		System.out.println("============다형성 적용 해보기");
		
		AImple x = (AImple)ref;
		x.myRefCall(new AInter() {
			
			@Override
			public void methodA() {
				System.out.println("빨간색 휴지 줄까 A");
				
			}
		});
		x.myRefCall(() -> {System.out.println("파란색 휴지 줄까 A");});
	}

}
