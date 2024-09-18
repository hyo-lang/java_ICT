package ex1;
//일반자료형 배열 => int[] , float[] , char[] ........
//참조자료형 배열은 결국은 생성된 객체의 주소를 배열의 인덱스에 
//하나씩 값을 저장하는 것이 아니라. 즉 주소값을 인덱스에 저장한다.
public class Ex4_Array {
public static void main(String[] args) {
	String[] strArr = new String[3];
	//int num = 4;
	//strArr[0] = String.valueOf(num);
	strArr[0] = "Test";
	strArr[1] = new String("Test");
	strArr[2] = "Test";
	//위의 코드에서 힙영역에 생성되는 객체는 몇개인가요?
	System.out.println(strArr[0] == strArr[2] ); //주소값이 같음
	//foreach 
	for(String e : strArr) {
		System.out.println(e.charAt(0));
	}
}
}
