package ex2;

import animal.Bird;

public abstract class Animal {
	// protecred?
	protected int cryHit;

	// abstract ?
	public abstract void cry();

	public abstract String hit(int cryHit);


	// final ?
	public final String aniCry() {
		if (cryHit >= 100) {
			return "거친목소리";
		} else {
			return "이쁜목소리";
		}
	}
}
