package sec2;

public class Student {
	public int sno; 
	public String sname;
	public Student() {}
	public Student(int sno) {this.sno=sno;}
	public Student(int sno, String sname){
		this.sno = sno;
		this.sname =sname;
		System.out.println("생성");
	}
	public void finalize(){
		System.out.println("소멸");
	}
}
