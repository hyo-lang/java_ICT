package ex1;
//도전과제)
//메뉴 1.회원가입 2.회원출력 3. 종료
// 1- 가입
// 번호1)
// 이름:
// 나이:
// 2- 목록
// 번호 : 1
// 이름 : 테스형1
// 나이 : 30
// 접근여부 : 허용안함
//번호 : 2
//이름 : 테스형1
//나이 : 30
//접근여부 : 허용

import java.util.ArrayList;

import ex1.vo.MemberVO;

//만약에 회원들의 데이터 - N명
//번호, 이름, 나이 => 회원의 순수한 값을 저장하는 객체? DTO, VO
//VO를 저장하는 전용 ArrayList
// 1) VO를 독립적으로 만든다.
// 2) ArrayList를 제네릭으로 VO를 등록한다. ArrayList<VO>
public class Ex2_ArrayListDemo2 {
	public static void main(String[] args) {

		ArrayList<MemberVO> memList = new ArrayList<MemberVO>();
		for(int i=0; i<5; i++) {
		MemberVO v = new MemberVO();

		v.setNum(i+1);
		v.setName("테스형"+(i+1));
		v.setAge(30+i);
		memList.add(v);
		}
		System.out.println("총회원 : " + memList.size());
		//회원목록
		for (MemberVO e : memList) {
			System.out.println("번호 : " + e.getNum());
			System.out.println("번호 : " + e.getName());
			System.out.println("번호 : " + e.getAge());
			System.out.println("=====================");
		}
	}
}
