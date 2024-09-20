package animal;

import ex2.Animal;

public class Dog extends Animal{

	@Override
	public void cry() {
		System.out.println("멍멍");
		
	}

	@Override
	public String hit(int cryHit) {
		super.cryHit=cryHit;
		
		String snd = aniCry();
		return "Dog가 " +cryHit + " 울다 "+snd+" 처럼 들린다.";
	}

}
