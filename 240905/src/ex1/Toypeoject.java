package ex1;

import java.util.Scanner;

public class Toypeoject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("name : ");
		String name = sc.nextLine();

		System.out.println("age : ");
		String num = sc.nextLine();
		int age = Integer.parseInt(num);

		System.out.println("gender : ");
		String gend = sc.nextLine();

		char gender = gend.charAt(0);

		System.out.println("speed : ");
		String num1 = sc.nextLine();
		int speed = Integer.parseInt(num1);
		System.out.println(name + "은 나이가 " + age + "이고 100미터 달리기를 하면 " + speed + "초대를 기록한다.");

		String col = null;

		if (gender == '여') {
			col = "핑크색";
		} else if (gender == '남') {
			col = "파랑색";
		} else {
			System.out.println("성별을 알 수 없습니다.");
		}
		System.out.println(col + " 깃발을 받았으며, ");
		
		String type;
		
		if(age>=19)
		{
			type = "성년";
		}else
		{
			type = "미성년";
		}
		System.out.println(type+" 입니다.");
		
		String res;
		if(speed <=11) {
			res = "빠르다.";
		} else {
			res = "느리다.";
		}
		System.out.println("평균 달리기 속도는 " + res);
	}
	
}
