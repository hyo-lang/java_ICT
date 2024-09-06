package ex2;

import java.util.Scanner;


public class Ex8_Oper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 점수: ");
				
		int score = Integer.parseInt(sc.nextLine());
		char grade = (score>90)? 'A' : ((score>80)? 'B' : 'c');
		
		System.out.println("당신의 점수 : " + score + ", 등급 : " + grade + " 입니다.");
		
		
	}

}
