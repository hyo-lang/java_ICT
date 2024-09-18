package ex1;
//정적 블록 (static 블록) : 메인메서드 보다 먼저 실행
//:초기화 작업이 필요하다면 사용
// 학습시 순서의 의미를 정확하게 파악을 해본다.<복습>
public class Ex3_StaticBlock {
	static int num;
	int age;
	static {//1
		System.out.println("메인 보다 초기화에서 시작 ");
		test();
	}
	static void test() {
		//this. :this는 클래스 내에서 참조 가능한 인스턴스, 즉 자신의 주소를 의미한다.
		System.out.println("static test메서드 호출!");
	}
	public Ex3_StaticBlock() {
		System.out.println("객체가 생성 될때 초기화");
	}
	public static void main(String[] args) {//2
		System.out.println("메인 시작 ");
		Ex3_StaticBlock ref = new Ex3_StaticBlock();
	}
}
