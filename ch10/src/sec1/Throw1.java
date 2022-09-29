package sec1;
//throw는 예외 떠넘기기  
public class Throw1 { 
	public static void main(String[] args) {
		String name = null;
		nullPassing(name);
		
		int[] arr = new int[3];
		arrayPassing(arr);
		
		String data = "kim1004";
		try {
		int val1 = Integer.parseInt(data);
		System.out.println(val1);
		} catch(Exception e){ 
		e.printStackTrace();
		}
	}
		//특성 메서드로 뽑은 경우는 throws로
	static void arrayPassing(int[] arr) throws NullPointerException, ArrayIndexOutOfBoundsException  {//모를땐 아무거나 넣어봄
		for(int i=0;i<5;i++){
			arr[i] = i*10;
			
		}
		
	}
	static void nullPassing(String data) throws NullPointerException{
		System.out.println(data); //null값 출력된다는 게 에러임..ㅋㅋ
	}

}
