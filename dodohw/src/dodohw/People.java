package dodohw;

public class People {

	String name;
	int age;
	boolean isMarried;
	int childern;
	
	public People () {}
	public People (String name) {this.name=name;}
	public People (String name, int age) {this.name=name; this.age=age;}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public int getChildern() {
		return childern;
	}
	public void setChildern(int childern) {
		this.childern = childern;
	}
	
	public void peopleInfo () {
		
		System.out.println("나이: "+age);
		System.out.println("이름: "+name);
		System.out.println("결혼 여부: "+isMarried);
		System.out.println("자녀 수: "+childern);
		
		
	
	
	
	

	}




}



