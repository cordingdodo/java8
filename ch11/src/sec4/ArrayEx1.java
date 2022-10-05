package sec4;

import java.util.Arrays;

public class ArrayEx1 {
	public static void main(String[] args) {
	char[] arr= {'j', 'a', 'v','a', '　', 'o','b','j','e','c','t'};
	System.out.println(arr); 
		char[] arr2=Arrays.copyOf(arr, arr.length);//문자배열 전체 복사
		System.out.println(arr2);
		char[] arr3=Arrays.copyOfRange(arr, 0, 4); //일부만 잘라서 복사
		System.out.println(arr3);
		
		System.out.println("같은지 비교 : "+(arr==arr2)); //주소와 주소를 비교
		System.out.println("같은지 비교2 : "+Arrays.equals(arr, arr2)); //값을 비교
		//같은 기억장소를 의미하는 주소가 다를 경우, 서로 비교할 수 없다.
		//System.out.println("같은지 비교3 :"+Arrays.deepEquals(arr, arr2));//주소와 값 모두 비교
		
		int[] jum = {95, 100, 85, 90, 80};
		Arrays.sort(jum); //sort: 오름차순 정렬
		for(int pt : jum){
			System.out.println("점수: "+pt);
		}
		String[] name2 = {"박주주", "하정우", "전요환"};
		System.out.println("정렬 전 ");
		for(String name : name2){
			System.out.println("이름: "+name2);
		}
		Arrays.sort(name2);
		System.out.println("정렬 후 ");
		for(String name : name2){
			System.out.println("이름: "+name2);
		}
		int idx = Arrays.binarySearch(name2, "박주주");
		System.out.println("박주주는 몇 번째?"+idx);
		
	}
	
}
