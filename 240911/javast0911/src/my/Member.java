package my;

public class Member {

	private int age;
	private String name;

	public Member() {
		name = "관리자";
		age = 20;
	}

	public Member(int age) {
		this.age = age;
	}

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
		Member ref = new Member();
		Member ref2 = new Member("테스형");
		Member ref3 = new Member("테스형2", 20);

		System.out.println(ref.info());
		System.out.println(ref2.info());
		System.out.println(ref3.info());
	}

}
