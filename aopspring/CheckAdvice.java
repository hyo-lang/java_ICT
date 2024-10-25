package aopspring;

import org.aspectj.lang.ProceedingJoinPoint;

//import org.aspectj.lang.ProceedingJoinPoint;
//������ɻ���
//� �����Ͻ��δ��� ���� Ŭ������ �ҿ�ð�,�����ð��� �����ϰ� ���� �� ���� Around Advice 
//Around Advice - joinpoint��ü�� �ݵ�� �޼����� ���ڷ� ���� �ؾ� �Ѵ�. *****
//�ݵ�� ProceedingJoinPoint ��ü�� ���ڰ����� �����ؾ� �Ѵ�.
public class CheckAdvice {
	//�Ϲ� �޼��带 ����鼭 AroundAdivce �Ű� ���� ���ڿ� ProceedingJoinPoint
	//�� �� �־�� ��.
	public void checkTime(ProceedingJoinPoint pjp) throws Throwable {
		// ���� ��ü�鿡�� ������ ���� ���ɻ����� �ۼ��Ѵ�.
		// �ð��� �ҿ�Ǵ� �ڵ带 ���� �� first�迭�� ����� Advice
		long start = System.currentTimeMillis();
		// target ��ü�� �޼��带 ȣ�� - ���⼭�� first()ȣ��,
		// firstStatementTest() ȣ�� �ɶ� ����� ���� �ڵ�� ...
		// �̰� ����? ���� ���۵Ǵ°� ? �̰� �𸣸� �ϳ� ���� ��~~
		pjp.proceed();
		long end = System.currentTimeMillis();
		System.out.println("���� �� �ӵ� :"+(end-start)+"��");
	}
}
