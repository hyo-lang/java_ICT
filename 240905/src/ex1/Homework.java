package ex1;

public class Homework {
	System.out.println("지역변수 최종 정리 및 응용");
	//지역변수 선언 
	String name;
	int age;
	int speed;
	// 변수를 초기화 해서 사용해보자.
	name="김지현";
	age = 18;
	speed = 10;
	// 결과를 출력 -> 변수 +"문자열" => + 연결 연산자 기능 
	System.out.println(name+"은 나이가 "+age+"이고 100미터 달리기를 하면 "+speed+"초대를 기록한다.");
	// 남,여 
	char gender;
	// 남자 : 파랑색, 여자 : 핑크색 
	String col;
	// 여자를 대입
	gender = '남';
	// 조건을 판별하는 경우의 수가 2개이거나 , 1 아니면 All을 나타 낸다.
	//성별을 체크 if(조건){ 실행; } else {실행;} 
	// A == B 같다. 일반 자료형 : 값비교, 참조자료형 : 주소값 비교
	System.out.println(gender =='남');
	if(gender =='여') {
		col ="핑크색";
	}else {
		col ="파랑색";
	}
	//print():줄바꿈이 안됨
	System.out.print(col+" 깃발을 받았으며,");
	
	//1) age값을 기준으로 비교해서 19세 이상이면 if문 동작 하면서
	// type변수에 성인을 저장하고, 아니면 else에서 미성년을 저장한다.
	String type;
	if (age >= 19) {
		type ="성년";
	} else {
		type ="미성년";
	}
	System.out.println(type+" 입니다.");
	
	
	//2) speed >= 11 이상이냐 미만이냐 , 이상이면 빠르다. 아니면 느리다. 출력 
	String res;
	if(speed >= 11) {
		res = "빠르다.";
	}else {
		res = "느리다.";
	}
	System.out.println(res);
}

}
