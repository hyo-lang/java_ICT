package ex1;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex1_GenericArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> v1 = new ArrayList<String>();
		System.out.println("----------------");
		v1.add("Test");
		v1.add("Test1");
		//v1.add(100); -> 숫자는x 넣으려면 "" 안에
		
		int num = 100;
		v1.add(String.valueOf(num));
		
		//for문
		int sizev = v1.size();
		for (int i = 0; i < sizev; i++) {
			System.out.println(v1.get(i));
		}
		System.out.println("---------------------");
		for(String e: v1) {
			System.out.println(e);
		}
		ArrayList<Integer> v2 = new ArrayList<Integer>();
		v2.add(100);
		String num2 = "100";
		v2.add(Integer.parseInt(num2));
		
		//foreach
		for (Integer e : v2) {
			System.out.println(e);
		}
		System.out.println("----------------");
		
		//각 자료형 중 char,double 전용 ArrayList를 각각 만들고
		//값을 2개씩 저장하고, 출력, 길이도 출력
		
		ArrayList<Character> v3 = new ArrayList<Character>();
		v3.add('A');
		String msg = "hello";
		v3.add(msg.charAt(0));
		System.out.println(msg.charAt(0));
		
		for (Character a : v3) {
			System.out.println(a);
			
		
			
		}
	}
}
