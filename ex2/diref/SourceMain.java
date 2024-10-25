package ex2.diref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SourceMain {
public static void main(String[] args) {
	ApplicationContext ctx = new GenericXmlApplicationContext("ex2/diref/ex2_di.xml");
	
	MakeSouce ref = ctx.getBean("makeSource",MakeSouce.class);
	
	ref.result();
}
}
