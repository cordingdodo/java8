package se02;

public class Student {
	String name;
	int kor;
	int eng;
	int mat;
	int calctot;
	int calcAvg;
	int calcHak;
	int calcRes;
			
	public Student () {}
	public Student (String name) {this.name = name;}
	public Student (String name, int kor, int eng, int mat) {
		this(name, kor, eng, mat);}
	
	
	public Student (String name, int kor, int eng, int mat){
					this.name=name; this.kor=kor;
					this.eng=eng; this.mat=mat;
					
					
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
	
	

}
