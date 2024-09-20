package animal;

import ex2.Animal;

public class Bird extends Animal {
	
	
	@Override
	public void cry() {
		System.out.println("짹짹");

	}

	@Override
	public String hit(int cryHit) {
		//1. 매개변수로 받은 ctyHit값을 부모의 cryHit에 값을 저장
		super.cryHit=cryHit;
		//2. aniCry() 호출해서 cryHIt값이 100이상인지 아닌지에 따른 반환값
		String snd = aniCry();
		return "Bird가 " +cryHit + " 울다 "+snd+" 처럼 들린다.";
	}
	

}