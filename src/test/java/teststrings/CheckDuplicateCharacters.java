package teststrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CheckDuplicateCharacters {

	public static void main(String[] args) {
		String s = "Check for duplicate characters.";
		System.out.println("Original String: "+s);
		checkDuplicate(s);

	}
	
	public static void checkDuplicate(String s) {
		s = s.toLowerCase();
		s.replaceAll(" ", "");
		
		System.out.println(s);
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length();i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			}
			else {
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
				
			}
		}
		System.out.println(map);
		Set<Character> set = map.keySet();
		
		for(Character ch: set) {
			if(map.get(ch)>1) {
				System.out.println(ch+ " is found "+map.get(ch)+" times.");
			}
			
		}
	}

}
