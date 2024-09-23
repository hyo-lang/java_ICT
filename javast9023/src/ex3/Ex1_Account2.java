package ex3;

public class Ex1_Account2 {
	private long balance;

	public Ex1_Account2() {}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws MyException {
		if (balance < money) {
			
			throw new MyException("MyException잔고 부족 : " + (money - balance) + " 부족함");
		//	System.out.println("잔고 부족 : " + (money - balance) + " 부족함");
		}
		balance -= money;
	}

}
