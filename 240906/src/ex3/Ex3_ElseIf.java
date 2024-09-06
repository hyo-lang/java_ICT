package ex3;

import java.util.Scanner;

public class Ex3_ElseIf {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Group을 입력 [A,B,C,D]");
		String gd= sc.nextLine();
		char group = gd.charAt(0);
		
		if (group == 'A') {
			System.out.println("당신은 A그룹이기 때문에 초록색입니다.");
		} else if (group == 'B') {
			System.out.println("당신은 B그룹이기 때문에 파랑색입니다.");
		} else if (group == 'C') {
			System.out.println("당신은 C그룹이기 때문에 노렁색입니다.");
		} else if (group == 'D') {
			System.out.println("당신은 D그룹이기 때문에 하늘색입니다.");
		} else {
			System.out.println("당신은 그룹이 지정되어 있지 않아서 때문에 흰색입니다.");
		}
	}

}
