package src1;

import java.util.Calendar;

public class Ref2 {

	public static void main(String[] args) {
		Week today = null; //today가 열거형임
		
		Calendar cal = Calendar.getInstance();
		int w = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(w); //1-7 6은 금요일~ (일-토)
		System.out.println();
		switch(w){
			case 1: 
				today = Week.SUNDAY;
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUESDAY;
				break;
			case 4:
				today = Week.WEDNESDAY;
				break;
			case 5:
				today = Week.THURSDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SATURDAY;
				break;
		}
		System.out.println("오늘의 요일은 " +today);
		System.out.println("name :" +today.name());
		System.out.println("original : " +today.ordinal()); //0~6
		Week day1 = Week.SATURDAY;
		System.out.println("요일 비교:" +today.compareTo(day1));
	}

}
