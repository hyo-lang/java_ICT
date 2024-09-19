package ex2.air;
//복습>
// 상속관계에서 클래스를 객체로 생성하는 문법 
//step1) 자식참조자료형 변수 = new 자식클래스의생성자호출();
//step2) 부모참조자료형 변수 = new 자식클래스의생성자호출();
public class AirPlanMain {
public static void main(String[] args) {
	//미션 : 2개 비행기를 동시에 동작 
	
	System.out.println("1번 비행기 =================");
	// 100개의 비행기라고 추정한다.
	// 메세지가 XX비행기가 경납고에서 나왔습니다 -> 혹시나 메세지를 변경하려면 좀더 유연한 방법?
	//LightAirCraft ref = new LightAirCraft();
	Airplane ref = new LightAirCraft(); //LightAirCraft 비행기가 경납고에서 나왔습니다.
	ref.takeOff();
	ref.fly();
	ref.land();
	System.out.println("2번 비행기 =================");
	Airplane ref2 = new SupersonicAirplane(); //초음속 비행기가 경납고에서 나왔습니다.
	ref2.takeOff();
	ref2.fly();
	ref2.land();

	
}
}
