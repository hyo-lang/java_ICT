package animal;

import ex2.Animal;

public class Cat extends Animal{

	@Override
	public void cry() {
		System.out.println("미야옹");
		
	}

	@Override
	public String hit(int cryHit) {
		super.cryHit=cryHit;
		
		String snd = aniCry();
		return "Cat가 " +cryHit + " 울다 "+snd+" 처럼 들린다.";
	}
	
}
