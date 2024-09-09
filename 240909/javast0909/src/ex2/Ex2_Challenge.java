package ex2;

public class Ex2_Challenge {
	public static void main(String[] args) {
		
		int num = (int)(((Math.random()*12)+1));
		System.out.println(num + "[월]");
		
		switch (num) {
		case 1,2,3: 
			System.out.println("봄 입니다.");
			break;
			
		case 4,5,6: 
			System.out.println("여름 입니다.");
			break;
			
		case 7,8,9: 
			System.out.println("가을 입니다.");
			break;
		
		case 10,11,12: 
			System.out.println("겨울 입니다.");
		
		}
	}
}