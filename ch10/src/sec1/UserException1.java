package sec1;
//UserException 사용
public class UserException1 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (RunException e){
			//e.printStackTrace();
		}
	}
	public static void method1() throws RunException { 
		throw new RunException("사용자 예외"); //throw 예외 발생시 객체 생성 = 자동 예외 발생
		
	}

}
