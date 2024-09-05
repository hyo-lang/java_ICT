package ex1;

public class Ex6_DataType {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		System.out.println("num1 == num2 =>" + (num1 == num2));
		
		String str1 = new String("Test");
		String str2 = new String("Test");
		
		//System.out.println(str1.equals(str2));
		
		System.out.println("str1 == str2 =>" + (str1 == str2));
		
		String str3 = "Test2";
		String str4 = "Test2";
		System.out.println("str3 == str4 =>" + (str3 == str4));
	}

}
