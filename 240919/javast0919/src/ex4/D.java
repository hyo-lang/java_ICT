package ex4;

public class D extends B {

	private String typev;
	
	public D(String typev) {
		// 부모의 B의 생성자 호출
		super(typev);
		System.out.println(typev + "D 클래스 생성");
		this.typev = typev;
	}
	@Override
	public void testA() {
		System.out.println("자식의 재정의 된"+typev+" D 메서드가 호출이 됨!");
	}
	public void dMethod() {
		System.out.println("순수한 D클래스의 메서드");
	}
}
