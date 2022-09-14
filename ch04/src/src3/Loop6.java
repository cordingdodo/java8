package src3;

public class Loop6 {

	public static void main(String[] args) {
		// 간격/건너뛰기
		int tot=0;
		for(int i=0;i<=100;i++){ //101번 실행됨
			if(i%2==1) continue; //i 나누기 2 했을때 나머지 1이 나오면->홀수면 끝남
			tot=+i; 	//50번 연산
		}
		System.out.println("0~50 짝수의 합계 :" +tot);
		tot=0;
		//i+=2  == i=i+2
		for(int i=0;i<=100;i+=2){
			tot+=i;
		}
		System.out.println("0~100 짝수의 합계2 :"+tot);
		tot=0;
		for (int i=1;i<=100;i+=2){
			tot+=i;
		}
		System.out.println("0~100 홀수의 합계: "+tot);
		tot=0;
		int n=1;
		for(;;){
			if(n>100) break;
			tot+=n;
			n+=2;
		}
		System.out.println("0~100 홀수의 합계2:" +tot);

	}

}
