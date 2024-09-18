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
public class Ex6_Split_StringTokenizer {
public static void main(String[] args) {
	// 만약에 공백이라면 공백또한 데이터로 취급 
	String str ="테스형♥리선화★장현♥수지양♥♥오로라";
	StringTokenizer stz= new StringTokenizer(str,"♥");
	System.out.println("Token Count :"+stz.countTokens()); //4
	//System.out.println("첫번째 토큰:"+stz.nextToken()); //테스형
	//System.out.println("Token Count :"+stz.countTokens() +", Token 상태:"+stz.hasMoreTokens());
	//System.out.println("두번째 토큰:"+stz.nextToken()); //리선화★장현
	//System.out.println("세번째 토큰:"+stz.nextToken()); // 수지양
	//System.out.println("네번째 토큰:"+stz.nextToken()); // 오로라
	//System.out.println("Token Count :"+stz.countTokens() +", Token 상태:"+stz.hasMoreTokens());
	//System.out.println("다섯번째 토큰:"+stz.nextToken()); //오류 =>java.util.NoSuchElementException
	//int tsize =stz.countTokens();
	//for(int i=0; i<tsize; i++) {
	//	System.out.println(i+"번째 토큰:"+stz.nextToken());
	//}
	// while문에 조건을 ->hasMoreTokens() 사용해서 nextToken() : 단축키 제공
	while (stz.hasMoreTokens()) {
		String m = stz.nextToken();
		System.out.println(m);
	}
	System.out.println("=====================================");
}
}





