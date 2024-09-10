package demo;

public class Ex3_OnlyMethod {

	public String msgPrint() {
		return " 안녕하세요 ";
	}

	public int addPrint(int n1, int n2) {
		return n1 + n2;
	}

	public String minusPrint(int n1, int n2) {
		String msg = n1 + " - " + n2 + " = " + (n1 - n2) + " 입니다.";
		return msg;
	}

	public static void main(String[] args) {

	}
}
