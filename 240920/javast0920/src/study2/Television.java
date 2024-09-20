package study2;

public class Television implements RemoteControl{
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Television을 킵니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Television을 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		//
		if (volume > MAX_VOLUM) {
			this.volume = MAX_VOLUM;
		} else if(volume < MIN_VOLUM){
			this.volume = MIN_VOLUM;
			setMute(true);
		} else {
			this.volume = volume;
		}
		System.out.println("현재 " + this.getClass().getSimpleName()+ " 볼륨: " + this.volume);
		
	}

}
