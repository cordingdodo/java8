package src4;

public class homework4 {

	public static void main(String[] args) {
//랜덤수 : 아무 수 임의의 수
		int a=0, b=0;
		while(a+b!=5){
			a = (int)(Math.random()*6)+1; //1~6 까지의 아무 수
			b = (int)(Math.random()*6)+1; 
			System.out.println("(" +a+ "," +b+")");

	}

	}
}
