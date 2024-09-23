package ex5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class Ex1_Exception {
	public static void main(String[] args) {

		String path = "D:\\ICTstudy\\javastudy\\workspace\\javast9023\\src\\ex1\\mag.txt";
		// 파일장치로부터 내용을 읽어내는 스트림
		try (FileInputStream fis = new FileInputStream(path)) {
			System.out.println((char)fis.read());
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
