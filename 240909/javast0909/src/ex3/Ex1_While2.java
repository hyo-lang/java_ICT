package ex3;

public class Ex1_While2 {
	public static void main(String[] args) {
		// 초기식
		// while조건
		// 실행문
		// 증감
		int i = 0;
		while (i <= 9) {
			if (i % 2 != 0) {
				System.out.println("홀수 : " + i);
			} else {
				System.out.println("짝수 : " + i);
			}
			i++;
		}
		System.out.println("=====for문으로 완성해보기=========");
		
		for (i=0; i<=9; i++) {
			if(i % 2 ==0) {
				System.out.println("짝수 : " + i);
			} else { 
				System.out.println("홀수 : " + i);
			}
		}
	}
}
