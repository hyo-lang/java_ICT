package ex1;

public class Ex6_Const {
	public Ex6_Const() {
		this("test");
		System.out.println("A");
	}

	public Ex6_Const(String str) {
		this(true);
		System.out.println("☆");
	}

	public Ex6_Const(float f) {
		this(10);
		System.out.println("♣");
	}

	public Ex6_Const(int n) {
		System.out.println("△");
	}

	public Ex6_Const(boolean b) {
		this(3.14f);
		System.out.println("■");
	}
	public static void main(String[] args) {
		new Ex6_Const();
	}
}
