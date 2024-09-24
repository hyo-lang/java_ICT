package ex2;
// 간단하게 줄이기!!!
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

//List인터페이스 구현 객체
public class Ex1_LinkedListArratList {
	public void linkedList(LinkedList<String> ar) {
		long start = System.currentTimeMillis();
		for (String e : ar) {
			String msg = e;
			if (e.equals("ICTPassword01")) {
			}
		}
		// 시스템의 시간대를 반환하는 메서드 - 끝
		long end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start));
	}

	public void arrayList(ArrayList<String> ar) {
		long start = System.currentTimeMillis();
		for (String e : ar) {
			String msg = e;
			if (e.equals("ICTPassword01")) {
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start));
	}

	public static void main(String[] args) {
		Ex1_LinkedListArratList ref = new Ex1_LinkedListArratList();
		
		ArrayList<String> ar1 = new ArrayList<String>();
		LinkedList<String> ar2 = new LinkedList<String>();

		Scanner sc = new Scanner(System.in);
		System.out.println("1-ArrayList, 2-LinkedList :");

		int menu = Integer.parseInt(sc.nextLine());
		if (menu == 1) {
			// ArrayList
			for (int i = 0; i < 100000000; i++) {
				if (i % 5 == 0) {
					ar1.add("ICTPassword01");
				} else {
					ar1.add("java");
				}
			}
			ref.arrayList(ar1);
		} else if (menu == 2) {
			// LinkedList
			for (int i = 0; i < 100000000; i++) {
				if (i % 5 == 0) {
					ar2.add("ICTPassword01");
				} else {
					ar2.add("java");
				}
			}
			ref.linkedList(ar2);
		}
	}
}