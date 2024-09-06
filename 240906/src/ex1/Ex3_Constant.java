package ex1;

public class Ex3_Constant {
	
	static final int MAX_NUM = 132;
	int num = 10;
	public static void main(String[] args) {
		
		final int MAX_NUM2 = 13222;
		
		final int MIN_NUM;
		
		if(false) {
			MIN_NUM = 10;
		} else {
			MIN_NUM = 20;
		}
		System.out.println(MIN_NUM);
	}

}
