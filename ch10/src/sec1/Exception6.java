package sec1; //문법에러, 강제실행해야함

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Exception6 { //데이터 로딩시

	public static void main(String[] args) {
		FileInputStream fis = null; //파일 불러올때 FileInputStream //안 밖 상관없음
		FileOutputStream ois = null;
		try {
			fis = new FileInputStream("datafile.txt");
			ois = new FileOutputStream("outputfile.txt");
		} catch (FileNotFoundException e){
			System.out.println("해당 파일이 존재하지 않아 파일을 열 수 없음");
			e.printStackTrace();
		}
		

	}

}
