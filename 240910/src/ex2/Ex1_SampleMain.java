package ex2;

public class Ex1_SampleMain {
	public static void main(String[] args) {
		Ex1_Sample ref = new Ex1_Sample();
		System.out.println("메서드 호출 전 : " + ref.res());
		ref.chaekEnter(2);
		System.out.println("메서드 동작 후 : " + ref.res());
	}
}
