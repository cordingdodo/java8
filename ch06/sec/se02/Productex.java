package se02;

import java.util.Scanner;

public class Productex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product pr1 = new Product ();
		System.out.println("제품 코드: ");
		pr1.setPid(sc.next());
		System.out.println("제품명: ");
		pr1.setPname(sc.next());
		System.out.println("제품수량: ");
		pr1.setAmount(sc.nextInt());
		System.out.println("제품 가격: ");
		pr1.setPrice(sc.nextInt());
		System.out.println("제품 이미지: ");
		pr1.setImg(sc.next());
		
		System.out.println("제품코드\t제품명\t제품수량\t제품가격\t이미지");
		System.out.println(pr1.getPid()+"\t"+pr1.getPname()+"\t"+pr1.getAmount()+"\t"+pr1.getPrice()+"\t"+pr1.getImg());
		
		pr1.printProduct();
		System.out.println(pr1.calcRank());
	}

}
