package ex1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Ex2_Properties {
	private Properties prop;
	private String path;

	public Ex2_Properties() {
		prop = new Properties();
		path = "src/ex1/my.properties";

	}

	public String messageRes(String msg) {
		String res = "";
		try (FileReader fr = new FileReader(path)) {
			prop.load(fr);
				res = prop.getProperty(msg, "그런말은 배운적이 없어요!");
		}catch(Exception e)
	{e.printStackTrace();
	}return res;
}
	public void makeMessage(String msg, String mag2) {
		try (FileWriter fw = new FileWriter(path)){
			prop.setProperty(msg, msg)
			prop.store(fw, null);
			System.out.println("등록 되었습니다!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

//ex1/my.properties
	public static void main(String[] args) {
		Ex2_Properties ref = new Ex2_Properties();
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("대화 : ");
		String msg = sc.nextLine();
		// FileReader 파일을 문자단위로 읽어 들이는 스트림 객체
		System.out.println("답변 : " + ref.messageRes(msg));
		System.out.println("가르칠 대화 : ");
		String msg2 = sc.nextLine();
		System.out.println("답변 : ");
		String msg3 = sc.nextLine();
		ref.makeMessage(msg2,msg3);
		}
	}
}
