package ex2.diref;
//springDi ��ü�� �����ϴ� ��� 
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
		ref.setSource(new MySource("�������ڵ�!"));
		ref.result();
	}
}
