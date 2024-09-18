package ex1;
//싱글톤패턴 *****
//자원과 관련된 객체를 무분별하게 생성하지 못하도록 제어 하는 패턴
//규칙 : 생성자를 private , 객체는 생성한 후 그 주소를 static영역에 딱 한번만 저장한다. ***** 
//사용하는 메서드를 제공 
//사용개념 : 사용하는 메서드() 처음 호출시 오직 한번만 static영역에 객체를 참조
//를시켜놓고 , 다시 호출 할때는 이미 저장한 객체의 주소를 돌려주는 개념 
public class Ex4_SingleTone {
	// private --------------> 정보은닉화 
	//1.static영역에 참조할 변수를 선언 
	//static int num;
	private static Ex4_SingleTone ref;
	//2.생성자를 외부에서 접근 X
	private Ex4_SingleTone() {
		System.out.println("생성자가 호출이 됨!!!!!!");
	}
	//3. Ex4_SingleTone을 싱글톤으로 생성을 할 메서드를 제공
	// public  --------------> 정보은닉화를 접근 , 캡슐화 
	// 반환형이 참조자료형 -> String도 마찬가지로 참조 자료형을 반환 
	// Ex4_SingleTone 의 생성된 주소를 반환 하는 메서드 
	public static Ex4_SingleTone getInstance() {
		// 처음에 getInstance() 호출이 될때 딱 한번만 생성하고
		if(ref == null) { // 생성 안되었을 경우
			ref = new Ex4_SingleTone();
		}
		// 아니면 이미생성된 ref 반환
		return ref;
	}
	//싱글톤인지를 증명한다.
	public static void main(String[] args) {
		//외부에서 객체를 new로 생성해서 만들지 못한다. *****
		Ex4_SingleTone ref1 = Ex4_SingleTone.getInstance(); // 처음 메서드를 호출!
		Ex4_SingleTone ref2 = Ex4_SingleTone.getInstance(); // 두번째 메서드를 호출!
		//이 주소가 같은지 다른지를 비교 
		System.out.println(ref1 == ref2); // true
		
		//참고로 비슷한 기능을 String에서 찾아서 복습
		String str1 = "Test"; //Heap에 String 객체가 생성
		String str2 = "Test";
		System.out.println(str1 == str2 );
	}
	
}







