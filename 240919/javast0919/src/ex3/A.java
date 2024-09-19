package ex3;
//부모 클래스
public class A {
	// 3. 부모의 생성자 호출
	public A(String typev) {
		System.out.println(typev+"의 A 클래스 생성");
	}
	public void testA() {
		System.out.println("부모의 메서드 호출!");
	}
}
