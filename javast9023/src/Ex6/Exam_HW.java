package Ex6;

import java.nio.charset.Charset;
import java.util.Vector;

public class Exam_HW {
	private Vector v;
	public Exam_HW() {
		v = new Vector();
		v.add("Test");
		v.add(10.45f);
		v.add('A');
		v.add(20.11);
		v.add(true);
		v.add(100L);
	}
	// 힌트) 상속관계 살펴보기 , 오늘 수업한 것 중에 상속관계 알아보는 키워드 
	public void printVector() {
		//여기서 벡터안에 들어간 내용을 출력할 때, 자료형도 함께 출력하시오.
		// 출력 : String => Test
		//       Float => 10.4f 
		//      
		
		for (Object o : v) {
			if (o instanceof String) {
				System.out.println("String ==> " + o);
			} else if(o instanceof Float){
				System.out.println("float ==> " + o);
			} else if(o instanceof Character){
				System.out.println("char ==> " + o);
			} else if(o instanceof Double){
				System.out.println("double ==> " + o);
			} else if(o instanceof Boolean){
				System.out.println("bloolean ==> " + o);
			} else {
				System.out.println("long ==> " + o);				
			}
		}
	}
	public static void main(String[] args) {
		new Exam_HW().printVector();
	}
}