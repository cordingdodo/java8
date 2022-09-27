package sec3;

public class MichelinTire extends Tire {
	public MichelinTire(String location, int maxRotation) {
		super(maxRotation, location);
	}
	
		@Override
		public boolean roll () {
			++accumulatedRotation; //++이 먼저
			if(accumulatedRotation<maxRotation) {
				System.out.println(location + "MichelinTire 수명 : " + (maxRotation-accumulatedRotation)+"회");
				return true;
			} else {
				System.out.println(" ***** "+location+ "MichelinTire 펑크 ***** ");
			} return false;
		}
		
	}
