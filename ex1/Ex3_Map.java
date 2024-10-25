package ex1;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex3_Map {
	private Map<String, String> map;

	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("ex1/ex3_map.xml");
		Ex3_Map  ref = ctx.getBean("map",Ex3_Map.class);
		Map<String, String> maps = ref.getMap();
		System.out.println(maps);
	}
}
