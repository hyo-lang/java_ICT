package ex1.num1;

public class ExMain {
	
	/*인스턴스 메서드를 정의
	public String useName(ExSuper sub, int pay, String name) {
		sub.work(pay);
		return sub.uname(name);
	}*/
	
	//메서드 오버로딩
	public String useName(ExSuper sub,int pay, String name) {
		sub.work(pay);
		return sub.uname(name);
	}
	public static void main(String[] args) {
		ExMain ref = new ExMain();
		System.out.println("1: " + ref.useName(new Ex1_Sub(), 1000, "테스형1"));
		System.out.println("2: " + ref.useName(new Ex2_Sub2(), 2000, "테스형2"));
		
	}
}
