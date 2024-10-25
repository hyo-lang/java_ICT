package aopspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {
public static void main(String[] args) {
	ApplicationContext ctx = new GenericXmlApplicationContext("aopspring/ex1_aop.xml");
	DaoInter dao = ctx.getBean("dao", DaoInter.class);
	//dao.first();
	dao.firstStatementTest(1); // statement Å×½ºÆ®
}
}
