package study;

public class RemoteControlMain {
	public static void main(String[] args) {
		RemoteControl ref = new Audio();
		ref.turnOn();
		ref = new Television();
		ref.turnOn();
	}
}
