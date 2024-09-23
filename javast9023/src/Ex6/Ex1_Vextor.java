package Ex6;

import java.util.Vector;

public class Ex1_Vextor {
	private Vector v;

	public Ex1_Vextor() {
		v = new Vector();
		System.out.println("초기 용량 : " + v.capacity());
		System.out.println("초기 사이즈 : " + v.size());
		System.out.println("==================");
		
		Object[] av = new Object[3];
		av[0] = "Text1";
		av[1] = "Text1";
		av[2] = "Text1";
		
		v.add("Test1");
		v.add(10);
		System.out.println("초기 용량 : " + v.capacity());
		System.out.println("초기 사이즈 : " + v.size());
		
		/*System.out.println("==================");
		System.out.println("데이터 가져오기 " + v.get(0));
		System.out.println("데이터 가져오기  " + v.get(1));
		System.out.println("데이터 가져오기  " + v.get(2));*/
		
		for (int i = 0; i <11; i++) {
			v.add("Test" + (i+1));
		}
		System.out.println("==================");
		System.out.println("초기 용량 : " + v.capacity());
		System.out.println("초기 사이즈 : " + v.size());
		System.out.println("==================");
		System.out.println("첫 데이터 가져오기 " + v.get(0));
		System.out.println("마지막 데이터 가져오기  " + v.get( v.size()-1));
		
		int vsize = v.size();
		for (int i = 0; i < vsize; i++) {
			System.out.println(v.get(i));
		}
		System.out.println("==================");
		for (Object e : v) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		new Ex1_Vextor();
		
	}
}
