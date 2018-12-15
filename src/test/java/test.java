package test.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Integer> values = new TreeSet<>();
		
		System.out.println(values.add(35));
		System.out.println(values.add(39));
		
		System.out.println(values.add(15));
		
		for(int i : values) {
			System.out.println(i);
		}
		
		Map<String,String> map = new HashMap();
		map.put("Muname", "Baivin");
		map.put("Mue", "Bain");
		map.put("Mune", "Bvin");
		
		Set<String> keys = map.keySet();
		
		for(String key : keys) {
			System.out.println(map.get(""));
		}
		
	}

}
