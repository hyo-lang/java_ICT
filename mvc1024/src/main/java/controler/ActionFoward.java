package controler;

public class ActionFoward {
	private String vname; // View�� �̸�
	private boolean method; // View �̵����(Forward, redirect)
	//������
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
