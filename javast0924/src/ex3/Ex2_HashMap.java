package ex3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//key, value의 쌍으로 데이터를 저장하는 구조
//map의 키는 중복을 허용하지는 set구조이고, set은 collection 인터페이스를 상속
public class Ex2_HashMap {
	public static void main(String[] args) {
		//Map<Key,Value> => Key가 Set이다.
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Z", 100);
		map.put("A", 90);
		map.put("B", 80);
		map.put("C", 80);
		map.put("D", 70);
		System.out.println("Map size :" + map.size());
		System.out.println("Map get(Key)" + map.get("Z"));
		map.put("B", 80);
		map.put("Z", 60); //key가 중복일 때는 갱신된다*****
		System.out.println("Map size :" + map.size());
		System.out.println("Map get(Key)" + map.get("Z"));
		
		System.out.println("--------Iterator-------*****");
		//set을 사용해서 entry를 반환받아서 반복자를 출력
		//Entry는 Key, Value를 분리해서 받을 수 있는 자료형
		//map.entrySet() 는 Key, Value를 분리해서 ENtry에 반환하는 메서드
		Set<Map.Entry<String, Integer>> me = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it = me.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> e = it.next();
			System.out.println("key: " + e.getKey() +":"+e.getValue());
		}
		for (Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}
}
