package sec1;
//인터페이스는 완전 추상체이다.
public interface Interface1 {
	int MAX = 20; //상수는 대문자
	int MIN = 1;
	
	void method1 (); //일반 메서드는 선언만 가능 구현부 x
	int method2(int pa1, String pa2);
	static void method3(int pa1){//정적 메서드는 선언과 구현을 모두 해야 함
		System.out.println(pa1+"값을 전달받았습니다.");	}
	default int method4(String pa1){ //디폴트 메서드는 선언과 구현 모두 기술)
		return 1004;
	}
}
