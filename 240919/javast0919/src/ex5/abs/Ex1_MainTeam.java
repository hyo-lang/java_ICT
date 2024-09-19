package ex5.abs;
//메인팀이 설계한 Ex1_MainTeam.class파일
//1. 본사의 색상,기능을 담당하는 클래스 (부모클래스)
public abstract class Ex1_MainTeam {
	private String color;
	public Ex1_MainTeam() {
		color ="황금색";
	}
	//사용가능, 재정의 안됨!
	public final void setColor(String color) {
		this.color = color;
	}
	private String logo() { //정보 은닉 , 재정의 안됨!
		return "◎□▲ ICTPassword2";
	}
	public final String getColor(){ //모든 팀이 적용 
		return "본사"+logo()+"의"+color;
	}
	//지사들이 재정의 해서 구현 해야 할 메서드 - 추상메서드
	public abstract void drawSomething();
}
