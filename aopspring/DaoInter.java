package aopspring;

//1.실습을 위한 인터페이스를 정의한다.
//Advice의 종류를 살펴보고 적용 해보는 코드 
//BeforeAdvice : 타겟 객체의 메서드가 수행 되기 [전]에 실행 시켜야 될 공통관심사항
//AfterAdvice :  타겟 객체의 메서드가 수행 된 [후]에 실행 시켜야 될 공통관심사항
//After-throwing Advice : 예외값을 받아서 사용 될때 -> 나중에 대체 사항이 있어서 잘 안씀
//After-returning Advice : 리턴값을 받고 싶을때 -> 자주 사용 함 (WebMVC에서 다시 설명함)
//Around Advice : BeforeAdvice + TargetMethod + AfterAdvice
//Around Advice는 절대로 JoinPoint를 생략할 수 없다.=> ProceedingJoinPoint pjp
//반드시 타겟 객체의 호출 시점이 있어야 하는 Advice이다. ****
public interface DaoInter {
	// 2.추상메서드들을 정의 하세요~
	public void first();

	// 반환형이 있는 추상 메서드
	public String second();

	public void third();
	// * Around Advice -> 조금전에 한  start , 메서드 실행 , end 이후
	// 수행 속도를 테스트 해보기 위한 전,후 처리가 필요 할 때 사용하는 Advice
	// 즉 추상메서드를 설계한다는 것은 결국 무엇이냐면 ~~ AOP를 적용하는 순간
	// 어떤 전,후 처리가 필요하냐를 생각하고 해당 메서드를 추상적으로 설계 할 수 있다.
	// 인자값이 있고 반환형이 있는 추상메서드
	// 매개변수 code에 의해서 Statement와 PrepareStatement
	// 의 속도 차이를 테스트 하고 싶은 메서드로 정의함
	public String firstStatementTest(int code);
}
