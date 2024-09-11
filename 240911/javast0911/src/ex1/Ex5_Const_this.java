package ex1;
//this의미는 인스턴스를 스스로 참조하는 키워드 (거울)
//this() : 자신의 생성자를 호출한다.(개념만 이해해도 됨)
public class Ex5_Const_this {
	private String model;
	private String color;
	private int maxSpeed;
	public Ex5_Const_this(String model) {
		this(model,"레드",1000);
		this.model = model;
		System.out.println("여기는 모델을 초기화 해서 생성했다.");
	}
	public Ex5_Const_this(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("여기는 모델과 색상을 초기화 해서 생성했다.");
	}
	private Ex5_Const_this(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		System.out.println("여기는 모두 초기화 해서 생성했다.");
	}
	public String printCar() { // 자동차를 출력하는 메서드
		return model+":"+color+":"+maxSpeed;
	}
	public static void main(String[] args) {
		Ex5_Const_this ref  = new Ex5_Const_this("그랜저");
		System.out.println(ref.printCar());
	}
}