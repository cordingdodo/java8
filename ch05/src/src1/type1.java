package src1;

public class type1 {

	public static void main(String[] args) {
		// primitive type 기본형 : 하나의 저장소(변수)에 하나의 데이터만 저장 p.138
		//반드시 사용시 초기화해야함
		//단일 기억장소
		//스택은 LIFO 구조의 기억장소로 가장 마지막에 입력된 데이터가 가장 먼저 출력될 수 있다. 입구와 출구가 같음
		//큐(queue)는  FIFO 구조의 기억장소는 순서대로 입력되고 출력되므로 가장 처음에 입력된 것이 가장 먼저 출력된다 (입출구 다름)
		
		boolean a=true;
		byte b=120;
		char c='a';
		short d=150;
		int e=150;
		float g;
		long f;
		double h;
	
		System.out.println(a);
		//System.out.println(e); //변수 e는 초기화 되어있지 않아서 사용x
		System.out.println(d==e);
		System.out.println(d!=e);
		//기본형 변수는 타입이 달라도 값을 직접 비교한다

	}

}
