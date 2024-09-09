package ex1;

public class Ex5_ForFor {
	public static void main(String[] args) {

		for (int i = 0; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				if (i == 0) {
					System.out.print(j + "단\t");
				} else {
					System.out.print(j + "x" + i + "=" + (i * j) + "\t");
				}

			}
			System.out.println("");
		}

		System.out.println("구구단 종료!");
	}

}
