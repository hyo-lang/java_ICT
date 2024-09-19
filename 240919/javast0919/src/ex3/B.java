package ex3;
//A를 상속 받는 B
public class B extends A{
	public B(String typev) {
		//2번 부모인 A생성자 호출하면서 부모를 초기화 할때 매개변수로 값을 전달 
		super(typev);
		//만약 필요하면 2-1 부모의 testA()호출 하려고 한다.
		//super는 부모의 주소를 의미 , this는 자신의 주소 
		super.testA();
		//만약 필요하면 2-2 자식인 자신의 메서드를 호출 
		this.testA();
		//4번 부모의 생성자 호출 후 자식 생성자가 실행되고 마무리됨
		System.out.println("B클래스 생성");
	}
	//재정의 해보기
	@Override
	public void testA() {
		System.out.println("자식의 재정의 된 메서드가 호출이 됨!");
	}
	//A와 B에의 상속관계 테스트 메인
	public static void main(String[] args) {
		//1. 생성자B를 호출 (자식생성자 B를 호출)
		A ref = new B("Test");
		//ref.testA();
		//ref.testA(); //부모의 testA()호출 하고 싶은데 
	}
}
