package demo;

public class Ex2_demo2 {
	public static void main(String[] args) {
		int score = 90;
		char grade = '\u0000';
		
		if (score>=90) {
			grade = 'A';
		} else if (score >=80){
			grade = 'B';
		}else if (score >=70){
			grade = 'C';
		}else {
			grade = 'D';
		}
		System.out.println(grade);
	}

}
