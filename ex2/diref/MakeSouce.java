package ex2.diref;
//springDi 객체를 정의하는 방법 
public class MakeSouce {
	private MySource source;

	public void setSource(MySource source) { //DI
		this.source = source;
	}
	//-----------------------------------------
	public void result() {
		System.out.println(source.reTurnSource());
	}
	public static void main(String[] args) {
		MakeSouce ref = new MakeSouce();
		ref.setSource(new MySource("스프링코드!"));
		ref.result();
	}
}
