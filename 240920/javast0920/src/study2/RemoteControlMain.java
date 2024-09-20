package study2;

public class RemoteControlMain {
	public static void main(String[] args) {
		RemoteControl ref = new Audio();
		ref.turnOn();
		ref.setVolume(0);
		ref.turnOff();
		System.out.println("-------------------------------");
		ref = new Television();
		ref.turnOn();
		ref.setVolume(5);
		ref.turnOff();
	}
}
