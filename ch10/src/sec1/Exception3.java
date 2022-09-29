package sec1;
//Syntax Error, Runtime Error 실행시 붉어져 나오는 에러를 줄 예외 사항 들은 미리 사전에 알아서 예외 처리 해야 함
public class Exception3 {
	public static void main(String[] args) {
		String data1 = "1004"; //문자 타입이기 때문에 숫자 형식으로 바꿀 수 없을 때 일어나는 에러
		String data2 = "kim1004";
		
		try {
		int val1 = Integer.parseInt(data1); //1004가 되어야 함
		int val2 = Integer.parseInt(data2); //kim1004 -> 오류발생 -> 예외처리 해야함 ->

		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val1+20);
	} 	catch(NumberFormatException e){
		System.out.println("숫자 형식 데이터로 처리되지 못했음");
		e.printStackTrace();
	}	catch(Exception e){
		System.out.println("알 수 없는 예외");
		
	} 	finally {
	System.out.println("종료");
	}
	
}

}