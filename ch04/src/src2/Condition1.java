package src2;

import java.util.Scanner;

public class Condition1 {

	public static void main(String[] args) {
		System.out.print("점수 입력: ");
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt(); //여기서 short는 2바이트라 작아서 안됨
//		if (조건식) {
//			참일때 실행문; (여러문장일 수 있다)
//		} else {
//			거짓일때 실행문;
//		}
		
		if(num>=80) {
			System.out.println("합격"); //중괄호 블록 필요없음 but 한문장일때만!
		}	else { 
			System.out.println("불합격");
		}
		
		//명령문이 한 줄이면 {} (중괄호 블록) 생략 가능
		if(num<60) System.out.println("재평가");
		else System.out.println("과목이수");
		
		//else없이 진행하는 경우
		String str = "탈락";
		if(num>=80) str="합격"; //단순if
		System.out.println(str);
		
		//삼항 연산자
		String str2 = (num>=80) ? "합격" : "탈락";
		System.out.println(str2);
		
		sc.close();

		
		if(num>=80) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		sc.close();
	}

}
