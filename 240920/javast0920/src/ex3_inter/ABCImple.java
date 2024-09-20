package ex3_inter;

public class ABCImple implements IC{

	@Override
	public void a() {
		System.out.println("A요");
		
	}

	@Override
	public void b() {
		System.out.println("B요");
		
	}
	public static void main(String[] args) {
		IC ref = new ABCImple();
		ref.a();
		ref.b();
	}
}
