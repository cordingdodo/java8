package src4;

public class sec4 {

	public static void main(String[] args) {
		//예쩨3 for문 사용해서 1부터 100까지의 정수 3의 배수를 구하는 총합 코드 만들기
		int tot=0;
		for(int i=0;i<=100;i+=3) { //3의 배수 //for(int i=0;1<=100;i+=3
			tot+=i; //배수 합
		}
		System.out.println("3의 배수의 합:" +tot);

		int res=0;
		int i=0;
		while(i<=100){
			res+=i;
			i+=3;

			
		}
		System.out.println("3의 배수의 합계 2 :"+res);
		
		res=0;
		for(int a=0;a<=100;a++){
			if(a%3==0) res+=a;
		}
		System.out.println("3의 배수의 합계 3 : "+res);
		
		res=0;
		for(int a=0;a<=100;a++){
			if(a%3==0) res+=a;
		}
		System.out.println("3의 배수의 합계 4:" +res);
	}

}
