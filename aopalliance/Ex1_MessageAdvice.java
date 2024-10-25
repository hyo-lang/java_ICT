package aopalliance;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//Advice 클래스 : <공통관심 사항>을 정의 해 놓은 클래스 
public class Ex1_MessageAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		//test계열에서 공통으로 사용될 공통관심사항을 작성 
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		
		Object ref = invocation.proceed(); //target메서드를 호출 //test로 시작되는 메서드
		
		System.out.println("★★★★★★★★★★★★★");
		return ref;
	}

}
