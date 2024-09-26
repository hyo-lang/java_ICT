package ex1;

import java.io.File;
import java.io.IOException;

public class Ex1_File {
	public static void main(String[] args) {
		String path = "src/ex1/demo.txt";
		File f = new File(path);
		System.out.println(f);
		System.out.println(f.exists());
		System.out.println("===============================");
		if (!f.exists()) {
			System.out.println("존재하지 않음");
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("존재함");
			System.out.println("파일인가? :" + f.isFile());
			System.out.println("실행이 가능한가?" + f.canExecute());
			System.out.println("적성이 가능한가?" + f.canWrite());
			System.out.println("절대경로 : " + f.getAbsolutePath());
			System.out.println("파일이름 : " + f.getName());
			System.out.println("디렉토리니? : " + f.isDirectory());
			System.out.println("파일의 길이 : " + f.length());
		}
	}
}
