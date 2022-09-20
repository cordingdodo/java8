package se02;

public class Car {
	String name; //멤버 필드 : 객체(인스턴스)가 가지는 특성을 저장
	String fuel;
	int cc;
	int speed; 
	final static int MAX_SPEED = 500; //최대속도 안 바뀜 //멤버상수(final static): 값이 한 곳에 저장되어 더이상 바뀌지 않음
	final static int MIN_SPEED = 0; //더이상 바꾸지 말아라~ 라는 뜻으로 수정자를 씀 이게 final static 
	//↑ 멤버 상수는 반드시 초기화가 되어야하며, 그 값은 바뀌지  않음
	//[접근제한자] [수정자](모디큐어) 데이터 타입 필드명;
	
	public Car () {} //생성자 함수는 접근제한자 안 넣음 //기본 생성자로서 선언 또는 기술하지 않아도 자바에서 자동으로 생성됨(생략가능)
	public Car (String name) { this.name = name;} //앞 개체속성 뒤 매개변수
	public Car (String name, String fuel) { this.name = name; this.fuel=fuel; }
	//this(name, fuel, 1000); //일케 쓰면 각자 자리에 알아서 지정됨 1000=cc -> 생성자함수
	public Car (String name, String fuel, int cc) 
	{ this(name, fuel, cc, 0); } //디스함수 현재 객체의 생성자함수 뜻함 //하나 넣으면 1번 name 불러옴  // 두개 넣으면 2번째 호출 / 자기자신은 못 넣음
	
	public Car(String name, String fuel, int cc, int speed){
		this.name = name; this.fuel=fuel; this.cc=cc; this.speed=speed; //알아서 네개의 생성자함수를 찾아감
		
	//생성자(Constructor): 객체를 만드는 함수로서 클래스명과 동일해야 함
	//[접근 제한자] : 클래스명 (데이터타입 매개변수,....)  [ ]
	//이때 this= 현재 객체, this() = 생성자 함수

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//위는 값을 저장하는 거라면, 
	//메서드 (Method): 객체의 활동, 객체의 행위(=동사), 객체가 가지는  기능을 기술하는 것 / 특성은 메서드에 해당하지 않음 그저 활동만 해당함
	//[접근제한자] 반환타입 메서드명([데이터타입 매개변수]) { 활동/행위/기능 }
	//getter Method(게터 메서드): 현재 객체의 속성 (멤버필드) 에 저장된 데이터값을 가져오기  
	//setter Method(세터 메서드): 현재 객체의 속성 		    에 데이터값을 저장하기
	
	//bootUP(첫번째 소문자/두번째부터 대문자) /반환타입 void
	public void bootUP () {
		System.out.println("시동을  켭니다.");

	}
	public void bootOff() {
		System.out.println("시동을 끕니다.");
		
	}
	public int speedUp() {//속도값이 올라가면  //반환타입이 int이므로 return을 해주어야하는 것은 정수(int)여야함
		System.out.println("엑셀레이터를 밟습니다.");
		if(this.speed<this.MAX_SPEED){
			this.speed=this.speed+10;
		}
		return this.speed;
	}
	public int speedDown() {
		System.out.println("브레이크를 밟습니다.");
		if(this.speed>this.MIN_SPEED){
			this.speed=this.speed-10;
		}
		return this.speed;
		
	}
	public int speedInfo() {
		return speed; //원래 this인데 자동생략 매개변수 없을때만!
	}
	public void speedPrint() {
		System.out.println("현재 속도: "+this.speed);
	}
	public String fuelInfo() { //fuel이 스트링이라서 타입을 String으로 지정
		return fuel;
	}
}
