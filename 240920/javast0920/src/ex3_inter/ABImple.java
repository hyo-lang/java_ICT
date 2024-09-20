package ex3_inter;

//다중구현으로 만들어보기
public class ABImple implements IA, IB {

	@Override
	public void b() {
		System.out.println("B요");

	}

	@Override
	public void a() {
		System.out.println("A요");

	}

	public static void main(String[] args) {
		IA ref = new ABImple();
		IB ref1 = new ABImple();
		ref.a();
		ref1.b();
	}
}
