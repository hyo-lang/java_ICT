package ex2;

public class Ex2_Challenge {
	public static void main(String[] args) {
		
		int num = 3;
		
		switch (num) {
		case 1: {
			System.out.println("봄 입니다.");
			break;
			
		case 2: {
			System.out.println("여름 입니다.");
			break;
			
		case 3: {
			System.out.println("가을 입니다.");
			break;
			
		case 4: {
			System.out.println("겨울 입니다.");
			break;
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + num);
		}
		}

		}
		
	
		}
