package ex2;

import java.util.Scanner;

public class Ex6_Break_Exam {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println("1 ~ 9 까지 수 중 하나만 입력 : ");
			int num = Integer.parseInt(sc.nextLine());
			int cpu = ((int)(Math.random()*9)+1);
			if(num == cpu) {
				System.out.println("게임을 종료 합니다.");
				break;
			}
			else {
			System.out.println("cpu의 숫자는 " + cpu + " 이고, 당신이 입력한 숫자는 " + num + "입니다.");
			System.out.println("게임을 진행합니다.");
		}
		
		}
	}

}
