package ex3;

import java.util.Scanner;

public class Exam3_Ifelse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 : ");
		String age = sc.nextLine();
		int num = Integer.parseInt(age);
		
		if (num>19) {
			age = "어서오세요 ^^";
		} else {
			age = "접근 할 수 없습니다.";
		}
		
		System.out.println("성별 : ");
		String gend = sc.nextLine();
		char gender = gend.charAt(0);
		
		if (gender == '여') {
			System.out.println("호호호");
		} else if(gender == '남') {
			System.out.println("하하하");
		} else { 
			System.out.println("잘못된 표기법 입니다.");
		}
	}

}
