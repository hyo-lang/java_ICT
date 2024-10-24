package controler;

public class ActionFoward {
	private String vname; // View의 이름
	private boolean method; // View 이동방식(Forward, redirect)
	//생성자
	public ActionFoward() {}
	public ActionFoward(String vname, boolean method) {
		super();
		this.vname = vname;
		this.method = method;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public boolean isMethod() {
		return method;
	}
	public void setMethod(boolean method) {
		this.method = method;
	}
	
	

}
