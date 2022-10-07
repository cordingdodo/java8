package sec3;
//한 건의 데이터를 항목 이름의 중복없이 항목 이름과 해당 값을 가져올때 사용함
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, String> map2 = new Hashtable<>();
		Map<String, Integer> map3 = new TreeMap<>();
		Properties map4 = new Properties();

		//해당 키와 값만 전송
		map1.put("num", 1);
		map1.put("kor", 100);
		map1.put("eng", 99);
		map1.put("mat", 95);
		map1.put("mat", 95); //중복되면 값 하나만 인식
		System.out.println(map1);
		System.out.println(map1.get("num")); 
		if(map1.containsKey("his")){
			System.out.println("해당 키가 존재");
		}
		if(map1.containsValue(100))
			System.out.println("해당 값이 존재합니다");
		
		map2.put("name", "kim");
		map2.put("height", "185");
		map2.put("weight", "10");
		System.out.println(map2);
		System.out.println(Integer.parseInt(map2.get("height")));
		map2.remove("height");
		System.out.println(map2.get("weight")); 
		
		map3.put("num", 10);
		map3.put("kor", 80);
		map3.put("eng", 90);
		map3.put("mat", 65);
		map3.put("mat", 75); 
		System.out.println(map3);
		System.out.println("국어 점수는: " +map3.get("kor"));
		
		System.out.println("*********Properties***********");
		//Properties는 항목 이름과 값으로 지정함
		map4.setProperty("name", "kim");
		//map4.setProperty("kor", 10); //int는 올 수 없고 String/String만
		map4.setProperty("kor", "80");
		map4.setProperty("eng", "90");
		System.out.println(map4);
		System.out.println("이름: "+map4.getProperty("name"));
		
		
	}

}
