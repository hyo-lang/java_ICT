package demo;

public class Ex2_MethodDemo {
	private int num;
	private String writer;
	private String content;
	private char groups;
	private float ff;

	public void addNum(int num) {
		this.num = num;

	}

	public String printNum() {
		String msg = "당신의 번호는 " + num + " 입니다.";
		return msg;
	}

	public void addWriter(String writer) {
		this.writer = writer.substring(1);
	}

	public boolean addcontent(String content) {
		int contLen = content.length();
		if (contLen > 10) {
			this.content = content;
			return true;
		} else {
			return false;
		}
	}
	public void score(int score) {
		
		if (score>=90) {
			groups = 'A';
		} else if (score >=80){
			groups = 'B';
		}else if (score >=70){
			groups = 'C';
		}else {
			groups = 'D';
		}
		//System.out.println(groups);
	}
	public void addfloat(float ff) {
		this.ff = ff;
	}
	
}
