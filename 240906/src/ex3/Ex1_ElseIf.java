package ex3;

import java.util.Scanner;

public class Ex1_ElseIf {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 나이 : ");
		String age = sc.nextLine();
		int num = Integer.parseInt(age);
		
		if (num>=8) {
			age = "학교에 다닙니다.";
		}else {
			age = "학교에 다니지 않습니다.";
		}
		System.out.println(age);
	
	}

}
