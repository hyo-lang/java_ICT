package ex1;

public class Ex1_FloatDaouble {
	public static void main(String[] args) {
		
		float fnum;
		fnum = (float) 3.14;
		
		fnum = 3.14F;
		
		double dnum = 3.14;
		System.out.println(fnum);
		System.out.println(dnum);
		
		double dnum2 = fnum;
		System.out.println(dnum2);
		
		dnum = 1;
		for(int i=0; i<10000; i++) {
			dnum = dnum + 0.1;
		//	System.out.println(dnum);
		//	System.out.println("--------------");
		}
		System.out.println("결과 => " + dnum);
		
		fnum = 1.0f;
		for(int i=0; i<10000; i++) {
			fnum = fnum + 0.1f;
		//	System.out.println(fnum);
		//	System.out.println("--------------");
		}
		System.out.println("결과 => " + fnum);
	}

}
