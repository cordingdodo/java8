package ch002;
//변수(Variable): 컴퓨터는 직업에 필요한 데이터를 메모리에 저장하게 되는데 개발자가 프로그램을 처리하기 위해 
//필요한 데이터를 중간 중간에 메모리에 저장해야 한다. 그러나 그 위치를 모르면, 저장된 값을 가져
//갈 수 없으므로,자료의 저장 위치를 나타내는이름이 필요하한데, 그것을 변수명이라고 한다

public class Var01 {

	public static void main(String[] args) {
		//변수 선언: 기억장소를 선언하는 것으로 변수명과 자료형이 같이 정의되어야 한다
		int a=10, b=20, c; //정수형 변수
		char d='a' ; //문자 변수 (작은 따옴표, 한개만 가능)
		String f="dodo",  k; //문자열 변수(큰따옴표, 하나는안됨)
		float h=3.14f, i=0.25f;//실수형 변수 =소수점,숫자 끝에f 붙여야함)
		int kor, eng, mat;
		
		//변수명 규칙
		/*필수조건
		 * 예악어(Reserved word)와 키워드는 변수명으로 사용할 수 없다.
		 * 첫번째 글자는 반드시 문자로 시작하거나 $ 또는 _ 로 시작해야만 한다.
		 * 영문 대문자와 소문자로 된 변수명은 서로 다르게 인식된다.
		 * 변수명 중간에는 $,_제외한 특수문자와 공백이 올 수 없다.
		 * 
		 * 관례
		 * 상수인 경우는 일반적으로 모두 대문자로 지정한다.
		 * 여러 단어를 합성한 변수명은 첫 번째 단어 모두 소문자로 하고,다른 단어가 두번째로 오면 첫번째 글자대문자 
		 * -> 카멜방식 ex)firstName/classEngPoint
		 * 여러 단어를 합성한 변수명은 단어 사이 사이에 _(언더스코어)로연결한다.
		 * -> 언더스코어 방식 ex)classEngPoint->class_eng_point  
		 * 누구나 저장된 데이터나 역할이 유추할 수 있도록 이름을 지정한다.
		 * 
		 */
	}
}
