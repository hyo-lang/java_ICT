package ex4;

import java.util.Scanner;

public class Ex1_RunTime2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number Input : ");

		try {
			// -----------------
			int num = Integer.parseInt(sc.nextLine()); // 오류->숫자만넣으세요
			String[] msg = { "하이", "반가워요", "굿모닝" };
			int res = 10 / num; // 0으로 나눌 수 없어요
			for (int i = 0; i <= msg.length; i++) {
				System.out.println("Message => " + msg[i]); // 오류->배열의인덱스를 벗어났어요
			}
			System.out.println("#프로그램 종료!");
		} catch (Exception e) {
			if (e instanceof NumberFormatException) {
				System.out.println("숫자만 넣으세요!");
			} else if(e instanceof ArithmeticException) {
				System.out.println("숫자만 넣으세요!");
			} else {
				System.out.println("숫자만 넣으세요!");
			}
		}
	}
}
