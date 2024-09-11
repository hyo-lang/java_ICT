package ex1;

public class Ex1_LocalVariable {
	public void test1(int num) {
		num = 10;
		test2(num);
		System.out.println(num);
	}

	public void test2(int num) {
		num = 20;
		System.out.println(num);
	}
	public static void main(String[] args) {
		Ex1_LocalVariable ref = new Ex1_LocalVariable();
		ref.test1(100);
	}
}

