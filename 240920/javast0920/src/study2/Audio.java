package study2;

public class Audio implements RemoteControl {

	private int volume;
	private int memoryVolume;
	
	
	
	@Override
	public void setMute(boolean mute) {
		if (mute) {
			this.memoryVolume = this.volume;
			System.out.println("Audio 무음 처리합니다.");
			setVolume(RemoteControl.MIN_VOLUM);
		} else {
			System.out.println("Audio 무음 해제합니다.");
			setVolume(this.memoryVolume);
		}
	}

	@Override
	public void turnOn() {
		System.out.println("Audio를 킵니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// RemoteControl MAX_VOLUME, MIN_VOLUM과 Audio의 int volume 비교
		if (volume > MAX_VOLUM) {
			this.volume = MAX_VOLUM;
		} else if (volume < MIN_VOLUM) {
			this.volume = MIN_VOLUM;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 " + this.getClass().getSimpleName() + " 볼륨: " + this.volume);
	}

}
