package sec4;
public class Member {
	String name;
	int age;
	private String id;
	
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
	//학생 (Student
	@Override
	public String toString() {
		return super.toString();
		//return id +": " + name;
	}
	
}
