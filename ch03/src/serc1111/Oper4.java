package serc1111;

public class Oper4 {

	public static void main(String[] args) {
		int a=200, b=100, c=20, d=10;
		//비교연산자 (==, !=, >, >=, <, <=) -> true or false 로 나오게 되어있음
		//== 같다(이다) != 같지 않다 (다르다) > 크다(초과==후) >=크거나 같다(이상==이후) <작다 (미만=전) <=작거나 같다 (이하==이전)
		System.out.println("a==b => "+(a==b)); //false
		System.out.println("a!=b => "+ (a!=b)); //ture 
		System.out.println("a>b => "+(a>b)); // true
		System.out.println("a>=b => "+(a>=b)); // true
		System.out.println("a<b => "+(a<b)); //false
		System.out.println("a<=b => "+ (a<=b)); //falase
		//System.out.println("a가 문자열  맞나? instanceof Integer => "+(a instanceof String)); //true
		
		//논리연산자 (이향 연산)
		// 입력1 		입력2			a>b	&& c>d			a>b || c>d
		//	0		0			0					0
		//	0		1			0					1
		//	1		0			0					1
		//	1		1			1					1
		
		
		//논리연산자 (단항 연산)
		// 입력 		!(a>b)
		//0			1
		//1			0
		// a>b && c>d 			a>b || c>d 
		System.out.println("a>b && c>d =>" +(a>b &&  c<d)); // false
		System.out.println("a<b || c<d =>" +(a>b || c<d)); // true
		System.out.println("!(a>b) => " +(!(a>b))); // false
		
		//논리연산자 (삼항 연산) -> 조건? 참일때식 ; 거짓일때식
		System.out.println(a>b ? "크거나 같다" : "작다"); //크거나 같다
	}

}
