package sec1;

//public : 현재 프로젝트 내에서 다른 패키지까지도 가능 = 어디서든 가능함
//default: 접근 제한자를 생략했을 경우임, 같은 패키지 내에서 접근 가능함!
//private : 해당 클래스 내에서만 사용 가능함

//인스턴스 = 객체 = 내용인듯?
public class Member {
	private String id; 	 	//클래스의 멤버의 필드(=속성) (filed)
	private String password;
	private String name;
	private String tel;
	private String address;
	private String reg_date;
	
	public Member() {} 
	//↑ 생성하지 않아도 묵시적으로 들어가있음! 자동적으로 만들어줌 기본 생성자임
	//기본 생성자(Constructor)로서 선언하지 않아도 자동으로 자바가 생성자를 묵시적으로 선언함
		
	//생성자(String a,String b)
	public String getId() {
		return id;
	}
	
	public Member(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public void setId(String id) { //괄호안 매개변수 //매개변수 아이디를  this=자기자신 
		this.id = id;
	}
	//메서드는 반환 반환이 붙음  (Method)
	//접근 제한자 반환타입 메서드명([매개변수타입 매게변수명,...]) { 	return 반환변수명 | 값 ; }
	//겁근제한자 coid 메서드명 ([매게변수타입 매게변수명,...]} {	실행문;	]
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	
	
}



