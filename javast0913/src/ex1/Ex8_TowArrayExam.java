package ex1;

import java.util.Scanner;

public class Ex8_TowArrayExam {
	// 배열 선언
	private String[][] arr1;
	// new String[일차원배열의갯수(행)][일차원배열의길이(열)];
	private String[] names;
	// 초기화
	public Ex8_TowArrayExam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("한명당 메세지를 3개를 작성 합니다.");
		names = new String[]{"김길동","이수진"};
		arr1 = new String[names.length][3];
		for(int i=0; i<2; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(names[i]+"님의 문자열 입력 ["+i+"]["+j+"]=>");
				String msg = sc.nextLine();
				arr1[i][j]=msg;
			}
		}	
//		for(int i=0; i<arr1.length; i++) {
//			for(int j=0; j<arr1[i].length; j++) {
//				System.out.print(names[i]+"님의 문자열 입력 ["+i+"]["+j+"]=>");
//				String msg = sc.nextLine();
//				arr1[i][j]=msg;
//			}
//		}		
	}// 생성자 끝
	// 출력
	public void printTest() {
		//foreach문으로 변경
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.println("=>"+arr1[i][j]);
			}
			System.out.println("-------------------------");
		}
	}
	public static void main(String[] args) {
		//Ex8_TowArrayExam ref = new Ex8_TowArrayExam();
		//ref.printTest();
		new Ex8_TowArrayExam().printTest();
	}
}
