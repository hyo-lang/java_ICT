package ex1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex4_BufferedCopy {
	public static void main(String[] args) {
		 String path1 = "D:\\ICTstudy\\javastudy\\mysample\\mywork\\jdk.exe"; //원본
		 String path2 = "D:\\ICTstudy\\javastudy\\mysample\\mywork\\jdk3.exe";
		 long start = System.currentTimeMillis();
		 try {
			// FileInputStream fis = new FileInputStream(path1);
		// FileOutputStream fos = new FileOutputStream(path2);
			 
			 BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path1));
			 BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path2));
					 
			 int readNum = 0;
			 while ((readNum = bis.read()) != -1) {
				bos.write(readNum);
			} 
					 
		} catch (Exception e) {
			e.printStackTrace();
		}
	long end = System.currentTimeMillis();
	System.out.println("소요시간 : " + (end - start));
	}
	
}
