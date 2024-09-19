package ex4;
//A-B-D => 100번지
//A-C-E => 200번지
public class AEMain {
public static void main(String[] args) {
	// 메모리 구조로 표현 해보기 - 연습문제 (선착순 5명)
	//D d = new D("type1");
	//System.out.println("===================");
	//E c = new E("type2");
	// 같은 자료형으로 변경 
	// 부모 참조 
	//A-B-D : 참조 범위 A ref =>?
//	A ref = new D("type1_1");
//	ref.testA();
//	System.out.println("===================");
//	A ref1 = new E("type1_1");
//	ref.testA();
	//A-B-D => 100번지
	//A-C-E => 200번지
	// instanceof : 같은 주소에 소속되는 지 확인 *****
	// 다형성에서 어떤 자식 클래스인지 구분할때 자주 사용한다.
	A ref = new D("type1_1");
	System.out.println("new D()에 해당되는 instanceof");
	System.out.println("A ref instanceof 자료형 :"+(ref instanceof A));
	System.out.println("A ref instanceof 자료형 :"+(ref instanceof B));
	System.out.println("A ref instanceof 자료형 :"+(ref instanceof D));
	// 이유는 다른 인스턴스의 주소를 가지기 때문이다.
	System.out.println("A ref instanceof 자료형 :"+(ref instanceof E));//false
	
	//A-B-D => 100번지 자료형에서 B를 자료형으로 선택했을 때
	// 컴파일러는 E의 자료형인 A는 인식하지만 B는 컴파일러가 모르는 것 *******
	B ref2 = new D("type2");
	System.out.println("B ref instanceof 자료형 :"+(ref2 instanceof A));
	System.out.println("B ref instanceof 자료형  :"+(ref2 instanceof B));
	System.out.println("B ref instanceof 자료형 :"+(ref2 instanceof D));
	//A-C-E => 200번지 자료형에서 
	//System.out.println("B ref instanceof 자료형 :"+(ref2 instanceof E));
}
}




