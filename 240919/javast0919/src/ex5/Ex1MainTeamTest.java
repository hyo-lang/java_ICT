package ex5;

//본사에서 지사들의 클래스를 받아서 객체로 생성하고
//배치처리를 수행한다.
public class Ex1MainTeamTest {
	public static void main(String[] args) {
		// 팀을 생성
		// 모든팀의 색상을 <배치 테스트>
		// 본사에서 색상을 결정해서 공정작업을 완성
		// 자료형[] 변수명 = new 자료형[크기] -> 같은 자료형!
		String[] colors = { "빨간색", "노란색", "파란색" };
		// 지사 클래스를 객체로 각각 생성한다.
		Ex1_Rect ref1 = new Ex1_Rect();
		Ex1_Circle ref2 = new Ex1_Circle();
		Ex1_Triangle ref3 = new Ex1_Triangle();
		
		//배열의 자료형을 선언하고 위의 객체를 배열의 값으로 초기화 해보기 
		// 다형성 -> 접점 , 부모가 접점이다.
		Ex1_MainTeam[] arr = {ref1,ref2,ref3};
		//배치처리 
		for(int i=0; i< arr.length; i++) {
			//i=0일때 Ex1_Rect의 setColor호출해서 "빨간색" 저장한다.
			//i=1일때 Ex1_Circle의 setColor호출해서 "노란색" 저장한다.
			arr[i].setColor(colors[i]);
			arr[i].drawSomething(); //지사의 특별한 메서드를 본사가 일괄 호출!!!!!!
			System.out.println("==============");
		}
		
	}
	
	
	
}

