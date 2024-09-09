package ex3;

public class ForExam {
	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j += 3) {

				if (i < 4) {
					System.out.print(i + "\t");
				} else {
					System.out.print(j + "\t");
				}

			}

		}

	}
}