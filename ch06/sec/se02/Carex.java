package se02;

public class Carex { //여기서 인스턴스가 car1


	public static void main(String[] args) {
		Car car1 = new Car("롤스로이스", "가솔린", 4000);
		car1.bootUP(); //시동켬
		car1.speedUp();//스피드 높여
		car1.speedUp();//스피드 또높여
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		System.out.println("현재 속도: " +car1.speedInfo());
		car1.speedPrint(); //위아래 똑같음 근데 밑에거가 더 간결하고 쉬움
		car1.speedDown();
		car1.speedDown();
		car1.speedDown();
		System.out.println("현재 속도: " +car1.speedInfo());
		car1.speedPrint(); //귀차나서 for문으로 돌린다면
		for(int i=0;i<100;i++){
			car1.speedDown();

		}
		System.out.println("현재 속도: "+car1.speedInfo());
		car1.bootOff();
		System.out.println("최고 속도:" +Car.MAX_SPEED); //static 타입은 sysout해서 불러올때 클래스 이름을 써야함
		System.out.println("최저 속도:" +Car.MIN_SPEED); 
		
		Car[] car; //차 많이 만들 거야~ 여러대 만들 수 있음 -> 가능 car라는 배열이 되는 것임
		
	}

}