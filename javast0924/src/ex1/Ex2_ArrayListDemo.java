package ex1;

import java.util.ArrayList;

import ex1.vo.MemberVO;

//만약에 회원들의 데이터 - N명
//번호, 이름, 나이 => 회원의 순수한 값을 저장하는 객체? DTO, VO
//VO를 저장하는 전용 ArrayList
// 1) VO를 독립적으로 만든다.
// 2) ArrayList를 제네릭으로 VO를 등록한다. ArrayList<VO>
public class Ex2_ArrayListDemo {
	public static void main(String[] args) {
		
		// 1) ArrayList에 저장하기
		ArrayList<MemberVO> memList = new ArrayList<MemberVO>();
		// 2) VO를 독립적으로 만든다.
		MemberVO v = new MemberVO();
		//데이터 넣기
		v.setNum(1);
		v.setName("테스형");
		v.setAge(30);
		//ArrayList에 VO의 주소 저장하기
		memList.add(v);
		// 2-2 또다른 회원의 데이터 저장해보기
		MemberVO v1 = new MemberVO();
		v1.setNum(2);
		v1.setName("두식이");
		v1.setAge(20);
		memList.add(v1);
		//몇개인지 출력
		System.out.println("현재 회원 : " +  memList.size());
		//반복문으로 회원정보 출력
		for (MemberVO e : memList) {
			System.out.println("회원이름 : " + e.getName());
			System.out.println("회원이름 : " + e.getAge());
			System.out.println("회원이름 : " + e.getNum());
		}
	}
}
