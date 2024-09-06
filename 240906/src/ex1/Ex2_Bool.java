package ex1;

public class Ex2_Bool {
	public static void main(String[] args) {
		boolean stop = true;
		System.out.println(stop);
		boolean state = false;
		System.out.println(state);
		
		System.out.println(stop == state);
		System.out.println(stop != state);
		
		if(stop) {
			System.out.println("실행!");
		} else {
			System.out.println("노노!");
		}
		
		if(!state) {
			System.out.println("값이 false 일 때 실행");
		} else {
			System.out.println("값이 true 일 때 실행");
		}
	}

}
