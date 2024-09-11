package ex1;
//생성자 오버로딩, 인자를 다르게 해서 여러개의 생성자를 정의할 수 있다.
//생성하는 방법(현재 객체를 초기화)을 다양화 할 수 있다.
//메서드 오버로딩과 같은 개념이며, 일관성

public class Ex3_Const {
	public Ex3_Const() {
		System.out.println("기본 생성자");
	}
	public Ex3_Const(int num) {
		System.out.println(num + " 값을 받는 정수형 인자의 생성자");
	}
	public Ex3_Const(String num) {
		System.out.println(num + " 값을 받는 문자열형 인자의 생성자");
	}
	public Ex3_Const(String str, int num) {
		System.out.println(num + " 값" + str + "을 받는 문자열, 정수형 인자의 생성자");
	}
	public Ex3_Const(int num, String str) {
		System.out.println(num + " 값" + str + "을 받는 문자열, 정수형 인자의 생성자");
	}
	public static void main(String[] args) {
		Ex3_Const ref = new Ex3_Const();
		Ex3_Const ref2 = new Ex3_Const(100);
		Ex3_Const ref3 = new Ex3_Const("안녕하세요!!");
		Ex3_Const ref4 = new Ex3_Const("안녕하세요!!" + 100);		
		Ex3_Const ref5 = new Ex3_Const(100 + "안녕하세요!!");				
	}
}
