package se02;

public class StudentEX {

	public static void main(String[] args) {
		Student St1 = new Student ("김기태", 90,80,90);
		System.out.println("이름\t 총점\t 평균\t 학점\t 판정\t ");
		System.out.println(St1.name+"\t"+St1.calcTot()
				+"/t"+St1.calcAvg()+"\t"+St1.calcHak()
				+"\t"+St1.calcRes());
		
		

	}

}
