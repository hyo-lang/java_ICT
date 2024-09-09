package ex2;

public class Ex7_BreakLabel {
	public static void main(String[] args) {
		ext: for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				if( j == 6) {
					break ext;
				}
				System.out.print(j + "x" + i + "\t");
			}
			System.out.println("");
			
		}
	}

}
