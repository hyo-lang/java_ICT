package ex2;

import java.util.Scanner;

public class Ex6_Break {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		for(;;) {
			x++;
			System.out.println("1 ~ 100 까지 수 중 하나만 입력 : ");
			int num = Integer.parseInt(sc.nextLine());
			if(num == 100) {
				System.out.println("종료 합니다.");
				break;
			}
			System.out.println(x);
		}
	}

}
