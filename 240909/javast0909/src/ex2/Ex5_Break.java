package ex2;

public class Ex5_Break {
	public static void main(String[] args) {
		
		int n = 7;
		
		for(int i=0; i<10; i++) {
			System.out.println(i); // 7까지 출력
			if(i == n)
				break;
			//System.out.println(i); // 7은 출력이 안된다
		}
	}

}
