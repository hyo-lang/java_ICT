package ex1;

import java.util.Scanner;

public class Ex3_Try {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i<=n; i++)
			
		if (n % 2 ==0) {
			System.out.println(i + " -짝");

		} else {
			System.out.println(i + " -홀");
		
		} catch (Exception e) {
			System.out.println("오류");
		}
		}
	}

}
