package ex1;

import java.io.File;
import java.util.Iterator;

public class ex3_FileMkdir {
	public static void showPath(String orifile) {
		File f1 = new File(orifile);
		File[] list = f1.listFiles();
		for (File e : list) {
			if (e.isDirectory()) {
				System.out.println("Directory => " + e.getName());
			} else {
				System.out.println("File => " + e.getName());
			}
		}
	}
	public static void main(String[] args) {
		String oripath = "D:\\ICTstudy\\javastudy";
		String path = "D:\\ICTstudy\\javastudy\\mysample\\mywork\\aaa";
		File f1 = new File(path);
		if (!f1.exists()) {
			System.out.println("해당 결로가 존재하지 않습니다. 그래서 만들겠습니다.");
			f1.mkdirs();
			showPath(oripath);
		} else {
			System.out.println("이미 존재하는 경로입니다.");
			showPath(oripath);
		}
	}
}
