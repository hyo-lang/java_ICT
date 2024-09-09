package ex2;

import java.util.Scanner;

public class Ex8_LoofSwitchLabel {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ext: for(;;) {
			System.out.println("1-홀, 2-짝, 3-종료");
			int userNum = Integer.parseInt(sc.nextLine());
			int cpuNum = (int) (Math.random()*2+1);
			switch (userNum) {
			case 1: 
				if(userNum == cpuNum) {
					System.out.println("You: 1 , Cpu: 1 => Win !");
				} else {
					System.out.println("You: 1 , Cpu: 2 => Lose !");
				}	
				break;
			case 2: 
				if(userNum == cpuNum) {
					System.out.println("You: 2 , Cpu: 2 => Win !");
				} else {
					System.out.println("You: 2 , Cpu: 1 => Lose !");
				}	
				break;
			case 3: 
				System.out.println("종료하겠습니다.");
				break ext;
		
			default:
				System.out.println("메뉴에 없습니다.");
				break;
			}
	}
	}
}

