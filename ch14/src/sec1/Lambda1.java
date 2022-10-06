package sec1;
//functionalInterface 메소드를 기반으로 기능을 람다식으로 정의하여 활용  -> 1.인터페이스 선언 추상체를 구현함으로써 람다식 만들기
public class Lambda1 {
	//일반 메소드 정의
	public int method1(int x, int y){
		return x+y;
		//이걸 좀 더 쉽게 간단하게 표현할 수 없을까? 해서 나온 게 람다식
	}
	/*람다 구현 방식 정의
	(x, y) -> { x+y }; */
}
