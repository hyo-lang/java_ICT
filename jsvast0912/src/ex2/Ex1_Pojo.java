package ex2;

import ex1.Ex3_Final;

//약속)
//POJO(Plain Old Java Object): 순수한 값만을 저장하기 위한 객체
//저장 -setter , 불러올때는 -getter 
//setter의 규칙 ->num -> setNum
// public void setNum(int num){
// this.num = num;
// }
//getter의 규칙 -> num -> getNum() , boolean만 isBval()
// public int getNum(){
// 	return num;
// }
// 평생 사용합니다. 
public class Ex1_Pojo {
	//속성 
	private int num;
	private String id;
	private long val;
	private double dval;
	private float fval;
	private boolean bval;
	
	//배열
	private String[] strs;
	// Object
	private Ex3_Final exfinal;
	
	
	
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getVal() {
		return val;
	}
	public void setVal(long val) {
		this.val = val;
	}
	public double getDval() {
		return dval;
	}
	public void setDval(double dval) {
		this.dval = dval;
	}
	public float getFval() {
		return fval;
	}
	public void setFval(float fval) {
		this.fval = fval;
	}
	public boolean isBval() {
		return bval;
	}
	public void setBval(boolean bval) {
		this.bval = bval;
	}

	
}
