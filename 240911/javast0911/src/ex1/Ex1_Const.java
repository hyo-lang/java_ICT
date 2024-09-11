package ex1;

public class Ex1_Const {
	
	public Ex1_Const() {
		System.out.println("기본 생성자 호출!");
	}
	
	public void test1( ) {}
	public static void main(String[] args) {
		Ex1_Const ref = new Ex1_Const();
		ref.test1();
	}
}
