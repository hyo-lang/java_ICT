package ex1;

public class Ex3_Array {
	public static void main(String[] args) {
		intType();
	}

	private static void intType() {
		// 이방식은 오직 선언과 초기화를 한번에 가능
		//int[] numArr;//선언
		//numArr = {113,123,132};
		int[] numArr1 = {113,123,132};
		printIntArray(numArr1);
		// 선언, 초기화 따로 가능 
		int[] numArr2;
		numArr2 = new int[3];
		numArr2[0]=103;
		numArr2[1]=203;
		numArr2[2]=303;
		printIntArray(numArr2);
		// 가변 길이 형식으로 사용
		// 미리 선언해두고 , 배열의크기를 생략한 후  new int[]{} 값으로 초기화 해서 사용한다. *****
		int[] numArr3;
		numArr3 = new int[]{113,123,132};
		printIntArray(numArr3);
	}
	private static void printIntArray(int[] numArr) {
		//향상된 for문으로 출력 
		for (int i : numArr) {
			System.out.println(i+"******");
		}
		System.out.println("==================");
		
	}
}
