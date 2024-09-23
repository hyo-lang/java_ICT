package ex3;

public class Ex1_Main2 {
	public static void main(String[] args) {
		Ex1_Account2 account = new Ex1_Account2();
		
		account.deposit(10000);
		
		long mybalance = account.getBalance();
		System.out.println("예금액 확인 : " + mybalance);
		
		try {
			account.withdraw(30000);
		} catch (MyException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		mybalance = account.getBalance();
		System.out.println("예금액 확인 : " + mybalance);
	}

}
