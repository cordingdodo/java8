package src4;

import java.util.Scanner;

public class dodo {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner (System.in);
		System.out.print(" 월을 입력하세요 (1~12): >");
		int month = scanner.nextInt();
		
		if(month>=3&&month<=5){
			System.out.println(+month+ "는 봄입니다.");
		} else if(month>=6&&month<=8){
			System.out.println(+month+ "는 여름입니다.");
		} else if(month>=9&&month<=11){
			System.out.println(+month+ "는 가을입니다.");
		} else if(month==12&&month<=2){
			System.out.println(+month+ "는 겨울입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}

	


				
//		switch(month){
//		case 1: case 12: case 2:
//			System.out.println(+month+"은 겨울입니다.");
//		break;
//		case 3: case 4: case 5:
//			System.out.println(+month+ "은 봄입니다.");
//		break;
//		case 6: case 7: case 8:
//			System.out.println(+month+ "은 여름입니다.");
//		break;
//		case 9: case 10: case 11:
//			System.out.println(+month+ "은 가을입니다.");
//		break;
//		
//		default:
//			System.out.println(+month+ "은 잘못된 월입니다.");
//			break;
//		}
		

	}


	


