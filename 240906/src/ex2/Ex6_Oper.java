package ex2;
/* bit 단위로 연산하는 비트 연산자
 * &,|,^
 */
public class Ex6_Oper {
	public static void main(String[] args) {
		//가장 오른쪽 자리(1의 자리) = 2의 0승 = 1
		//다음 자리 (2의 자리) = 2의 1승 = 2
		//다음 자리 (4의 자리) = 2의 2승 = 4
		//다음 자리 (8의 자리) = 2의 3승 = 8
		//다음 자리 (8의 자리) = 2의 4승 = 16
		//다음 자리 (8의 자리) = 2의 5승 = 232	
						// 8 4 2 1
		int a = 10; 	// 1 0 1 0
		int b = 7;		// 0 1 1 1 
		int c = a & b ;	// 0 0 1 0
		System.out.println("2진수 a : " + Integer.toBinaryString(a));
		System.out.println("2진수 a : " + Integer.toBinaryString(b));
		System.out.println("2진수 a : " + Integer.toBinaryString(c));
		System.out.println("a & b = " + c);
		
		c =a ^ b;
		System.out.println("a^b의 결과: " +c);
		System.out.println("2진수 c : " +Integer.toBinaryString(~c));
		System.out.println("~c 의 결과 : " +(~c));
		
		a=12;
		b=2;
		c=a >> b;
		int d = a << b;
		System.out.println("12 >> 2 : " +c);
		System.out.println("12 << 2 : " +d);		
	}

}
