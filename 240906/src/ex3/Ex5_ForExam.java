package ex3;

import java.util.Scanner;

public class Ex5_ForExam {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i=1; i<=n; i++) {
		System.out.println(i+"\t");
		}
	}

}
