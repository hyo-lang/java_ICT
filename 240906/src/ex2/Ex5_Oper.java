package ex2;

public class Ex5_Oper {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		boolean c = ((a+=12) >b) || (a==(b+=2));
		System.out.println("c=" +c);
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		System.out.println("---------------");
	}

}
