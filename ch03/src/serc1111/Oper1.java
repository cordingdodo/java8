package serc1111;
//프로그램의 모든 명령은 op-code(연산자) 와 operland (피연산자) 로 이루어짐
//주소 (기억장소의 개수)에 따라 0주소 명렁어부터 3주소 명령어 형식
//입력함에 따라 단항(unary) 연산과 이항(binay) 연산으로 분류됨
//연산의 종류에 따라 산술, 논리, 비교, 증감, 비트, 대입 연산 등이 있음

//a = a + b;
//+ : 연산 (명령) -> Op-code
//a, b  -> operland

//boolean a ture;
//boolean b=!a;
//int c=!a;





public class Oper1 {

	public static void main(String[] args) {
		int a= 20, b=30, c; //대입연산 
		System.out.println(a);
		//prt();
		c = a+ b;
		//운용방식 1 : +ab -> pre(fix) order (전위)
		//운용방식 2 : ab+ -> post(fix) order (후위)
		//운용방식 3 : a+b -> in(fix) order (중위)
		
	}

}
