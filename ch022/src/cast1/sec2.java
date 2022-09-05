package cast1;

public class sec2 {
	public static void man(String[] args) {
		int a=100, b=23, c; //정수
		float d, e, f; //실수
		c = a / b;    //4  --> 자동 형 변환
		System.out.println("c="+c);
		d = (float) a / b;       //4.0 -> 자동 형 변환
		System.out.println("d="+d);
		e = 500 / 3.0f ; // 형 변환 연산 3 -> 3.0f로 변환 연산
		System.out.println("e="+e);
		System.out.println("byte : "+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE); // 정수  표현 : 고정 소수점수 / 피스 포인트 넘버
		System.out.println("short : "+Short.MIN_VALUE+"~"+Short.MAX_VALUE); // 부동 소수점수 = 프로팅 포인트 넘버 
		System.out.println("int : "+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println("long : "+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		System.out.println("float :"+Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		System.out.println("double : "+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		
		byte byteValue = 10;
		float floatValue = 2.5F;
		Double doubleValue = 2.5;
		
		byte result = byteValue + byteValue;
		int result = 5 + byteValue;
		float result = 5 + floatValue;
		double result = 5 + doubleValue;
		
		
	}
}
