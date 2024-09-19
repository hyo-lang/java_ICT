package ex2.air;

import ex2.Ex2_Sub;

//복습>
// 상속관계에서 클래스를 객체로 생성하는 문법 
//step1) 자식참조자료형 변수 = new 자식클래스의생성자호출();
//step2) 부모참조자료형 변수 = new 자식클래스의생성자호출();
public class AirPlanMain2 {
public static void main(String[] args) {
	//미션 : 2개 비행기를 동시에 동작 
	
	//아하!!! 반복문이 필요하다.
//	for(int i=1; i<=3; i++) {
//	System.out.println(i);
//	}
	// 같은 변수를 100번을 사용해한다? => 배열(같은 자료형)로 사용
	// <복습> 정수형 배열 만들기
	//1) int[] arr = {1,2,3};
	
	//2) int[] arr = new int[3];
	// arr[0] = 10; ......
	// for문으로 저장하고싶다면?
	// for(int i=0; i< arr.length; i++){
	// arr[i] = i+1;
	// }
	//System.out.println("1번 비행기 =================");
	// 100개의 비행기라고 추정한다.
	// 메세지가 XX비행기가 경납고에서 나왔습니다 -> 혹시나 메세지를 변경하려면 좀더 유연한 방법?
	//LightAirCraft ref = new LightAirCraft();
	Airplane ref = new LightAirCraft(); //LightAirCraft 비행기가 경납고에서 나왔습니다.
//	ref.takeOff();
//	ref.fly();
//	ref.land();
	//System.out.println("2번 비행기 =================");
	Airplane ref2 = new SupersonicAirplane(); //초음속 비행기가 경납고에서 나왔습니다.
//	ref2.takeOff();
//	ref2.fly();
//	ref2.land();
	// 배열을 생성한다.
	Ex2_Sub aa = new Ex2_Sub();
	Airplane[] refArr = {ref,ref2};
	//배열 반복하면서 메서드를 일괄적으로 호출 
	//향상된 for문 적용해보기 
	int i = 0;
	for (Airplane e : refArr) {
		System.out.println((i+1)+"번 비행기 =================");
		e.takeOff();
		e.fly();
		e.land();
		i++;
	}
	
}
}





