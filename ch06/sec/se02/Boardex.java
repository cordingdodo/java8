package se02;

import java.util.Date;
import java.util.Scanner;

public class Boardex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Board [] board = new Board[100];
		for(int i=0;i<board.length;i++){ //객체 배열의 선언 및 초기화가 필요함
			board[i] = new Board();
		}
		
		boolean sw = true; //작업 계속 여부
		int cnt= 0; //배열의 개수 카운트
		
		while(sw){
			System.out.println("작업 번호 입력: ");
			int job = sc.nextInt();
			int idx;
			String title;
			String content;
			String author;
			switch(job){
			case 1:
				System.out.println("*********입력 작업*********");
				System.out.println("제목: ");
				title = sc.next();
				System.out.println("내용 : " );
				content = sc.next();
				System.out.println("작성자: ");
				author = sc.next();
				Date resdate = new Date();
				board[cnt].boardWrite(cnt, title, content, author, resdate);
				cnt++;
				break;
				
			case 2:
				System.out.println("*********수정 작업*********");
				System.out.println("글 번호: ");
				idx = sc.nextInt();
				System.out.println("제목 : ");
				title = sc.next();
				System.out.println("내용 : " );
				content = sc.next();
				for(int a=0;a<=cnt;a++){
					board[a].boardUpdate(idx, title, content);
					}
				break;
			
			case 3:
				System.out.println("*****삭제 작업*****");
				System.out.println("글 번호: ");
				idx = sc.nextInt();
				for (int a=0;a<=cnt;a++){
					board[a].boardDelete(idx);
				}
				break;
				
			case 4:
				System.out.println("*****검색 작업*****");
				System.out.println("글 번호: ");
				idx = sc.nextInt();
				for (int a=0;a<=cnt;a++) {
					board[a].boardSearch(idx);
				}
				break;
			default: 
			System.out.println("잘못 입력하셨습니다. 프로그램이 종료됩니다.");
			sw = false;
			}
			
		}
		
	}
	
}
