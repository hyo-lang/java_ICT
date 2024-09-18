package ex1;

import java.util.Scanner;

public class Ex2_Array {
	public static void main(String[] args) {
		//basicArray();
		useArray();
		System.out.println("수고하셨습니다.");
	}
	private static void useArray() {
		//입력받은 수를 배열에 저장하는 간단한 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하지 않으면 종료 : 크기를 입력하세요");
		try {
			int arrSize = Integer.parseInt(sc.nextLine());
			//숫자들을 저장할 배열을 arrSize 크기로 생성 
			int[] numArr = new int[arrSize];
			System.out.println("배열이 생성됨 크기는["+numArr.length+"]");
			// 입력하기
			for(int i=0; i<numArr.length; i++) {
				System.out.print("numArr["+i+"]의 값:");
				numArr[i] = Integer.parseInt(sc.nextLine());
			}
			System.out.println("입력이 완료 되었습니다.");
			// 출력하기
			for(int e : numArr) {
				System.out.println(e);
			}
			//입력한 배열의 총합을 출력하시오
			System.out.println("총합:");
		} catch (Exception e) {
			System.out.println("숫자가 아니어서 종료 합니다.");
			return;
		}
	}
	private static void basicArray() {
		// 배열을 선언
		int[] stDs;
		// 생성과 초기화
		stDs = new int[3];
		// index 0 1 2
		// int[[0],[0],[0]]
		System.out.println(stDs);
		System.out.println(stDs[0]);
		System.out.println(stDs[1]);
		System.out.println(stDs[2]);
		// java.lang.ArrayIndexOutOfBoundsException
		// 존재 하지 않는 인덱스를 참조할때 발생
		// System.out.println(stDs[3]);
		System.out.println("=================");
		// 한줄로 선언및 생성하기 (stDs2)
		int[] stDs2 = new int[3];
		// for문을 사용해서 출력하기 - foreach최고!!!!
		for (int e : stDs2) {
			System.out.println(e);
		}
	}
}
