package sec4;

import java.util.StringTokenizer;

public class StringEx2 {
	public static void main(String[] args) {
		String names = "김도연&박주언,박주앙몬드,김도죠르디,안도연-박주주";
		
		//문자열을 배열 요소로 형변환
		String[] name = names.split("&|,|-");
		
//		for(int i=0;i<name.length;i++){
//			System.out.println(name[i]);
//		}
		for(String irum : name){
			System.out.println(irum);
		}
		//Token : 구분자 or 사용권
		String nick = "김도연/박주언/박주주/김도욘";
		StringTokenizer irums = new StringTokenizer(nick, "/");
		int cntToken = irums.countTokens();
		for(int i=0;i<cntToken;i++){
			String token = irums.nextToken();
			System.out.println(token);
			
			
		}

	}

}
