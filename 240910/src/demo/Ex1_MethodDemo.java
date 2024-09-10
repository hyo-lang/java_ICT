package demo;

public class Ex1_MethodDemo {
	
	private String writer;
	private int pay;
	private boolean chk;
	private String abc;
	private int age;
	int aa;
	
	//메서드에게 전달할 값 = 이름 = write
	//그 값을 맴버필드에 저장함
	public void insertWriter(String res){
		writer = res;
		
	}
	public void insertPay(int pay) {
		this.pay = pay;
	}
	//age,aa
	public void name(int age,String aa) {
		this.age=age;
		this.aa=aa;
		
	}
}
