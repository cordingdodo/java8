package sec2;

public class RemoteEx1 {
	public static void main(String[] args) {
		RemoteControl rc1;
		RemoteControl rc2;
		rc1 = new Television();
		rc2 = new Audio1();
		
		rc1.turnOn();
		rc1.setVolume(8);
		rc1.setMute(true);
		rc1.turnOff();
		
		rc1 = rc2; //오디오로 형변환
		
		rc1.turnOn();
		rc1.setVolume(5);
		rc1.setMute(true);
		rc1.turnOff(); //인터페이스느 형제끼리 형변환 가능
		
		// RemoteControl rc3 = new RemoteControl(); //안 먹힘 이유는? 인터페이스=추상체 구현부x라서 생성자로 객체 생성x
		//익명의 구현 객체 : 구현 클래스없이 생성자에 직접 구현 내용 기술해 객체를 생성
		RemoteControl rc3 = new RemoteControl() {
			public void turnOn(){ System.out.println("전원을 켭니다.");}
			public void turnOff(){ System.out.println("전원을 끕니다.");}
			public void setVolume(int volume){ System.out.println("볼륨값 : "+volume);
			}
		};
		rc3.turnOn();
		rc3.setVolume(6);
		rc3.turnOff();
			
		//rc1 = new Audio1(); //생성자
		//rc2 = rc1; //자동 형변환
		//rc1 = rc2; //자동 형변환
		
	System.out.println("rc1은 Television의 객체?" +(rc1 instanceof Television) );
	System.out.println("rc1은 Audio1의 객체?" +(rc1 instanceof Audio1) ); //audio로 형변환
	System.out.println("rc1은 RemoteControl의 객체?" +(rc1 instanceof RemoteControl) ); //부모 인터페이스라서
		
	RemoteControl[] rc;
//	rc[0] = new Audio1();
	
	}

}
