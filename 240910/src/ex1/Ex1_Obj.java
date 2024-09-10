package ex1;

public class Ex1_Obj {

	int num1 = 100;

	public static void main(String[] args) {
		Ex1_Obj ref = new Ex1_Obj();
		System.out.println(ref.num1);
		ref.num1 = 1000;
		System.out.println(ref.num1);

	}

}
