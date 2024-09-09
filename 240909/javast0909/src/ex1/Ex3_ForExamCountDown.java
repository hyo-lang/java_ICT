package ex1;

public class Ex3_ForExamCountDown {
	public static void main(String[] args) {

		for (int i = 10; i >= 0; i--) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
