package src1;

public class type3 {

	public static void main(String[] args) {
		String name = "kim"; //참조형이지만 완벽한 참조형이 아님
		char[] irum =  {'k', 'i', 'm'};
		String nick = "kim"; //문자열 변수
		String lans = new String("kim"); //문자열 객체
		System.out.println(name);
		System.out.println(irum);
		//System.out.println(name==irum); -서로 비교대상이 아님!
		System.out.println(name==nick);
		System.out.println(name!=nick);
		System.out.println();
		System.out.println(name==lans); //같지 않음
		System.out.println(name!=lans);
		System.out.println();
		System.out.println(name.equals(lans)); //같음
		System.out.println(!name.equals(lans) );
		
		System.out.println();
		String k = new String();
		System.out.println(k=="");
		System.out.println("---------------------");
		System.out.println(k.isEmpty());
		
	}
	

}
