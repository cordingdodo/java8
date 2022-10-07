package sec1;
//학생 리스트 선언
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ListEx2 {
	static List<Student> sList = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean ck = true;
		int i = 0; 
		while(ck){ 
		//작업번호 :
			System.out.println(" 1. 학생 추가, 2. 학생 검색, 3. 학생 수정, 4. 학생 삭제, 5.명단 뽑기");
			System.out.println("작업 번호를 입력하세요 >");
			int num = sc.nextInt();
			Student s = new Student();
			switch(num){
				case 1:
					s.setNum(i);
					System.out.println("\n학생 이름: ");
					s.setName(sc.next());
					System.out.println("\n 학생 점수: ");
					s.setJum(sc.nextInt());
					insert(s);
					break;
				case 2:
					System.out.println("검색할 학생  번호를 입력하세요 : ");
					int bun = sc.nextInt();
					s = select(bun);
					System.out.println("학생 번호 : "+s.getNum());
					System.out.println("학생 이름 : "+s.getName());
					System.out.println("학생 점수 : "+s.getJum());
					break;
				case 3:
					System.out.println("수정할 학생 번호를 입력하세요 : ");
					int bun2 = sc.nextInt();
					s.setNum(bun2);
					System.out.println("학생 번호 : "+s.getJum());
					System.out.println("학생 이름: "+s.getName());
					System.out.println("학생 점수: "+s.getJum());
					System.out.println("수정이 완료되었습니다.");
					update(s);
					break;
				case 4:
					System.out.println("삭제할 학생 번호를 입력하세요: ");
					int bun3 = sc.nextInt();
					s.setNum(bun3);
					delete(s);
					System.out.println("삭제가 완료되었습니다.");
					break;
				case 5:
					System.out.println("학생 명단\n번호\t이름\t점수");
					for(int a=0;a<sList.size();i++){
						Student r = new Student();
						r = sList.get(a);
						int co1 = r.getNum();
						String co2 = r.getName();
						int co3 = r.getJum();
						System.out.println(co1+"\t"+co2+"\t"+co3);
					}
					break;					
				default:
					ck=true;
			}
			i++;
		}
	}
	static void insert (Student s){ //학생추가
		sList.add(s); //리스트 요소 추가
	} 	
	static Student select(int i){ //학생 검색
		Student s = new Student();
		s =sList.get(i);
		return s;
	}
	static void update(Student s) {//학생 수정
		Student t = new Student();
		//t = sList.get(s.getNum()); //인덱스 번호랑 똑같은 것
		t.setNum(s.getNum());
		t.setName(s.getName());
		t.setJum(s.getJum());
		sList.set(s.getNum(), t); //리스트의 요소값 변경
	}
	static void delete(Student s) {//학생 삭제
		sList.remove(s.getNum()); //리스트의 요소 제거
}

}
