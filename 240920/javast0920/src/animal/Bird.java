package animal;

import ex2.Animal;

public class Bird extends Animal {
	
	
	@Override
	public void cry() {
		System.out.println("짹짹");

	}

	@Override
	public String hit(int cryHit) {
		super.cryHit=cryHit;
		
		String snd = aniCry();
		return "Bird가 " +cryHit + " 울다 "+snd+" 처럼 들린다.";
	}
	

}