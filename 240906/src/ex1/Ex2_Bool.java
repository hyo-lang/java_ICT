package ex1;

//논리 타입 : 참과 거짓에 해당하는 true와 false 리터럴을 저장하는 타입
public class Ex2_Bool {
	public static void main(String[] args) {
		boolean stop = true;
		System.out.println(stop);
		boolean state = false;
		System.out.println(state);
		
		//비교 연산 ==> true, != 다를때 => true
		System.out.println(stop == state);
		System.out.println(stop != state);
		
		if(stop) {
			System.out.println("실행!");
		} else {
			System.out.println("노노!");
		}
		
		// false 의 부정 => true
		// !true => false, !false => true
		if(!state) {
			System.out.println("값이 false 일 때 실행");
		} else {
			System.out.println("값이 true 일 때 실행");
		}
	}

}
