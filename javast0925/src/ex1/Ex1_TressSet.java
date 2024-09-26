package ex1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Ex1_TressSet {
	public static void main(String[] args) {
		TreeSet<Integer> h1 = new TreeSet<Integer>();
		h1.add(10);
		h1.add(5);
		h1.add(20);
		h1.add(3);
		h1.add(7);
		System.out.println("크기 : " + h1.size());
		// 이진트리 구조이기 때문에 오름차순이 보장
		System.out.println(h1.toString());

		System.out.println("-------------foreach-------------");
		for (int e : h1) {
			System.out.println(e + " : " + e);
		}

		System.out.println("-------------Iterator-------------");
		Iterator<Integer> it = h1.iterator();
		while (it.hasNext()) {
			int e = it.next();
			System.out.println(e);

		}
		NavigableSet<Integer> h2 = h1.descendingSet();
		System.out.println("크기 : " + h2.size());
		System.out.println("첫번째 요소 : " + h2.first());
		System.out.println("마지막요소 : " + h2.last());
		System.out.println("-------------foreach-------------");

		for (Integer e1 : h2) {
			System.out.println(e1 + " : " + e1);
		}
		System.out.println("-------------Iterator-------------");
		Iterator<Integer> it1 = h2.iterator();
		while (it1.hasNext()) {
			int e2 = it1.next();
			System.out.println(e2);
		}
		
		LinkedHashSet<String> h3 = new LinkedHashSet<String>();
		h3.add("ZTest");
		h3.add("ATest");
		h3.add("BTest");
		h3.add("DTest");
		h3.add("CTest");
		System.out.println("-------------foreach-------------");

		for (String e3 : h3) {
			System.out.println(e3);
		}
		System.out.println("-------------Iterator-------------");
		Iterator<String> it2 = h3.iterator();
		while (it2.hasNext()) {
			String e4 = it2.next();
			System.out.println(e4);
		}
	}

}