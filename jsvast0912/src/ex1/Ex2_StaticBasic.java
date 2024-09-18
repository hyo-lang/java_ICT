package ex1;
//staitc 자원을 무분별하게 불러오거나 사용하면 무겁다.
//예) import java.util.*; (X)
//static과 non-static의 구분
public class Ex2_StaticBasic {
	static int num1;
	int num2;
	public Ex2_StaticBasic(int num1,int num2) {
		this.num1= num1;
		this.num2 = num2;
	}
	public void incrementNumber() { //인스턴스 메서드
		num1 += 1;
		num2 += 1;
	}
	public static void incrementStaticNumber() { //static 메서드
		num1 += 1;
		//num2 += 1; //=>증가 못시키는 이유에 대해서 다시 한번 복습하기 바람
	}
	public void resultVal() {
		System.out.println("static변수:"+num1);
		System.out.println("인스턴스변수:"+num2);
	}
	public static void main(String[] args) {
		//static은 공유 자원이다.
		Ex2_StaticBasic ref1 = new Ex2_StaticBasic(1, 1);
		Ex2_StaticBasic ref2 = new Ex2_StaticBasic(1, 1);
		//ref1에서 incrementNumber() 호출해서 두변수를 증가 시킨다.
		ref1.incrementNumber(); //num1 = 2, num2 = 2;
		//ref2에서 incrementNumber() 호출해서 두변수를 증가 시킨다.
		ref2.incrementNumber();
		ref1.resultVal();
		ref2.resultVal();
	}
}
