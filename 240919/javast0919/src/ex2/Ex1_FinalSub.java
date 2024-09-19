package ex2;
// <복습 포인트> : 재정의의 의미 , 상속관계에서 부모의 메서드를 고쳐 쓰는 것 
// 우선 순위는 ??????
// 부모자료형 변수 = new 자식객체();
// 자식자료형 변수 = new 자식객체();
// Ex1_FinalSuper 상속 후 부모를 참조 자료형으로 생성까지 해보기
// 부모가 final이면 상속을 못받는다.
public class Ex1_FinalSub extends Ex1_FinalSuper{

	//재정의(오버라이딩) 부모의 메서드,자원을 고쳐서 사용하는 개념
	//체크해주는 주석 : 어노테이션<실행이 가능한 주석>
	@Override
	public void unfinalMethod() {
		System.out.println("자식이 고쳐쓴 메서드 :unfinalMethod");
	}
//	public  void finalMethod() {
//		System.out.println("Final메서드는 재정의  불가 ");
//	}
	public void subMethod() {
		
	}
	public Ex1_FinalSub() {
		System.out.println("자식~~");
	}
	public static void main(String[] args) {
		//부모를 참조한 자식 생성
		Ex1_FinalSuper ref = new Ex1_FinalSub();
		
		//부모의 메서드를 호출하더라도 , 재정한 자식의 메서드가 호출이 됨 *****
		ref.unfinalMethod(); // 부모 ->재정의 -> 자식 우선
		ref.finalMethod();//부모의 메서드를 호출!
	}
}
