package ex1;

import java.util.Scanner;

public class Ex7_Scanner {
	public static void main(String[] args) {

		// String cc = "Test"; 객체
		// "Test".charAt(0);
		// cc.charAt(0);

		Scanner sc = new Scanner(System.in);

		System.out.println("메세지를 입력: ");

		String msg = sc.nextLine();
		System.out.println("당신이 입력한 메세지 : " + msg);
		System.out.println("첫번째 단어는 ->" + msg.charAt(0));
		System.out.println("두번째 단어는 ->" + msg.charAt(1));
		
		System.out.println("숫자 입력 => ");
		String numStr = sc.nextLine();
		
		int num = Integer.parseInt(numStr);
		int res = num + 10;
		
		System.out.println("입력 한 num : " + num + ", 보너스의 합은 : " + res);
		
		System.out.println("회사이름 => ");
		String offName = sc.nextLine();
		System.out.println("당신의 회사 이름은 =>" + offName);
		
	}

}