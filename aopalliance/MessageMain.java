package aopalliance;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class MessageMain {
	public static void main(String[] args) {
		usePointCut();
	}

	private static void usePointCut() {
		// AOP�� Advice�� Taget�� ���踦 �������ִ� ��ü�̴�.
		ProxyFactoryBean pfBean = new ProxyFactoryBean();
		// Target ��ü�� ������ ProxyFactoryBean ����
		pfBean.setTarget(new MessageImple());
		// Adivce�� ����
		// Pointcut �̶� ���� ǥ���� ���� ����ؼ� , Advice�� ������ �����
		// ���� �ϰ��� �� �� �����
		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
		//target�� ������ �ִ� �޼��� �̸��� ������ �� �ִ�.
		pointcut.setMappedName("print*");
		// Advice�� pointcut�� ���� => Advisor
		pfBean.addAdvisor(new DefaultPointcutAdvisor(pointcut, new Ex1_MessageAdvice()));
		// Ÿ���� ���� 
		Message prMessage = (Message) pfBean.getObject();
		prMessage.print();
	}
}
