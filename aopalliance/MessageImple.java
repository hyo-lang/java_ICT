package aopalliance;
//Advice�� ������  JoinPoint�� ���� �� �ִ� Ÿ�� ��ü
public class MessageImple implements Message{
	private String message;
	public MessageImple() {
		message = "�ȳ��ϼ���. ù AOP�Դϴ�.";
	}
	@Override
	public void print() {
		long start = System.currentTimeMillis();
		for(int i=0; i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("�ҿ�ð� :" + (end - start));
	}
	@Override
	public String printTest() {
		long start = System.currentTimeMillis();
		for(int i=0; i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("�ҿ�ð� :" + (end - start));
		return "�ҿ�ð� :" + (end - start);
	}
	@Override
	public String defaultMessage() {
		return message;
	}

	@Override
	public void test() {
		//System.out.println("������������������������������");
		System.out.println("Test~~~~~~~~~~~~�����Ͻ� ����!");
		//System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡ�"); // ����
	}
	@Override
	public void test2() {
		//System.out.println("������������������������������");
		System.out.println("Test2~~~~~~~~~~~~�����Ͻ� ����!");
		//System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡ�"); // ����
	}
	@Override
	public void test3(String msg) {
		//System.out.println("������������������������������");
		System.out.println("Test3~~~~~~~~~~~~�����Ͻ� ����!");
		//System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡ�"); // ����
	}
	@Override
	public void testMyAdd() {
		//System.out.println("������������������������������");
		for(int i=0; i<100; i++) {
			if(i % 10 == 0) {
				System.out.println(i);
			}
		}
		//System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡ�"); // ����
	}

}
