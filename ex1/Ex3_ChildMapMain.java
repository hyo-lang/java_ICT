package ex1;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex3_ChildMapMain {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("ex1/ex3_map_child.xml");
		Ex3_Map ref = ctx.getBean("map2",Ex3_Map.class);
		Map<String, String> maps = ref.getMap();
		System.out.println(maps);
		//for문을 사용해서  key=> , val=> 
		for(Map.Entry<String, String> e : maps.entrySet()) {
			System.out.println("key=>"+e.getKey()+",val=>"+e.getValue());
		}
	}
}
