package src2;

import java.util.Scanner;

public class Condition2 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("성명 : ");
//		String name = sc.next();
//		System.out.println("점수 : ");
//		int jum = sc.nextInt();
//		
//		String pan="";
//		if(jum>=90) {
//			pan="A";
//		} else if(jum>=80) { //90미만이라는 말 숨어있음 89~80
//			pan="B";
//		} else if(jum>=70) { //79~70 라는 말 숨어있음 
//			pan="C";
//		} else if(jum>=60) { //69~60
//			pan="D";
//		} else { //60미만
//			pan="F";
//		}
//		System.out.println("당신의 이름은 "+name+"이며, 점수는"+jum+"이고, 학점은"+pan+"입니다.");		
//		sc.close();
//		}	
//	

//if (조건식 1) {
//		조건식1이 만족할때 실행할 문장;
//} else if(조건식2) {
//	조건식1이 만족하지 않으며, 조건식2가 만족할 때 실행할 문장
//} .....else  {
//	모든 조건이 만족하지 않을 경우 실행할 문장!



	Scanner sc = new Scanner(System.in);
	System.out.println("성명 : ");
	String name = sc.next();
	System.out.println("전산 점수 : ");
	int ep = sc.nextInt();
	System.out.println("PG 점수");
	int pg = sc.nextInt();
	System.out.println("DB 점수");
	int db = sc.nextInt();
	int tot = ep+pg+db;
	double avg = (float) tot/3;
	
	String pan="탈락";
	if(ep>=70 || pg>=70 || db>=70) pan="합격";
	System.out.println(pan);
	
	String des="없음";
	if(ep>=90 && pg>=90 && db>=90) des="과목우수";
	System.out.println(des);
	
	System.out.println(""+name+ "님의 총점은" +tot+ "이며, 평균은" +avg+ "이고, "+pan+"하셨으며, 비고는" +des+ "입니다"); 
	}
	
}
	
	
	
	