package ex2.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex1_AutoMain {
public static void main(String[] args) {
	ApplicationContext ctx = 
			new GenericXmlApplicationContext("ex2/auto/ex1_auto.xml");
	Ex1_AutoWired ref = ctx.getBean("auto1", Ex1_AutoWired.class);
	System.out.println(ref.getMessage());
}
}
