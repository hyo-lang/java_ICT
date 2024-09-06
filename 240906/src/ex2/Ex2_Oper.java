package ex2;

import java.util.Scanner;

//삼항연산자 (조건)? (실행식1):(실행식2)
//제어문 if else
//if(조건) { 실행1 } else { 실행2 }
public class Ex2_Oper {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String msg = "ICTPasswordLess";
		System.out.println(msg);
		System.out.println("msg에 들어간 문자열의 값의 길이를 확인 : " + msg.length());
		// I란 한단어를 char형 변수 cc에 저장
		char cc = msg.charAt(0);
		System.out.println("한문자만 반환하는 매서드 charAt(idx)" + cc);
		
		System.out.println("--------------");
		// 삼항연산자 (조건)?(True=>실행식1):(false=>실행식2)
		String res = (cc == 'I') ? cc + "★" : cc + "♥";
		System.out.println(res);
		
		int res2 = (cc =='I') ? 100 : 50;
		System.out.println(res2);
		
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
		// 첫번째 단어를 구분 해야 하기 때문에 char 변수에 저장
		char ch = msg2.charAt(0);
		System.out.println("===삼항 연산자 결과===");
		String res3 = (ch == 'I') ? ch + "로 시작하는 문자는 ★을 드립니다." : 
			ch + "로 시작하는 문자는 ♥를 드립니다.";
		System.out.println(res3);
		
		System.out.println("영어를 입력하세요. (별과 하트를 드립니다)");
		String msg4 = sc.nextLine();
		String res4="";
		if (ch == 'k') {
			res4 = ch + "로 시작하는 문자는 ★을 드립니다.";
		} else { res4 = ch + "로 시작하는 문자는 ♥을을 드립니다.";
		}
		System.out.println(res4);
	}

}
