package sec4;

public abstract class Student { //p.320
	String schoolname;
	String bun;
	String name;
	int jum1;
	int jum2;
	int jum3;

	//추상화는 메서드 가지고만 한다 //밑은 추상화된 메서드:abstract 가 기술되어 있는 메서드로서  반환타입, 메서드명, 매개변수 등만 기술되어야하며, 구현 내용은 넣으면 안 댐!!!
	//구현내용은 기술하지 않고, 상속 받는 서브 클래스에서 반드시 구현내용을 기술해야함 -> 왜? 미리 정해져버리면 상속자 입장에서는 제한적이게 됨
	abstract int computeTot(int jum1, int jum2, int jum3); //추상화 : 선언만 함 //abstract 반환타입 메소드 이름 (메개변수) : 매개변수 갯수가 맞아야함
	abstract double computeAvg(int jum1, int jum2, int jum3);
	//추상화 안 할 거면 //일반 멤버 메서드
	public String computeHak (int jum1, int jum2, int jum3){int tot=jum1+jum2+jum3;
		if(tot/3>=90){
			return "A";
		} else if (tot/3>=80){
			return "B";
		} else if (tot/3>=70){
			return "C";
		} else if (tot/3>=60){
			return "D";
		} else {
			return "F";
	}
		}
	
}
	
		
