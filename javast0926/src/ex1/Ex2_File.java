package ex1;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;

public class Ex2_File {
	// src/ex1 하위의 파일인지 데릭토리인지 구별 출력
	private static void examFileList(String path) {
		File f = new File(path);
		if (f.exists()) {
			System.out.println("해당 경로 존재!");

			File[] flist = f.listFiles();
			System.out.println(Arrays.toString(flist));
			for (File e : flist) {
				if (e.isDirectory()) {
					System.out.println("디렉토리 : " + e.getName());
				} else {
					System.out.println("파일 : " + e.getName());
				}
			}
			System.out.println("=================");
		}
	}

	/*
	 * private static void retStringPath(String path) { File f = new File(path); if
	 * (f.exists()) { System.out.println("해당 경로 존재!"); String[] flist = f.list();
	 * System.out.println(Arrays.toString(flist)); for (String e : flist) {
	 * System.out.println(e); } System.out.println("================="); } }
	 */

	public static void main(String[] args) {
		String path = "src/ex1";
		// retStringPath(path);
		examFileList(path);

	}
}
