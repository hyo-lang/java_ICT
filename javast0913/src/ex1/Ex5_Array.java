package ex1;
//학습 포인트 : 가변길이 배열을 사용해야 할 경우에 대한 예시
//매개변수로 전달된 arrType의 값에 따라서 다른 값을 멤버필드의 int[] numArry
//에 가변적으로 이렇게 저장할 수 있는 문법이다.
public class Ex5_Array {
	private int[] numArry;
	//1일때는 100 단위의 수를 가진 배열 생성
	//나머지 1000 단위의 수를 가진 배열 생성
	public void createNumArray(int arrType) {
		//int[] numArry = {100,200,300};
		//numArry = {1000,2000,3000};
		if (arrType == 1) {
			numArry =  new int[]{100,200,300};
		} else {
			numArry = new int[] {1000,2000,3000};
		}
	}
	public void printNumArray() {
		for(int e : numArry) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Ex5_Array ref = new Ex5_Array();
		ref.createNumArray(2);
		ref.printNumArray();
	}
}
