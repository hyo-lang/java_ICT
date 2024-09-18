package ex2.demo;

public class Demo2Model {
	//멤버필드
	private Demo2VO vo;
	
	public void test1(Demo2VO vo) {
		// 2번을 구현하고
	}
	public void test2() {
		// 3번을 구현 
	}
	public static void main(String[] args) {
		// 1. Demo2Model 을 생성한다. -> model변수
		Demo2Model model = new Demo2Model();
		// 2. test1를 호출 할때 값을 저장한 Demo2VO의 주소를 전달한다. 힌트 model.test1(vo);
		// 멤버필드 그 주소를 저장한다.
		int num = 100;
		String name="테스형";
		
		// 3. test2를 호출 할때는 멤버필드(vo)의 값이 있으면 출력하고
		// 없으면 "데이터가 없어요" 라고 출력한다.
		
	}
}

