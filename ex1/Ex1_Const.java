package ex1;

//spring�� ���ؼ� ���� �����ϴ� ��� 
//1. setter , 2.������ 
public class Ex1_Const {
	private int num;
	private String msg;
	private String code;
	// ������ �����ε�
	// ������ �Ű� ����
	public Ex1_Const(int num) {
		this.num = num; System.out.println("int �� ȣ��");
	}
	// ���ڿ� �Ű� ����
	public Ex1_Const(String msg) {
		this.msg = msg; System.out.println("String �� ȣ��");
	}
	public Ex1_Const(int num, String code) {
		this.num = num;
		this.code = code;
		System.out.println("int,String �� ȣ��");
	}
	// �����Ͻ� ����
	public String printConstRes() {
		StringBuilder sb = new StringBuilder();
		sb.append("num :").append(num);
		sb.append("msg :").append(msg);
		sb.append("code :").append(code);
		return sb.toString();
	}
	public void statck_String() {
		//String Ŭ������ �Һ��� Ư¡
		String ss = "num :"+num;
			   ss += "msg :"+msg;
			   ss += "code:"+code;
			   
			   System.out.println(ss);
		String aa = "A";
		       aa += "B";
		       aa += "C";
		       
	}
}







