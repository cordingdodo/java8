package sec1;
public class TryCatFinallyExample {
	public static void main(String[] args) {
		String[] strArray = { "10", "2a"};
		int value=0;
		for(int i=0; i<=2; i++){
			try{
				value = Integer.parseInt(strArray[i]);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("인덱스를  초과했음");
			e.printStackTrace(); //원인까지 출력
			e.getMessage(); //웹에서 메세지만 볼 수 잇음
			break;
		} catch(NumberFormatException e){
			System.out.println("숫자 형식 데이터로 처리되지 못했음");
			break;
		} finally {
			System.out.println(value);
		}
	}
		
	}
		}

	


