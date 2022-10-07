package sec2;
import java.util.List;
import java.util.Vector;
import sec1.Board;
public class ListEx3 {
	public static void main(String[] args) {
		List<Board> bList = new Vector<Board>(); //<>생략가능인듯 ㅎ
		//글쓰기 - 글 추가 (요소 추가) add
		bList.add(new Board("제목1", "내용1", "김도도"));
		bList.add(new Board("제목2", "내용2", "박주주"));
		bList.add(new Board("제목3", "내용3", "김주주"));
		bList.add(new Board("제목4", "내용4", "박도도"));
		bList.add(new Board("제목5", "내용5", "응챠리카"));
		
		System.out.println(bList); //스트링이 아니고 하나의 객체임 그래서 그것에 대한 주소만 나옴
		//글 목록
		System.out.println("제목\t내용\t글쓴이");
		for(int i=0;i<bList.size();i++){
			Board b = new Board();
			b = bList.get(i); //i번째를 가져와서 b에다 넣음
			System.out.println(b.getTitle()+"\t");
		}
		
		//글삭제
		bList.remove(3);
	}

}
