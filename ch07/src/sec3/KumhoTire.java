package sec3;

public class KumhoTire extends Tire {
	public KumhoTire (String location, int maxRotation) {
		super(maxRotation, location);
}
	
	@Override
	public boolean roll () {
		++accumulatedRotation; //++이 먼저
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "Kumho Tire 수명 : " + (maxRotation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println(" ***** "+location+ "Kumho Tire 펑크 ***** ");
		} return false;
	}
	
}
