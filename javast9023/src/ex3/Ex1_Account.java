package ex3;

public class Ex1_Account {
	private long balance;

	public Ex1_Account() {}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) {
		if (balance < money) {
			System.out.println("잔고 부족 : " + (money - balance) + " 부족함");
		}
		balance -= money;
	}

}
