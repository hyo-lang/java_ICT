package ex1;

import java.util.Scanner;

public class Ex1_ForExam {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("초기값: ");
			int n = Integer.parseInt(sc.nextLine());
			System.out.println("종료값: ");
			int m = Integer.parseInt(sc.nextLine());

			if (n < m) {
				for (int i = n; i <= m; i++) {
					System.out.println(i);
				}
			} else {
				System.out.println(n + " 은 " + m + " 보다 클 수 없습니다.");
			}

		} catch (Exception e) {
			System.out.println("오직 숫자만 입력하세요.");
		}

	}
}
