package ex2;

import java.util.Scanner;

public class Ex1_Oper {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("A = 10");
		System.out.println("숫자 A를 입력하세요. ");
		String num1 = sc.nextLine();
		int numA = Integer.parseInt(num1);

		System.out.println("B = 2");
		System.out.println("숫자 B를 입력하세요. ");
		String num2 = sc.nextLine();
		int numB = Integer.parseInt(num2);

		int resNum1 = numA + numB;
		int resNum2 = numA - numB;
		int resNum3 = numA * numB;
		int resNum4 = numA / numB;
		int resNum5 = numA % numB;
		System.out.println(numA + " + " + numB + " = " + resNum1);
		System.out.println(numA + " - " + numB + " = " + resNum2);
		System.out.println(numA + " * " + numB + " = " + resNum3);
		System.out.println(numA + " / " + numB + " = " + resNum4);
		System.out.println(numA + " % " + numB + " = " + resNum5);

		String numC;
		/*
		if(numA==10) {
			numC = " 정답입니다. "
		}else { " 틀렸습니다. "
			
		}
		*/
		}
}
