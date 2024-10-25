package aopspring;

import org.aspectj.lang.ProceedingJoinPoint;

//import org.aspectj.lang.ProceedingJoinPoint;
//공통관심사항
//어떤 비지니스로닉을 가진 클래스가 소요시간,지연시간을 측정하고 싶을 때 사용될 Around Advice 
//Around Advice - joinpoint객체가 반드시 메서드의 인자로 선언 해야 한다. *****
//반드시 ProceedingJoinPoint 객체를 인자값으로 지정해야 한다.
public class CheckAdvice {
	//일반 메서드를 만들면서 AroundAdivce 매개 변수 인자에 ProceedingJoinPoint
	//를 꼭 넣어야 함.
	public void checkTime(ProceedingJoinPoint pjp) throws Throwable {
		// 구현 객체들에게 적용할 공통 관심사항을 작성한다.
		// 시간이 소요되는 코드를 설계 한 first계열에 적용될 Advice
		long start = System.currentTimeMillis();
		// target 객체의 메서드를 호출 - 여기서는 first()호출,
		// firstStatementTest() 호출 될때 적용될 공통 코드들 ...
		// 이게 뭔가? 언제 동작되는가 ? 이걸 모르면 하나 마나 임~~
		pjp.proceed();
		long end = System.currentTimeMillis();
		System.out.println("수행 된 속도 :"+(end-start)+"초");
	}
}
