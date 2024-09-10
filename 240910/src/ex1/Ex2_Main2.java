package ex1;

public class Ex2_Main2 {
	public static void main(String[] args) {

		Ex2_Obj2 ref = new Ex2_Obj2();

		ref.num = 10;
		ref.age = 30;
		ref.name = "HyoJin";

		System.out.println(ref.num + " " + ref.name);

		
		Ex2_Obj2 ref2 = new Ex2_Obj2();
		
		ref2.num = 200;
		ref2.age = 30;
		ref2.name = "HyoJin's";

		System.out.println(ref2.num + " " + ref2.name);
		System.out.println(ref == ref2);
		
	}
}
