package ex2.demo;

public class DemoModel {
	
	public static void test1() {
		DemoVO vo = new DemoVO();
		vo.setNum(10);
		test2(vo);
		System.out.println(vo.getNum());
	}
	public static void test2(DemoVO vo) {
		vo.setNum(20);
		System.out.println(vo.getNum());
	}
	public static void main(String[] args) {
		test1();
	}
/*  ->CallbyValue 매개변수로 값을 전달 할 때 매개변수안에 값은 독립적이다.	
	public static void test1() {
		int num = 10;
		test2(num);
		System.out.println(num);
	}
	public static void test2(int num) {
		num += 10;
		System.out.println(num);
	}
	public static void main(String[] args) {
		// test1->test2
		test1();
	}
*/
}
