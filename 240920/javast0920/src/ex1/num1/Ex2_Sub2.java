package ex1.num1;

public class Ex2_Sub2 extends ExSuper{

	@Override
	public String uname(String name) {
		return name + "님 반가워요. Ex2_Sub 입니다. 당신의 급여는" + getPay() + " 입니다.";
	}

	@Override
	public void work(int pay) {
		insertPay(pay);
	}

}
