package se02;

public class Carr {
	String company; //멤버 필드 규격 : [접근 제한자] [수정자] 데이터타입 필드명
	String model;
	private String color;
	private int maxSpeed;
	int speed=100;
	int rpm;
	Body body;
	Engine engine;
	Tire tire;
	
	//멤버 상수
	//final static 데이터타입 상수명 = 값;
	
	public Carr() {}
	
	//[접근제한자] 반환타입 메서드명 ([매개변수타입] [매개변수명]...) {
	// 	실행할 내용 ;
	//	return 반환 변수 or 값; -> 반환변수가 가지는 갋이나 반환되는 값의 종류가 반환 타입과 일치해야함
	//	반환을 하지 않을 경우는 반환타입이 void
	//}
	
	//[접근제한자] 클래스명 ([매개변수타입] [매게변수명], ...)}
	// this.필드명 = 매개변수명;
	// this([매개변수명] | 값]);
	
	
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Tire getTire() {
		return tire;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}

	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	
}
