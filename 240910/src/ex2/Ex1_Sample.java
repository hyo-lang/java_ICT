package ex2;
//시험문제-객관식?
public class Ex1_Sample {
	
	private boolean enter;
	//거짓

	// 접근제한자 반환형 메서드명([자료형 변수1, 자료형 변수2 ..])
	public void chaekEnter(int age) {

		//int age = 22;

		if (age > 19) {
			// System.out.println(true);
			enter = true;
		} else {
			// System.out.println(false);
			enter = false;
		}
	}
	
	public String res() {
		String res = "";
		
		if (enter) {
			res = "입장허가";
		} else {
			res = "입장금지";
	
		}
		return res;
	}
}

