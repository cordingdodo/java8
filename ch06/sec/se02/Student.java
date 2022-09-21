package se02;

public class Student {
	String name;
	int kor;
	int eng;
	int mat;
			
	public Student () {}
	public Student (String name) {this.name = name;}	
	public Student(String name, int kor, int eng, int mat) { //소스콘스트럭쳐
		this.name = name; this.kor = kor; this.eng = eng; this.mat = mat;
	}
					
	public int calcTot () {
		return kor+eng+mat;
	}
	public double calcAvg(){
		double avg = (float) Math.round((kor+eng+mat)/3*100)/100; 
		return avg;
	}
	public String calcHak() {
		String hak = ""; //hak 초기화
		double avg=this.calcAvg();
		if(avg>=90) {
			hak="A";
		} else if(avg>=80){
			hak="B";
		} else if(avg>=70){
			hak="C";
		} else {
			hak="D";
		}
		return hak;
		
	}
	public String calcRes() {
		double avg=this.calcAvg();
		String res="불합격";
		if(avg>=80) {
			res="합격";
		}
		return res;
		
	}
	
}



