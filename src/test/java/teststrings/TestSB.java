package teststrings;

import java.util.Set;
import java.util.TreeSet;

public class TestSB {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		long start = System.nanoTime();
		sb.append("testing");
		System.out.println(sb.length());
		sb.append(6);
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.setCharAt(2, 'X');
		System.out.println(sb);
		
		String t = "teXting6";
		System.out.println(sb.equals(t));
		long end = System.nanoTime();
		
		System.out.println("Time taken: " +(end - start));
		System.out.println("Today's date: "+System.currentTimeMillis());

	}
}
	

	

