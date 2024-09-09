package ex2;

//int n = (int)(math.random()*갯수)+시작숫자)
public class Ex1_SubRandom {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i + " 번째 난수 =>" + (Math.random()));
			
			System.out.println(i + " 번째 난수 => " + ((int)(Math.random()*4)+1));
			System.out.println("==================================");
		}
	}

}
