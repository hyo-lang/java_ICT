package ex3;

import java.util.Scanner;

public class Ex1_While {
	public static void main(String[] args) {

		int i = 0;
		while (i <= 9) {
			System.out.println("i =>" + i);
			i++;
		}
		System.out.println("=====for문으로 완성해보기=========");

		for (i = 0; i <= 9; i++)
			if (i % 2 != 0) {
				System.out.println("홀수 : " + i);
			} else {
				System.out.println("짝수 : " + i);
			}
		System.out.println("=====while문으로 완성해보기=========");

	}
}
