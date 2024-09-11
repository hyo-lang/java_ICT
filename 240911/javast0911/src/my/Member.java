package my;

public class Member {
	// name , age 란 맴버 변수를 선언한다.
	private int age;
	private String name;
	// -기본생성자 : name은 "관리자", age는 20세
	public Member() {
		name = "관리자";
		age = 20;
	}
	// alt + Shift + s
	// 매개변수가 문자열인 생성자 : 이름만 입력받아서 name에 저장하고, age는 19세로 저장
	public Member(int age) {
		this.age = age;
	}
	// 매개변수가 2개인 생성자를 만들어서 초기화

	public Member(String name) {
		this.name = name;
		age = 19;
	}

	public Member(String name, int age) {
		this.age = age;
		this.name = name;

	}

	public String info() {
		return "name " + name + ", age " + age;
	}

	public static void main(String[] args) {
		//기본1
		Member ref = new Member(); //관리자, 20
		//이름
		Member ref2 = new Member("테스형"); //테스형, 19
		// 이름과 나이
		Member ref3 = new Member("테스형2", 20);
		//각각 info()를 호출한다
		System.out.println(ref.info());
		System.out.println(ref2.info());
		System.out.println(ref3.info());
	}

}
