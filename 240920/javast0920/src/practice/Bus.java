package practice;

public class Bus extends Card implements Transportation{

	private int time;
	private int volume;

	
	public Bus() {
		super(true, 2500);
	}

	@Override
	public void time() {
		System.out.println("운행시간 am 7:00 ~ pm 11:00 ");
		
	}
	public void setNum(int age) {
		if (age > AGE ) {
			System.out.println("어린이 입니다.");
		} else if (age == AGE) {
			System.out.println("청소년 입니다.");
		} else {
			System.out.println("성인 입니다.");
		}
	}
	
}
