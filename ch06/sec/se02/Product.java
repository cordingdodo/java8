package se02;

public class Product {
	private String pid;
//  접근제한자	수정자 데이터타입 필드명
	private String pname;
	private int amount;
	private int price;
	private String img;
	
	public Product () {}
	public Product (String pid, String pname) {this.pid=pid; this.pname=pname;}
	public Product(String pid, String pname, int amount, int price, String img) {
		this.pid = pid;
		this.pname = pname;
		this.amount = amount;
		this.price = price;
		this.img = img;
	} //->얘네는 객체 생성을 위한 것 매개변수 뭐 받을 거임? 이렇게 만들 수 있음 이뜻
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	public int calcMoney () {
		return amount*price;
	}
	
	public String calcRank () {
		String rank="";
		if(price>=100000){
			System.out.println("고가");
		}else if(price>50000) {
			System.out.println("중저가");
		}else rank="저가";
		return rank;
	}
		
	public void printImg (String img) {
		System.out.println("이미지: "+img);
	}
		
	
	public void printProduct () {
		System.out.println("제품 아이디: " +pid);
		System.out.println("제품명: " +pname);
		System.out.println("제품수: " +amount);
		System.out.println("제품 가격:" +price);
		System.out.println("제품 이미지: "+img);
		}
	
}




