package ex2;

import java.util.Scanner;

//사친연산 +,-,* - 곱하기 / - 나누기, %- 나눈 나머지의 값
public class Ex1_Oper {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("수1 : ");
		int numA = Integer.parseInt(sc.nextLine());
		System.out.println("수2 : ");
		int numB = Integer.parseInt(sc.nextLine());

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

		System.out.println("A의 값은 무엇입니까? ");
		String numC = sc.nextLine();

		if (numA == 1) {
			numC = " 정답입니다. ";
		} else {
			numC = " 틀렸습니다. ";
		}
		System.out.println(numC);
	}

}
