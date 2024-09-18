package ex1;

public class Ex7_Array {
	public static void main(String[] args) {
		int[] a = {3,4,5};
		int[] b = a;// 배열 a의 주소를 b에게 전달, 같은 주소 
		b[0]=7;
		a[1]=6;
		System.out.println(a == b);//true
		for(int e : b) {
			System.out.println(e);
		}
		System.out.println("=================");
		
		for(int e : a) {
			System.out.println(e);
		}
	}
}
