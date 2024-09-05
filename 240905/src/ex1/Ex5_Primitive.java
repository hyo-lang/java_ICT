package ex1;

public class Ex5_Primitive {
	public static void main(String[] args) {
		byte d = 100;
		System.out.println(d);
		byte e = 10;
		int res1 = d + e;
		System.out.println("res1:" + res1);

		byte c1 = 10;
		short c2 = 20;
		int c_res1 = c1 + c2;
		System.out.println("c_res1:" + c_res1);

		long s1 = 10000000000000000L;
		byte b1 = 100;
		long sb_res = s1 + b1;
		System.out.println(sb_res + c_res1);
		System.out.println("res1 " + "sb_res " + c_res1);

		long l_num = 1000000000L;
		int int_num = (int) 100L;
		System.out.println(l_num + int_num);

		int times1 = (int) System.currentTimeMillis();
		System.out.println("int형으로 받은 Time값:" + times1);

		long times2 = System.currentTimeMillis();
		System.out.println("long형으로 받은 Time값:" + times2);

		char var3 = '나';
		System.out.println(var3);

		char var1 = '\u0000';
		System.out.println("\\u0000 =>" + var1);
		System.out.println("\\u0061 => " + '\u0061');

		char var2 = 97;
		System.out.println(var2);

		char var4 = 100;
		System.out.println(var1 + var2 + var3 + var4);

		// 응용

		int n = 1;
		System.out.println(n++);
		System.out.println("1증가 한 후 n값 : " + n);
		System.out.println(++n);
		System.out.println("1증가 한 후 n값 : " + n);

		System.out.println(++var2);
		System.out.println(++var2);

		char ch1 = 'A';
		short ch2 = 1;
		char ch3 = (char) (ch1 + ch2);
		System.out.println(ch3);
		
		char ch5 = 44032;
		System.out.println(ch5);
		char ch6 = '\uac00';
		System.out.println(ch6);
		
		boolean btype = true;
		
		if(btype) {
			System.out.println("실행 했습니다.");
		
		}
		
	}

}
