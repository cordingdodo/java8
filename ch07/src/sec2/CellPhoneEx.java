package sec2;

public class CellPhoneEx {
	public static void main(String[] args) {
		CellPhone p1 = new CellPhone();
		CellPhone p2 = new DmbPhone();
		//DmbPhone p3 = new CellPhone(); // 자식은 아량이 넓지 않아서 부모꺼 못불러옴 ㅎ
		DmbPhone p4 = new DmbPhone();
		System.out.println(p1.COMPANY);
		System.out.println(p2.COMPANY);
		System.out.println(p4.COMPANY);
		p1.powerOn();
		p2.powerOn();
		p4.powerOn();
		System.out.println("---------------");
		p1.powerOn();
		p1.bell();
		p1.hangIn();
		p1.sendVocie("여보세요~!");
		p1.recieveVocie("저 도연이라고 하는데요! 주주 있어요?");
		p1.hangOut();
		p1.powerOff();
		
	}

}
