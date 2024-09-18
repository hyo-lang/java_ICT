package ex2.board;

import java.text.SimpleDateFormat;
import java.util.Date;

// model 은 데이터를 프로그램으로 가공처리 
public class BoardModels {
	private BoardVO vo; //vo를 선언한다.
	
	//입력
	public void insertBoard(BoardVO vo) {
		//날짜를 자동으로 입력하는 처리 : SimpleDateFormat 날짜를 지정할 수 있도록 
		//지원해주는 객체
		//패턴 : 년도 4자리 : yyyy , 월 : MM , 일 : dd
		//2024-09-12로
		SimpleDateFormat f= new SimpleDateFormat("yyyy-MM-dd");
		String today = f.format(new Date());
		// 변경된 날짜를 BoardVO에 저장 
		vo.setBdate(today);
		this.vo = vo;
	}
	//출력
	public String listBoard() {
		String res = "";
		res +="번호:"+vo.getNum()+" ";
		res +="작성자:"+vo.getWriter()+" ";
		res +="제목:"+vo.getTitle()+" ";
		res +="내용:"+vo.getContent()+" ";
		res +="작성날짜:"+vo.getBdate()+"\n";
		return res;
	}
}
