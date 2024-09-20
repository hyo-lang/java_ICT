package ex1.num1;

public class Ex2_Sub2 extends ExSuper{

	@Override
	public String uname(String name) {
		return name + "님 반가워요. Ex2_Sub 입니다. 당신의 급여는" + getPay() + " 입니다.";
	}

	@Override
	public void work(int pay) {
		//부모의 자원을 호출하면서 부모의 맴버필드인 pay에 값을 저장시킨다.
		insertPay(pay);
	}

}
