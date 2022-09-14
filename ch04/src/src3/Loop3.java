package src3;

public class Loop3 {

	public static void main(String[] args) {
/* 		반복변수=초기값 1
 * 		do {
 * 		실행문장 : 2
 * 		증감식; 3
 * 	}	while(조건식); 4
 * 1->2->3->4 실행되다가(무조건 한 번은 함) 조건이 만족하는 동안 2->3->4 반복수행
 * 그러므로 실행부터 하고, 조건을 나중에 비교함 최소 한 번은 무조건 실행함 
 */
	int a=10, tot=0;
	do {
		tot=tot+a;
		a++;
	} while (a<10);
	System.out.println("a="+a+", tot="+tot);
	
	}

}
