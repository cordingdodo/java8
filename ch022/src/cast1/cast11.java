/**
 * 
 */
/**
 * @author 201-13
 *
 */
package cast1;

public class sec01 {
	public static void main(String[] args) {
		int a=1004, b; //4byte
		short c, d; //2byte
		long e, f; 
		b = a;
		//c = a; 안됨! > a는 int 이므로 short인 c 데이터에 전달안됨
		c = 500; //2byte고
		a = c; //a가 c보다 더 바이크수가 커서 가능 // short -> int => 자동 형 변화  (casting)
		d = (short) b;   // 형 변환 연산자에 의한 형 변환 (force casting)
		System.out.println("d="+d);
		System.out.println("b="+d);
	
		//b= e;이거 안됨
		/* e는 100 */
		e = b ;
		/* e는 65538 */
		f = a + c;
		a = (int) (f + c);


		
		
 }
		
}