package ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class Ex1_Exception {
	public static void main(String[] args) {
		try {
			Class<?> msg = Class.forName("java.lang.ClassNotFoundException");
			System.out.println("Message => " + msg);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("====================");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("====================");
		String path = "D:\\ICTstudy\\javastudy\\workspace\\javast9023\\src\\ex1\\mag.txt";
		// 파일장치로부터 내용을 읽어내는 스트림
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(path);
			System.out.println((char)fis.read());
		} catch (FileNotFoundException e) {
			e.printStackTrace(); System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			e.printStackTrace(); System.out.println("장치에 문제가 발생해서 파일 읽기를 실패!!!");
		} finally {
			try {
				if (fis != null)
					fis.close();
				System.out.println("자원을 해제합니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
