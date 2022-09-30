package ch11;
//https://docs.oracle.com/javase/8/docs/api/
public class Api1 {
	public static void main(String[] args) {
		//java.lang
		/* object: 자바에서 최상위 클래스
		 System : 기본 입출력 시스템 (키보드 입력, 모니터 출력), JVM 동작 제어
		 Class : 클래스 개념과 클래스 구성요소로 메모리로 로딩
		 String : 문자열 다루기 위한 클래스
		 StringBuffer/StringBuilder : 문자열 조작 (분리/합치기) 클래스
		 Math : 수학/삼각을 위한 처리 클래스
		 Wrapper : Character, Byte, Short,Integer,Long,Float,Double,Boolean 8개  /감싸주는것 /대문자로 시작됨
		 			Primitive type은 메서드를 가질 수 없으므로
		 			Wrapper type의 메서드를 활용해야 함
		 			static이기 때문에 인스턴트 변수 만들지 않고 클래스타입 바로 불러옴
		 */
		int a=1004; //Primitive type
		Integer b = new Integer(1004); //Wrapper type
		int a1=b; //Wrapper type -> Primitive type 데이터로 바뀜 이걸 !언박싱!이라고 함!!
		Integer b1 = a; //Primitive type -> Wrapper type !박싱!
		
		String ab = "1004";
		//abc.parseInt();
		int data = Integer.parseInt(ab);
		System.out.println(data); //정수만 나옴
		
		String abc = "1004.1234";
		float data2 = Float.parseFloat(abc);
		System.out.println(data2);
		
		byte c = 66;
		Byte d = 66;
		
		short e = 1000;
		Short f = 1000;
		
		//char <-> Character
		//float <-> Float
		//double <-> Double
		//long <-> Long
		//bool <-> Boolean
		
	}

}
