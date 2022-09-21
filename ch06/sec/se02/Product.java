package se02;

public class Product {
	private String pid;
	private String pname;
	private int amount;
	private int price;
	private String img;
	
	public Product () {}
	public Product (String pid) {this.pid=pid;}
	public Product(String pid, String pname, int amount, int price, String img) {
		this.pid = pid;
		this.pname = pname;
		this.amount = amount;
		this.price = price;
		this.img = img;
	}
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
		int tot=amount*price;
		return tot;
		
	}
	
	public String calcRank () {
		String rank="저가";
		if(this.price>100000){
			System.out.println("고가");
		}else if(this.price>50000) {
			System.out.println("중저가");
		}
		return rank;
	}
		
	public void printImg (String img) {
		System.out.println(this.img);
	}
		
	
	public void printProduct () {
		System.out.println("제품 아이디: " +pid);
		System.out.println("제품명: " +pname);
		System.out.println("제품수: " +amount);
		System.out.println("제품 가격:" +price);
		System.out.println("제품 이미지: "+img);
		}
	
}



