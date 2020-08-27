package testJune.withmaven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMaps {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "High Priority");
		map.put(2, "Medium Priority");
		map.put(3, "Low Priority");
		
		System.out.println(map);
		System.out.println(map.containsValue("Low Priority"));
		
		System.out.println(map.entrySet());
		
		Set mapToSet = map.entrySet();
		Iterator mi = mapToSet.iterator();
		
	    while(mi.hasNext()) {
	    	Map.Entry mp = (Map.Entry)mi.next();
	    	System.out.println("Key from Map "+ mp.getKey());
	    	System.out.println("Value from map "+ mp.getValue());
	    }
		
		
		
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		intArr.add(5);
		intArr.add(20);
		intArr.add(30);
		intArr.add(18);
		intArr.add(12);
				
		System.out.println(intArr);
		System.out.println(intArr.get(3));
		
		intArr.add(2, 35);
		System.out.println(intArr);
		intArr.remove(1);
		System.out.println(intArr);
		System.out.println(intArr.size());
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Anil");
		set1.add("Tvisha");
		set1.add("Shiv");
		set1.add("Shiv");
		
		System.out.println(set1);
		System.out.println("Is empty? "+set1.isEmpty());
		System.out.println("Contains Shiv?"+set1.contains("Shiv"));
		System.out.println("Size of the set : "+set1.size());
		
		
		Iterator<String> ite = set1.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
