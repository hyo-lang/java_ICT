package ex2;

public class Ex1_Switch {
	public static void main(String[] args) {
		//int n = (int)(math.random()*갯수)+시작숫자)
		
		int num = (int)(((Math.random()*4)+8));
		System.out.println("[현재시간 : " + num + "시 ]");
		
		switch (num) {
		case 8:
			System.out.println(" 8시에 출근합니다.");
			//break;
		case 9:
			System.out.println(" 9시에 회의를합니다.");
			//break;
		case 10:
			System.out.println(" 10시에 업무를합니다.");
			//break;
		case 11:
			System.out.println(" 11시에 파견을 나갑니다.");
			//break;
		default:
			System.out.println(" 업무가 없습니다.");
		}

	}

}
