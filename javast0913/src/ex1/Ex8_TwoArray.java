package ex1;

public class Ex8_TwoArray {
	// 2차원 배열 행렬의 차원" 2x3
	public static void main(String[] args) {
		//int[][] arr = {{1,2,3},{4,5,6}};
		int[] ar1 = {1,2,3};
		int[] ar2 = {4,5,6};
		int[][] arr = {ar1,ar2}; // 0, 1
		//2차원 배열은 1차원 배열의 주소값을 저장하는 구조이다.
		for(int i=0; i< arr.length; i++) {
			//2차원 배열이 가지고 있는 주소에서 1차원 배열을 반복
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("======================");
		//연습문제) foreach문으로 변경해보세요.
		for (int[] e : arr) {
			for (int f : e) {
				System.out.println(f);
			}
			System.out.println();
		}
		
	}
}
