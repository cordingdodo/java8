package sec2;

public class Television implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}
	public int getVolume() {return volume;}
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME){
			this.volume=RemoteControl.MAX_VOLUME;
	} else if (volume<RemoteControl.MIN_VOLUME){
		this.volume=RemoteControl.MIN_VOLUME;
	} else {
			this.volume=volume;
	} 		System.out.println("현재 스마트tv 볼륨 :" +this.volume);
	}
	
	
	

}
