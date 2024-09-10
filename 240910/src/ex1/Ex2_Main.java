package ex1;

public class Ex2_Main {
	public static void main(String[] args) {

		Ex2_Obj ref = new Ex2_Obj();

		ref.age = 23;
		ref.num = 100;
		ref.name = "Hyo-Jin";

		System.out.println(ref.age + " 살이고 " +ref.num + " 이며, "+ref.name);
		
		int age = ref.age;
		age = 30;
		
		System.out.println(age);
		System.out.println(ref.age);
	}

}
