package ex2;

import java.util.Scanner;

public class Ex4_SwitchString {
	public static void main(String[] args) {
		//scanner 처리하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("직급을 입력하세요. ");
		String job = sc.nextLine();
		
		switch (job) {
		case "부장": 
			System.out.println(job + " 님 어서오세요.");
			break;
		case "과장": 
			System.out.println(job + " 님 반갑습니다.");
			break;
		
		default:
			System.out.println("어서와요!");
		}
	}

}

