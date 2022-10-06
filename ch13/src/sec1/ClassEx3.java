package sec1;
//메소드의 매개변수나 리턴 타입일 일번화(변동화)하는 제네릭 메소드 클래스 //String, Integer인데 Integer,Integer 쓰고 싶다!
//<T,R> R method (T t)
public class ClassEx3 {
	public static void main(String[] args) {
	Box<Integer> box1 = Util.<Integer>boxing(100); //첫번째 방법 //뒤에 박싱->리턴타입임 //100 들어간 것->매개변수 타입
	//매개변수 / 매개변수 모두 Integer
	Box<String> box0 = Util.<String>boxing("김도연");
	int inVlaue = box1.get();
	System.out.println(inVlaue);
	String strValue0 = box0.get();
	System.out.println(strValue0); //매개변수와 리턴타입 내맘대로 정할 수 있다
	Box<String> box2 = Util.boxing("김도도"); //두번째 방법 //until 뒤에 <string> 생략 동일할때만 가능
	String strValue = box2.get();
	
	
	}
	
}
class Util {
	public static <T> Box<T> boxing(T t) { //리턴타입 범용화 //순서 리턴타입(제네릭)클래스이름 메소드(자유) 매개변수(제네릭)
		Box<T> box = new Box<T>();
		box.set(t);
		return box;		
	}
}
class Box<T>{ //리턴타입 클래스 범용화 //Box<Integer> 실행 -> 이 클래스가 실행
	private T t;
	public T get() {return t;}
	public void set(T t) {this.t =t;}
}