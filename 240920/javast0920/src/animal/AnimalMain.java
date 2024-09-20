package animal;

import ex2.Animal;

public class AnimalMain {
	public static void main(String[] args) {
		//다형성으로 배치 처리
		Animal[] ani = {new Cat(), new Dog(), new Bird()};
		int[] hits = {90, 200, 120};
		int i = 0;
		for (Animal e : ani) {
			e.cry();
			System.out.println(e.hit(hits[i]));
			i++;
		}
	}

}
