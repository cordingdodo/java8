package sec3;
import java.util.Properties;
import java.util.Set;
public class SystemEx4 { //컴퓨터 정보 알기
	public static void main(String[] args) {
		System.out.println("운영체제: " +System.getProperty("os.name"));
		System.out.println("사용자: " +System.getProperty("user.name"));
		System.out.println("사용자 디렉토리: " +System.getProperty("user.home"));
		System.out.println("자바 버전: " +System.getProperty("java.version"));
		System.out.println("자바홈: " +System.getProperty("java.home"));

		Properties props = System.getProperties();//해당 항목(키)를 뽑아 저장
		Set keys = props.keySet(); //항목들을 집합으로 별로돌 저장함 (""안에 있는 게 key)
		for(Object objKey : keys){ //keys값대로 objkey가 변함 500번->500번변화
			String key = (String) objKey;
			String value = System.getProperty(key); //os.name "" 안에 있는 것
			System.out.println("["+key+"]: "+value);
		}
		System.out.println("환경변수 JAVA_HOME : "+System.getenv("JAVA_HOME"));
		
		
	}
	

}
