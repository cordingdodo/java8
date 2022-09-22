package se02;

import java.util.Date;

public class Board {
	private int idx;
	private String title;
	private String content;
	private String author;
	private Date resdate;

	public void boardWrite(int idx, String title, String content, String author,
			Date resdate) {
		idx=idx;
		title=title;
		content=content;
		author=author;
		resdate=resdate;
	}
	
	public void boardUpdate(int idx, String title, String content) {
		if(idx==this.idx) {
			this.title = title;
			this.content = content;		
	}	
	}
	
	public void boardDelete (int idx){
		if(idx==this.idx) {
			this.title="";
			this.content="";
		}
	}
	public void boardSearch (int idx){
		if(idx==this.idx){
//			System.out.println("글 번호: "+this.idx);
//			System.out.println("글 제목: "+this.title);
//			System.out.println("글 내용: "+this.content);
//			System.out.println("작성자: "+this.author);
//			System.out.println("작성일: "+this.resdate);
			System.out.println(this.idx+"\t"+this.title+"\t"+this.content+"\t"
					+this.author+"\t"+this.resdate);
		}
	}
}
		
	
	
	

