package ex1;
//배열의 필요성 
//변수에 각각 저장해서 사용하게 되면 관리하기도 어렵기 때문에
//같은 자료형의 배열에 저장해서 사용하면 효율적 관리가 쉽다.
public class Ex1_Array {
public static void main(String[] args) {
	//test1();
	test2();
}
private static void test2() {
	// test1과는 다르게 배열로 저장 및 관리 
	// 규칙 : 생성시 크기가 있어야 한다.
	// 같은 자료형으로 저장한다.
	// <자료형> 변수 = 값 or new 생성자호출()
	//<[int->1][2][100]>
	int[] stArr = {1,2,100};
	System.out.println("배열의 길이:"+stArr.length);
	//배열변수[index] 접근
	System.out.println("index를 사용해서 배열의 값을 출력:"+stArr[0]); //1
	System.out.println("index를 사용해서 배열의 값을 출력:"+stArr[2]); //100
	// int n = 10; n = 20; 
	stArr[1] = 1000;  // 2 -> 1000
	System.out.println("index를 사용해서 배열의 값을 출력:"+stArr[1]); 
	System.out.println("---------------------");
	// for문을 사용해서 배열의 인덱스를 출력 -> 배열안에 값을 출력 
	for(int i=0; i<stArr.length; i++) {
		System.out.println(stArr[i]);
	}
	//문법)
	//for(배열안에자료형 변수(e) : 배열변수){
	//실행;
	//}
	//int[] stArr = {1,2,100};
	//float[] ftArr = {};
	System.out.println("---------------------");
	for(int e : stArr) {
		System.out.println("배열의값:"+e);
	}
}
//변수에 각각 저장해서 사용하게 되면 관리하기도 어렵다.
private static void test1() {
	//System.out.println("실행!");
	//변수 선언 
	int st1 = 1;
	
	int st2 = 2;
	int st3 = 100;
	int sti =0;
	for(int i=0; i<3; i++) {
		System.out.println("int st"+(i+1)+"="+i);
		sti = i;
		
	}
	System.out.println(sti);
}
}







