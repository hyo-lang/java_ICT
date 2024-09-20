package ex3_inter;

public class ABImplements implements A{

	@Override
	public void abc() {
		System.out.println("interface의 상수 참조 : " + a);
		System.out.println("interface의 상수 참조 : " + A.a);
		
	}
	public static void main(String[] args) {
		
		A ref = new ABImplements();
		
		ref.abc();
	}
}
