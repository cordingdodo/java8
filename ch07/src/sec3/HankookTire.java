package sec3;
//Tire의 모든 내용을 상속 받되, roll() 메소드에서 타이어 이름을 부여 
public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(maxRotation, location); //내용 맞아야 함
	}
	
	@Override
	public boolean roll () {
		++accumulatedRotation; //++이 먼저
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "Hankook Tire 수명 : " + (maxRotation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println(" ***** "+location+ "Hankook Tire 펑크 ***** ");
		} return false;
	}
}
