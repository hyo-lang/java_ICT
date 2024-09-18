package ex2;
//Model -> 추론 / 구현한 객체 
public class ProfileModel {
	private String name;
	private int age;
	private boolean chk;	
	//기능 2 
	// 1- 사용자의 정보를 저장하는 기능
	public void addProfile(String name,int age) {
		// 데이터를 가공하는 기능이 포함
		if(age >  19) {
			chk = true; //허가
		}else {
			chk = false; // 불가
		}
		this.name = name;
		this.age = age;
	}
	// 2- 저장한 정보를 출력해주는 기능 
	public void printProfile() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		String msg;
		if(chk) {
			msg ="입장허가";
		}else {
			msg ="입장불가";
		}
		System.out.println("chk:"+msg);
	}

}
