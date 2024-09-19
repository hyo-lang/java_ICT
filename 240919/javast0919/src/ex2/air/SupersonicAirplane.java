package ex2.air;

public class SupersonicAirplane extends Airplane{
	public SupersonicAirplane() {
		super("SupersonicAirplane");
	}
	@Override
	public void fly() {
		System.out.println("초음속 비행 합니다.");
	}
//	public void takeOff() {
//		System.out.println("이륙합니다.");
//	}
//	public void land() {
//		System.out.println("착륙합니다.");
//	}
	public static void main(String[] args) {
		//생성하고 , 시나리오 호출!
	}
}
