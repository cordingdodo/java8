package sec3;

public class Tire { //멤버필드
	public int maxRotation; //최대 회전수 (타이어 수명)
	public int accumulatedRotation; //누적 회전수
	public String location;
	public Tire(int maxRotation, String location) {
 		//super(); //모든 클래스엔 조상이 있음 최고조상은 object / object를 나타내는 것이 super
		this.maxRotation = maxRotation;
		this.location = location;
}
	//멤버 메소드
	public boolean roll() {
		++accumulatedRotation; //++이 먼저
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "Tire 수명 : " + (maxRotation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println(" ***** "+location+ "Tire 펑크 ***** ");
		} return false;
	}
}
