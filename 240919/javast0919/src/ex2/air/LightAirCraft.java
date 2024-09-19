package ex2.air;

public class LightAirCraft extends Airplane{
	
	//기본생성자를 정의해서 초기화
	// LightAirCraft 비행기가 경납고에서 나왔습니다.
	public LightAirCraft() {
		//System.out.println("LightAirCraft 비행기가 경납고에서 나왔습니다.");
		super("LightAirCraft");
	}
	@Override
	public void fly() {
		System.out.println("저공/저속비행");
	}
//	public void takeOff() {
//		System.out.println("이륙합니다.");
//	}
//	public void land() {
//		System.out.println("착륙합니다.");
//	}
	public static void main(String[] args) {
		LightAirCraft ref = new LightAirCraft();
		// 시나리오에 맞게 메서드 호출 해보기 
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
