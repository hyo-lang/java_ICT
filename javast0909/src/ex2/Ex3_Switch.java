package ex2;

import java.util.Scanner;

public class Ex3_Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("grade를 입력 (A,B..) => ");
		
		char grade = sc.nextLine().charAt(0);
		System.out.println(grade);
		
		switch (grade) {
		case 'A':
		case 'a': 
			System.out.println(grade + " 는 우수회원 입니다.");
			break;
			
		case 'B':
		case 'b': 
			System.out.println(grade + " 는 일반회원 입니다.");
			break;	
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + grade);
		}
	}

}
