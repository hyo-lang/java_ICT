package controler;

import java.io.FileReader;
import java.util.Properties;

import model.Action;
import model.HelloAction;
import model.MyProfileAction;

public class ActionFactory {
	private static ActionFactory factory;
	
	private Properties prop;
	private String path;
	
	
	private ActionFactory () {
		
		prop = new Properties();
		path="D:\\ICTstudy\\spring\\workspace\\mvc1024\\src\\main\\java\\controler\\classinfo.properties";
		
	}
	public synchronized static ActionFactory getFactory () {
		if (factory == null) factory = new ActionFactory();
		return factory;
	}
	
	//��û �м��ؼ� � ���� �ʿ������� �ľ��ϰ� ���������� ��ȯ
	public  Action getAction(String cmd) {
		Action action = null;
		
		try (FileReader fr = new FileReader(path);){
			prop.load(fr);
			String cmdPath = prop.getProperty(cmd, "model.HelloAction");

			Class<Action> handler = (Class<Action>)Class.forName(cmdPath);
			action = handler.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		if(cmd.equals("hello")) {
//			action = new HelloAction();
//		}else if(cmd.equals("profile")) {
//			action = new MyProfileAction();
//		}
		return action;
	}

}