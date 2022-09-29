package sec2;

import java.rmi.Remote;

public class Audio1 implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("audio 전원을 켭니다.");
	}
	@Override
	public void turnOff() {			
		System.out.println("audio 전원을 끕니다.");}
	
	public int getVolume() {return volume;}
	
	//public void setVolume(int volume) {	this.volume = volume;}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME){
			this.volume=RemoteControl.MAX_VOLUME;
	} else if (volume<RemoteControl.MIN_VOLUME){
			this.volume=RemoteControl.MIN_VOLUME;
	} else {
			this.volume=volume;
	}
		System.out.println("현재 볼륨 :" +this.volume);
	}
	


}
