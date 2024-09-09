package ex1;

import java.util.Scanner;

public class Ex2_ForIf {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("num => ");
			int n = Integer.parseInt(sc.nextLine());
			
			for(int i=1; i<=n; i++) {
				//1 ~ 10
				if(i % 2 ==0) {
					System.out.println(i+":짝");
				}else {
					System.out.println(i+":홀");
				}
			}
		} catch (Exception e) {
			System.out.println("잘못 입력하였습니다.");
		}
		
		
	}

}
