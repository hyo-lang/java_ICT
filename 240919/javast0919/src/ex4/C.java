package ex4;

public class C extends A{
	private String typev;
	public C(String typev) {
		super(typev);
		System.out.println(typev+"C 클래스 생성");
		this.typev = typev;
	}
	@Override
	public void testA() {
		System.out.println("자식의 재정의 된"+typev+" C 메서드가 호출이 됨!");
	}
}
