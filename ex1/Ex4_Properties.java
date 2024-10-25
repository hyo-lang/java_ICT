package ex1;

import java.util.Map;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex4_Properties {
	private Properties prop;
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public static void main(String[] args) {
		ApplicationContext ctx =
				new GenericXmlApplicationContext("ex1/ex5_pro.xml");
		Ex4_Properties ref = ctx.getBean("prop" ,Ex4_Properties.class);
		Properties pr = ref.getProp();
		for(Map.Entry e : pr.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}

	}
}
