package ex2.board;

import java.util.Scanner;

public class BoardFront {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("번호:");
	int num = Integer.parseInt(sc.nextLine());
	System.out.print("작성자:");
	String writer = sc.nextLine();
	System.out.print("제목:");
	String title = sc.nextLine();
	System.out.print("내용:");
	String content = sc.nextLine();
	//우리가 만든 프로그램인 모델에게 값을 전달하는
	//메서드(insertBoard)를 통해서 입력처리
	//모델 생성
	BoardModels model = new BoardModels();
	// insertBoard의 매개변수가 값을 가지는 객체를
	// 받기로 정의가 되어 있어서 
	// =>insertBoard(BoardVO vo)
	// 매개변수를 만들어서 전달 해주면된다.
	BoardVO vo = new BoardVO();
	// vo에서 setter사용해서 값을 저장 내놓는다.
	vo.setNum(num);
	vo.setWriter(writer);
	vo.setContent(content);
	vo.setTitle(title);
	model.insertBoard(vo);
	// 들어 갔는지 확인(출력)
	System.out.println(model.listBoard());
	
}
}
