package ex2.resource;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//Ex1_MyResource�� ���� �޾Ƽ� ����� ��ü 
public class Ex1_Resource {
	//@Autowired�� @Resource ���� 1
	//���ľ �ְ� byName�� ��� @Autowired �� ���ľ ���ϰ�
	//���ľ �ְ� byName�� ��� @Resource�� ���� byName�� ����.
	//@Autowired
	
	// @Resource , @Qualifier("bb") ������ byType�� ��� ���ľ ������.
	// �׷����� @Resource(name = "resn2"),@Qualifier("bb") �� ��쿡��  Alias�� ������.
	// ������ �̷����� ���� @Resource(name = "resn2") �����ε� ����ϱ� ������ �̷��� ����ϴ°��� 
	// �Ϲ����̴�. *****
	@Resource(name = "resn2") //Alias -> �ȳ��ϼ���2
	@Qualifier("bb") //���ľ�� ->�ȳ��ϼ���1
	private Ex1_MyResource res;

//	public void setRes(Ex1_MyResource res) {
//		this.res = res;
//	}
	//------------------------------------
	public Ex1_MyResource getRes() {
		return res;
	}
}
