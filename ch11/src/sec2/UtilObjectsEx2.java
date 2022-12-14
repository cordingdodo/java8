package sec2;
import java.util.Objects;
public class UtilObjectsEx2 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "김도연");
		Student s2 = new Student(2, "박주언");
		Student s3 = new Student(3, "박채령");
		Student s4 = s1; //얕은 복제 = 같은 메모리를 공유
		System.out.println(s1); //16진수 /얘는 오브젝트 / lang 패키지에 있는 것
		System.out.println(s4); 
		System.out.println(s1.hashCode()); //10진수 /얘는 오브젝트
		System.out.println(Objects.hashCode(s1)); //still 패키지에 있는 오브젝츠!!! ->임포트 해줘야함
		System.out.println(s4.hashCode());
		System.out.println(s1.sname);
		System.out.println(s4.sname);
		s1.sname="김주언"; //s1이 바뀌어도 s4도 바뀜
		System.out.println(s4.sname);
		s4.sname="박주주";
		System.out.println(s1.sname);
		
		Student s5 = new Student(s1.sno, s1.sname); //깊은 복제 / 서로 다른 메모리  /주소가 바뀜
		System.out.println(s1);
		System.out.println(s5);
	}
}