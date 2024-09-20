package ex1.num1;

//부모클래스
public abstract class ExSuper {
	private int pay;
	
	public final void insertPay(int pay) {
		this.pay = pay;
		
	}
	
	public final int getPay() {
		return pay;
	}

	//추상메서드
	public abstract String uname(String name);
	public abstract void work(int pay);
	
}
