package ex2;

public class Ex2_Switch {
	public static void main(String[] args) {
		//안되는 것 : boolean, 실수형, long
		
		int num1 = 10;
		byte num2 = 20;
		short num3 = 30;
		boolean flag = true;
		String str = "Test";
		char ch = 'A';
		float ff = 10.1f;
		double dd = 10.1;
		long ll = 10L;
		
		//---------------------------------------//
		
		switch (ch) {
		case 'A': {
			System.out.println(ch);
		break;	
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}
		
	}

}
