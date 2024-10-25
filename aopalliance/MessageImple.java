package aopalliance;
//Advice를 적용할  JoinPoint를 가질 수 있는 타켓 객체
public class MessageImple implements Message{
	private String message;
	public MessageImple() {
		message = "안녕하세요. 첫 AOP입니다.";
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
		System.out.println("소요시간 :" + (end - start));
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
		System.out.println("소요시간 :" + (end - start));
		return "소요시간 :" + (end - start);
	}
	@Override
	public String defaultMessage() {
		return message;
	}

	@Override
	public void test() {
		//System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		System.out.println("Test~~~~~~~~~~~~비지니스 로직!");
		//System.out.println("★★★★★★★★★★★★★"); // 후행
	}
	@Override
	public void test2() {
		//System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		System.out.println("Test2~~~~~~~~~~~~비지니스 로직!");
		//System.out.println("★★★★★★★★★★★★★"); // 후행
	}
	@Override
	public void test3(String msg) {
		//System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		System.out.println("Test3~~~~~~~~~~~~비지니스 로직!");
		//System.out.println("★★★★★★★★★★★★★"); // 후행
	}
	@Override
	public void testMyAdd() {
		//System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		for(int i=0; i<100; i++) {
			if(i % 10 == 0) {
				System.out.println(i);
			}
		}
		//System.out.println("★★★★★★★★★★★★★"); // 후행
	}

}
