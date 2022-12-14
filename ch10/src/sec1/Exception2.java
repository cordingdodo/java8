package sec1;
public class Exception2 {
	public static void main(String[] args) {
		int[] arr = new int [3];
		int i=0;
		while(i<=3){
			try{
			arr[i] = i*10-5; //임의의 값을 넣음
			i++;  //문법적으로 이상이 없음 runtime 에러 //문법적으로 이상이 있는 에러 -빨간색 에러
			System.out.println(arr[i]);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배정된 배열의 요소 수보다 더 많은 데이터를 요구하였음");
			e.printStackTrace(); //원인까지 출력
			e.getMessage(); //웹에서 메세지만 볼 수 잇음
			break;
		} catch(Exception e){
			System.out.println("원인 불명의 예외 발생");
			e.printStackTrace();
			break;
		} finally {
			System.out.println("종료");
		}
	}
		
	}
		}