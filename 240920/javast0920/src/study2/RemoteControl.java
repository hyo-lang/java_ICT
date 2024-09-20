package study2;

public interface RemoteControl {
	
	int MAX_VOLUM = 10;
	int MIN_VOLUM = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if (mute) {
			setVolume(MIN_VOLUM);
		}else {
			System.out.println("무음 해체합니다.");
		}
	}
	
}
