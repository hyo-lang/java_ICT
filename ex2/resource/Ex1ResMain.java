package ex2.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex1ResMain {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("ex2/resource/ex1_res.xml");
		Ex1_Resource ref = ctx.getBean("ex1_res",Ex1_Resource.class);
		System.out.println(ref.getRes().resource1());
	}
}
