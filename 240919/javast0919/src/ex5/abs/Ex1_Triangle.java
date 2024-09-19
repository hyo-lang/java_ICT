package ex5.abs;
//제대로 설명 안들은 팀 
//"Triangle팀이"+getColor()+" 삼각형을 제작했습니다."
public class Ex1_Triangle extends Ex1_MainTeam{

	public void triangleDraw() {
		System.out.println("Triangle팀이"+getColor()+" 삼각형을 제작했습니다.");
	}
	//추상클래스를 상속받으려면 본사의 추상메서드를 강제로 재정의 해야 한다. !!!!!!!!!
	// 문제 해결 
	@Override
	public void drawSomething() {
		System.out.println("Triangle팀이"+getColor()+" 삼각형을 제작했습니다.");
	}
}
