package ex2;

public class Ex1_ThrowsMain {
	public static void useClass(String useName) {
		Ex1_ThrowsEXample ref = new Ex1_ThrowsEXample();
		try {
			ref.findClass(useName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Ex1_ThrowsMain.useClass("java.lang.String");
	}
}
