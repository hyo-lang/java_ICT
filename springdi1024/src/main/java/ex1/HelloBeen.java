package ex1;
//�������� ������ ��ü
public class HelloBeen {
	//�ڿ�
	private String msg;
	
	public HelloBeen() {
		System.out.println("HelloBeen �⺻ ������ ȣ��!");
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
		System.out.println("�������� ���ؼ� �޼����� DI ����");
	}
	//======================================================
	public String helloMes() {
		return msg;
	}
}
