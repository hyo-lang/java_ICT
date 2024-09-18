package ex1;
//final :마지막 , 메서드, 클래스, 멤버 
//상수: 불변의 값을 저장하는 필드
//final:클래스는 여기가 마지막 클래스, 즉 상속이 안되는 클래스 
public final class Ex3_Final {
	static final int NUMBER = 1000; // static영역에 만들어지는 상수(공유/생성없이 사용)
	final int NUM = 1090; // 인스턴스니까 반드시 생성해서 사용 
	//상속관계에서 자식 클래스가 <재정의> 할 수 없도록 설정 
	public final void test(final int num) {
		//매개변수를 local상수로 선언하면 값을 변경하지 못함.
		//num = 200;
	}
	public void test() {
		//NUMBER=10;
		//NUM=2000;
		int num1 = 1;
		final int NUM2 = 1;
	}
	public static void main(String[] args) {
		//NUMBER=10;
		//NUM=2000;
		System.out.println(NUMBER);
		Ex3_Final ref = new Ex3_Final();
		System.out.println(ref.NUM);
	}
}
