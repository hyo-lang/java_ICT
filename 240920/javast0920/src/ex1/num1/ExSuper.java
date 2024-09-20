package ex1.num1;
//다형성에 대한 개념을 복습하고, 다형성으로 적용 해 보는것이 목표
//부모클래스 - 추상메서드 2개인 추상클래스로 정의
public abstract class ExSuper {
	private int pay;
	//재정의가 안되는 메서드
	public final void insertPay(int pay) {
		this.pay = pay;
		
	}
	//pay의 값을 반환하는 메서드
	public final int getPay() {
		return pay;
	}

	//추상메서드
	public abstract String uname(String name);
	public abstract void work(int pay);
	
}
