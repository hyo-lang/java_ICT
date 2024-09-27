package ex1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex2_FileOutputStream2 {
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
	
	// writeStream의 기능을 업데이트 해서 코드량을 줄이시오. try-with-resource
    public static void writeStream2 (String path, String msg) {
        try(FileOutputStream fos = new FileOutputStream(path, true) ) {
            //msg값을 하나씩* 읽어서 write()를 호출해서 해당 파일에 내용을 저장
            //String msg = ABC
            for(int i=0; i< msg.length(); i++) { 
                fos.write(msg.charAt(i));
            }
            //byte[] b = msg.getBytes("UTF-8");
            //for.write(b);
            } catch (Exception e) {

            }
    }                      

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = "D:\\ICTstudy\\javastudy\\mysample\\mywork\\demo2.txt";
        System.out.println("글자 입력하기");
        String msg = sc.nextLine();
        writeStream(path, msg);
    }
}