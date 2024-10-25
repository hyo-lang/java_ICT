package ex2.resource;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//Ex1_MyResource를 주입 받아서 사용할 객체 
public class Ex1_Resource {
	//@Autowired와 @Resource 차이 1
	//수식어를 주고 byName일 경우 @Autowired 는 수식어가 강하고
	//수식어를 주고 byName일 경우 @Resource일 때는 byName이 강함.
	//@Autowired
	
	// @Resource , @Qualifier("bb") 적용한 byType일 경우 수식어를 따른다.
	// 그렇지만 @Resource(name = "resn2"),@Qualifier("bb") 일 경우에는  Alias를 따른다.
	// 원리는 이렇지만 보통 @Resource(name = "resn2") 만으로도 충분하기 때문에 이렇게 사용하는것이 
	// 일반적이다. *****
	@Resource(name = "resn2") //Alias -> 안녕하세요2
	@Qualifier("bb") //수식어는 ->안녕하세요1
	private Ex1_MyResource res;

//	public void setRes(Ex1_MyResource res) {
//		this.res = res;
//	}
	//------------------------------------
	public Ex1_MyResource getRes() {
		return res;
	}
}
