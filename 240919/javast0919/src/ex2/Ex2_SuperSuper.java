package ex2;
//부모 클래스
//자식 클래스에서 부모를 참조, 호출 하는 키워드 
//super , super()
public class Ex2_SuperSuper {
	private String msg;
	protected int num;
	public Ex2_SuperSuper(String msg) {
		this.msg = msg;
		System.out.println("부모 생성자 호출!");
	}
	public void superMethod1(int num) {
		this.num = num;
		System.out.println("부모의 메서드 superMethod1 호출");
	}
	public void superMethod2(int num,String msg) {
		this.num = num;
		this.msg = msg;
		System.out.println("부모의 메서드 호출");
	}
}
