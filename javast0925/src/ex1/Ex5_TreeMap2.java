package ex1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class Ex5_TreeMap2 {
	public static void main(String[] args) {

		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		NavigableMap<String, Integer> map1 = map.descendingMap();
		map1.put("Z", 100);
		map1.put("A", 90);
		map1.put("D", 80);
		map1.put("C", 80);
		map1.put("F", 70);
		System.out.println("Map size :" + map.size());
		System.out.println("Map get(Key)" + map.get("Z"));
		map1.put("B", 80);
		map1.put("F", 100); // key가 중복일 때는 갱신된다*****

		System.out.println("Map size :" + map1.size());
		System.out.println("Map get(Key)" + map1.get("Z"));
		System.out.println("--------Iterator-------*****");

		Set<Map.Entry<String, Integer>> me = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it = me.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> e = it.next();
			System.out.println("key: " + e.getKey() + ":" + e.getValue());
		}
		System.out.println("--------foreach-------*****");
		for (Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}
}
