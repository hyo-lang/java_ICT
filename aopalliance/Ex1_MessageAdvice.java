package aopalliance;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//Advice Ŭ���� : <������� ����>�� ���� �� ���� Ŭ���� 
public class Ex1_MessageAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		//test�迭���� �������� ���� ������ɻ����� �ۼ� 
		System.out.println("������������������������������");
		
		Object ref = invocation.proceed(); //target�޼��带 ȣ�� //test�� ���۵Ǵ� �޼���
		
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡ�");
		return ref;
	}

}
