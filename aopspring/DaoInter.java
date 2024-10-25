package aopspring;

//1.�ǽ��� ���� �������̽��� �����Ѵ�.
//Advice�� ������ ���캸�� ���� �غ��� �ڵ� 
//BeforeAdvice : Ÿ�� ��ü�� �޼��尡 ���� �Ǳ� [��]�� ���� ���Ѿ� �� ������ɻ���
//AfterAdvice :  Ÿ�� ��ü�� �޼��尡 ���� �� [��]�� ���� ���Ѿ� �� ������ɻ���
//After-throwing Advice : ���ܰ��� �޾Ƽ� ��� �ɶ� -> ���߿� ��ü ������ �־ �� �Ⱦ�
//After-returning Advice : ���ϰ��� �ް� ������ -> ���� ��� �� (WebMVC���� �ٽ� ������)
//Around Advice : BeforeAdvice + TargetMethod + AfterAdvice
//Around Advice�� ����� JoinPoint�� ������ �� ����.=> ProceedingJoinPoint pjp
//�ݵ�� Ÿ�� ��ü�� ȣ�� ������ �־�� �ϴ� Advice�̴�. ****
public interface DaoInter {
	// 2.�߻�޼������ ���� �ϼ���~
	public void first();

	// ��ȯ���� �ִ� �߻� �޼���
	public String second();

	public void third();
	// * Around Advice -> �������� ��  start , �޼��� ���� , end ����
	// ���� �ӵ��� �׽�Ʈ �غ��� ���� ��,�� ó���� �ʿ� �� �� ����ϴ� Advice
	// �� �߻�޼��带 �����Ѵٴ� ���� �ᱹ �����̳ĸ� ~~ AOP�� �����ϴ� ����
	// � ��,�� ó���� �ʿ��ϳĸ� �����ϰ� �ش� �޼��带 �߻������� ���� �� �� �ִ�.
	// ���ڰ��� �ְ� ��ȯ���� �ִ� �߻�޼���
	// �Ű����� code�� ���ؼ� Statement�� PrepareStatement
	// �� �ӵ� ���̸� �׽�Ʈ �ϰ� ���� �޼���� ������
	public String firstStatementTest(int code);
}
