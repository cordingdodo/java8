package sec1;

public class Member2 {

	public static void main(String[] args) {
		//클래스명 인스턴스명 = new 생성자함수();
		//출력된것이 보이는것이라  view
		Member mem1 = new Member();
		mem1.setId("dodo");
		mem1.setPassword("1234");
		mem1.setTel("010-1111-2222");
		System.out.println("아이디: "+mem1.getId());
		System.out.println("비밀번호: "+mem1.getPassword());
		System.out.println("전화번호:" +mem1.getTel());
		System.out.println("*****************");
		System.out.println();
		
		Member mem2 = new Member();
		mem2.setId("jojo");
		mem2.setPassword("jojobabo");
		mem2.setTel("010-7777-1017");
		System.out.println("아이디 : "+mem2.getId());
		System.out.println("비밀번호: "+mem2.getPassword());
		System.out.println("전화번호:" +mem2.getTel());
		
		System.out.println();
		System.out.println("*****************");
		Member mem3 = new Member("이게되나", "되나요?", "안 되는 듯한데");
		System.out.println("아이디: "+mem3.getId());
		System.out.println("비밀번호:"+mem3.getPassword());
		System.out.println("이름:" +mem3.getName());
		
		Member mem4 = new Member();
		System.out.println("되나?" +mem4);
		
		
		MemberController mc = new MemberController();
		mc.join("kdy", "1004", "도도");
		mc.info();
		mc.login("kdy", "1004");
		mc.info();
		
		mc.login("null", "null")
		;
		
	}

}
