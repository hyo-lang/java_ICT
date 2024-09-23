package ex2;

public class Ex1_ThrowsEXample {
	
	public void findClass(String className) throws ClassNotFoundException   {
	//	try {
		
			Class cls = Class.forName(className);
			
			System.out.println("해당 클래스는 : " + cls);
			
	//	} catch (ClassNotFoundException e) {
	//		System.out.println(e.getMessage());
	//		System.out.println("팡팡! 축하합니다. 오타예요.");
	//	}
	
	}	
}
