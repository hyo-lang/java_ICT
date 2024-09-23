package ex3;

public class Ex1_Main {
	public static void main(String[] args) {
		Ex1_Account account = new Ex1_Account();
		
		account.deposit(10000);
		
		long mybalance = account.getBalance();
		System.out.println("예금액 확인 : " + mybalance);
		
		account.withdraw(30000);
		mybalance = account.getBalance();
		System.out.println("예금액 확인 : " + mybalance);
	}

}
