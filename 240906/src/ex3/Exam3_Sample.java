package ex3;

import java.util.Scanner;

public class Exam3_Sample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		
		String res;
		if (age>19) {
			res = "어서오세요^^";
		} else {
			res = "접근 할 수 없습니다.";
		}
		System.out.println("Message =>" + res);
		
		System.out.print("성별: (\"남자/여자\")");
		String gender = sc.nextLine();
		if (gender.equals("남자")) {
			System.out.println("하하하");
		} else if(gender.equals("여자)) {
			System.out.println("호호호");
		} else {
		System.out.println("잘못된 표기 입니다. (M/F)");
	}
}

}
