package sec2;

class A {} //슈퍼슈퍼클래스임~! 그래서 후손들 다 가능
class B extends A {}
class C extends A {}
//b랑 c는 형제임 
class D extends B {}
class E extends C {}

public class PromotionEx {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b; //부모는 다 받기 가능
		A a2 = c; 
		A a3 = d;
		A a4 = e;
		
		B b1 = b;
//		B b2= c; //형제 관계라 못 받음
		B b3 = d; //B가 D의 슈퍼클래스라 ㄱㅊ
//		B b4 = e; //조카라서 못 받음 (c에서 파생)
		
		//그러므로 부모자식관계 상에서만 객체를 생성하거나 형변환이 가능함
		//형제관계나 자식부모 관계 상에서는 자동 캐스팅 할 수 없다.
		//형제관계는 강제 캐스팅도 자동캐스팅도 모두 될 수 없다.
		
	}

}
