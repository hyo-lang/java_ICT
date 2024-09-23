package ex3;

public class MyException extends Exception{
	
	private String msg;
	public MyException() {
	System.out.println("내가 만든 예외의 기본 생성자 호출! : ");
	}
	public MyException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
}
