package ex2;

import java.util.Scanner;

public class asdk {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 :");
		int numA = Integer.parseInt(sc.nextLine());
		System.out.print("수2 :");
		int numB = Integer.parseInt(sc.nextLine());
		
		
		int resNum1 = numA + numB;
		int resNum2 = numA - numB;
		int resNum3 = numA * numB;
		int resNum4 = numA / numB;
		int resNum5 = numA % numB;
		System.out.println(numA+" + "+numB+" = "+ resNum1);
		System.out.println(numA+" - "+numB+" = "+ resNum2);
		System.out.println(numA+" * "+numB+" = "+ resNum3);
		System.out.println(numA+" / "+numB+" = "+ resNum4);
		System.out.println(numA+" % "+numB+" = "+ resNum5);
	}
	
}
