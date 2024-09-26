package ex2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex1_FileOutputStream {
	public static void writeStream(String path,String msg) {
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(path,true);
			for (int i = 0; i < msg.length(); i++) {
				fos.write(msg.charAt(i));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//writeStream의 기능을 업데이트해서 코드량 줄이시오.
	public static void writeStream2(String path,String msg) {
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = "D:\\ICTstudy\\javastudy\\mysample\\mywork\\demo.txt";
		System.out.println("글자 입력하기");
		String msg = sc.nextLine();
		writeStream(path, msg);
	}
}
