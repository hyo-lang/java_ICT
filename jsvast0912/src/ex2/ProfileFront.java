package ex2;

import java.util.Scanner;

public class ProfileFront {

	public static void main(String[] args) {
		// 사용자로 부터 입력을 받는 front
		Scanner sc = new Scanner(System.in);
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.print("나이:");
		int age = Integer.parseInt(sc.nextLine());
		//이 값을 ProfileModel에게 전달
		// 객체를 생성
		ProfileModel model = new ProfileModel();
		//입력받은 변수값을 model에게 전달 
		model.addProfile(name, age);
		//이후에 출력 
	    model.printProfile();
		
	}
}
