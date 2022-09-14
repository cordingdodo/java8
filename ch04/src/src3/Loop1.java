package src3;

public class Loop1 {

	public static void main(String[] args) {
		
		int[] data = {90,80,70,65,75,95,85,60,90,95}; //알아서 10개가 됨 data[0]~data[9] 저장!
		int tot=0;

/*
		//      ①               ②                    ③
		//for(반복변수 선언 및 초기화;조건식;증감식){
			반복할 실행문;      ④
		}
		반복변수가 부여된 초기값으로 싲가하여 증감식에 따라 증감이 되다가 조건식이 만족하지 않으면 더이상 실행 안 함
	   1->2->4->3->2->4-> 실행하다가 3->2-> 조건 만족되는 동안만 수행
	   
	   
*/		
		for(int a=0;a<data.length;a++) {
			System.out.println(a+"번째 사람의 점수 :" +data[a]);
			tot=tot+data[a]; //누산 누적산수?
		}
		double avg = (float) tot / data.length;
		System.out.println("전체 총점 : " +tot+ ", 전체 평균 : "+avg);
		
	}

}
