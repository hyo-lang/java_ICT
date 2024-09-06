package ex2;

import java.util.Scanner;

public class Ex2_Oper {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Class 제목의 총 글자수는?");
		String msg = "ICTPasswordLess";
		
		String msg3 = sc.nextLine();
		char ch1 = msg3.charAt(0);
		
		System.out.println(msg);
		System.out.println("msg에 들어간 문자열의 값의 길이를 확인 : " + msg.length());

		System.out.println("--------------");

		char cc = msg.charAt(0);
		System.out.println("한문자만 반환하는 매서드 charAt(idx)" + cc);

		String res = (cc == 'I') ? cc + "별" : cc + "하트";
		System.out.println(res);
		System.out.println("--------------");

		if (cc == 'I') {
			res = " 별";
		} else {
			res = " 하트";
		}
		System.out.println(res + " 입니다.");
		System.out.println("--------------");

		System.out.println("영어를 입력하세요. (별과 하트를 드립니다)");
		String msg2 = sc.nextLine();
		char ch = msg2.charAt(0);
		System.out.println("===삼항 연산자 결과===");
		String res3 = (ch == 'k') ? ch + "로 시작하는 문자는 ★을 드립니다." : ch + "로 시작하는 문자는 ♥를 드립니다.";
		System.out.println(res3);
		
		System.out.println("영어를 입력하세요. (별과 하트를 드립니다)");
		String msg4 = sc.nextLine();
		String res4="";
		if (ch == 'k') {
			res4 = ch + "로 시작하는 문자는 ★을 드립니다.";
		} else { res4 = ch + "로 시작하는 문자는 ★을 드립니다.";
		}
		System.out.println(res4);
	}

}
