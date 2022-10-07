package sec2;

import java.util.LinkedList;
import java.util.List;
import sec1.Student;

public class ListEx4 {
	public static void main(String[] args) {
		List<Student> sList = new LinkedList<Student>();
		
		Student s1 = new Student();
		//sList.add(new Student()); //1, "김도얀, 100" 이렇게 바로 집어넣을 수가 없듬
		s1.setNum(1);
		s1.setName("김도얀");
		s1.setJum(100);
		sList.add(s1);
		
		Student s2 = new Student();
		s2.setNum(2);
		s2.setName("박주앙몬드");
		s2.setJum(30);
		sList.add(s2);
		
		System.out.println("번호\t이름\t점수");
		for(int i=0;i<sList.size();i++){
			Student s = new Student();
			s = sList.get(i);
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getJum());
		}

		
	}

}
