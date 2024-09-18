package ex1;

import java.util.StringTokenizer;

//API : String -> split():String[] , split("구분자") 
//=> 구분자를 기준으로 문자열을 잘라서 배열에 저장해서 반환 
//데이터 수집 - 로깅,웹 크롤링 등
//주의사항 : 반드시 구분문자에 대한 데이터의 구간을 정밀하게 설계를 해야 한다.
//Whitespace 고민을 하고 나서 사용을 권장 
//1.  StringTokenizer
//StringTokenizer 클래스는 구분자를 기준으로 문자열을 토큰단위로
//잘라내어서 String(문자열) 반환 ->수지양♥♥오로라-> ♥Whitespace♥를 토큰으로 취급하지 않음 

//2. String클래스의 메서드인 split():String[] ->구분자를 기준으로 문자열을 반환
// 차이) 수지양♥♥오로라-> ♥Whitespace♥를 문자열로 잘라서 반환 
public class Ex6_Split_StringTokenizer2 {
public static void main(String[] args) {
	// split은 ♥Whitespace♥ 도 데이터로 취급한다.
	String str ="테스형♥리선화★장현♥수지양♥♥오로라";
	String[] arr = str.split("♥");
	System.out.println("배열의 길이 : "+arr.length);
	for (String e: arr) {
		System.out.println(e);
	}
	// 토큰은 사라지지만 , 배열은 그대로 유지한다.
	System.out.println(arr[0]);
	System.out.println("=====================================");
}
}





