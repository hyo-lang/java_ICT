package ex1.num1;

public class Ex1_Sub extends ExSuper{

	@Override
	public String uname(String name) {
		return name + "님 안녕하세요. Ex1_Sub 입니다. 당신의 급여는" + getPay() + " 입니다." ;
	}

	@Override
	public void work(int pay) {
		insertPay(pay);
	}

}
