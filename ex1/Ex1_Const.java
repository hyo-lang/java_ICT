package ex1;

//spring을 통해서 값을 주입하는 방법 
//1. setter , 2.생성자 
public class Ex1_Const {
	private int num;
	private String msg;
	private String code;
	// 생성자 오버로딩
	// 정수형 매개 변수
	public Ex1_Const(int num) {
		this.num = num; System.out.println("int 형 호출");
	}
	// 문자열 매개 변수
	public Ex1_Const(String msg) {
		this.msg = msg; System.out.println("String 형 호출");
	}
	public Ex1_Const(int num, String code) {
		this.num = num;
		this.code = code;
		System.out.println("int,String 형 호출");
	}
	// 비지니스 로직
	public String printConstRes() {
		StringBuilder sb = new StringBuilder();
		sb.append("num :").append(num);
		sb.append("msg :").append(msg);
		sb.append("code :").append(code);
		return sb.toString();
	}
	public void statck_String() {
		//String 클래스의 불변적 특징
		String ss = "num :"+num;
			   ss += "msg :"+msg;
			   ss += "code:"+code;
			   
			   System.out.println(ss);
		String aa = "A";
		       aa += "B";
		       aa += "C";
		       
	}
}







