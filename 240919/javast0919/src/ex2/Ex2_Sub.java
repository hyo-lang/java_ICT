package ex2;

//Ex2_SuperSuper 상속 받아보기 
//코드 오류의 원인과 해결책! -시험문제 나올 가능성 100%
//자식클래스의 기본생성자는 상속받은 부모 클래스의 기본생성자를 호출(super())
//근데 부모 클래스에 매개변수가 있는 생성자가 있기 때문에 컴파일러는  부모 클래스의
// 기본 생성자를 어떻게 한다? 
public class Ex2_Sub extends Ex2_SuperSuper {
	public Ex2_Sub() {
		// 매개변수가 있는 부모의 생성자를 호출!
		super("부모 호출!");
		System.out.println("자식 생성자 호출!");
	}
	public Ex2_Sub(String msg) {
		super(msg);
		System.out.println("자식 생성자 호출!");
	}
	// 부모 메서드 superMethod1 재정의
	@Override
	public void superMethod1(int num) {
		// super키워드 : 부모의 자원을 참조
		super.num = num;
		System.out.println("자식의 superMethod1 호출!");
	}
	public void aaaaa() {
		
	}
	public static void main(String[] args) {
		//부모를 참조 자료형으로 해서 부모를 생성하면 -> 일반 객체를 생성한다.
		//Ex2_SuperSuper aa = new Ex2_SuperSuper("AA");
		//Ex3_SubSuper ref = new Ex2_Sub();
		Ex2_SuperSuper ref = new Ex2_Sub("부모호출!");
		//재정의 된 자식의 메서드가 우선순위가 있어서 호출 했고 , 이안에 super.num 으로
		//즉 부모의 num에 값을 대입했음
		ref.superMethod1(1000);
		// 부모의 num을 출력함 
		System.out.println("num확인:"+ref.num);
	}
}


