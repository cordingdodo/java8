package sec2;

public interface RemoteControl {
	public int MAX_VOLUME =10;
	public int MIN_VOLUME =0;


	//추상메서드 : only 선언
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디폴트 메서드 : 선언부 구현부
	default void setMute(boolean mute){
		if(mute) { System.out.println("** 무음 작동 **");
		} else {
			System.out.println("** 무음 해제 **");
		}
		
	}
	//정적 메서드 : 선언부 구현부 기술, 객체 생성없이 직접 공유데이터로 간주해 활용
	static void changeBattery() {
		System.out.println("** 건전지 교체요망 **");
	}
	}
	

