package aopalliance;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class MessageMain {
	public static void main(String[] args) {
		usePointCut();
	}

	private static void usePointCut() {
		// AOP의 Advice와 Taget의 관계를 관리해주는 객체이다.
		ProxyFactoryBean pfBean = new ProxyFactoryBean();
		// Target 객체의 정보를 ProxyFactoryBean 저장
		pfBean.setTarget(new MessageImple());
		// Adivce를 적용
		// Pointcut 이란 정규 표현식 등을 사용해서 , Advice를 적용할 대상을
		// 선택 하고자 할 때 사용함
		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
		//target이 가지고 있는 메서드 이름을 선별할 수 있다.
		pointcut.setMappedName("print*");
		// Advice와 pointcut의 결합 => Advisor
		pfBean.addAdvisor(new DefaultPointcutAdvisor(pointcut, new Ex1_MessageAdvice()));
		// 타겟을 실행 
		Message prMessage = (Message) pfBean.getObject();
		prMessage.print();
	}
}
