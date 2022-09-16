package src1;

public class type2 {

	public static void main(String[] args) {
		//refernce(참조형)type : 여러개의(다수)의 데이터를 저장하기 위한 기억장소로서 null값 허용
		//참조형의 종류 : array(배열형), enum(열거형), class(클래스), interface(인터페이스), map(맵), list(리스트), set(셋) ...
		int[] arr1 = {10,20,30};
		int[] arr2 = {10,20,30};
//		int[] arr3 = null; (x)
//		int[] arr3 = {null, null}; (x)
		
		//refernce type 참조형 타입은 null값을 허용하지만 
//		pointer(히프영역의 주소)가 null이 되어 참조 할 수 없는 예외가 발생함!! 
		
//		int a = null; 
		//int a = null; - 기본형 primitive type은 null값일 수 없다.
//		arr3[0] = 20;
//		System.out.println(arr3[0]); 왜냐? 위에 null 해놔서 그럼
//		System.out.println(arr3[1]);
		System.out.println(arr1);
		System.out.println(arr2);
		//참조형은 간접비교를 함으로 직접 비교하게 되면, 포인터주소를 비교하게 되므로 서로 다르게 인식함
	}

}
