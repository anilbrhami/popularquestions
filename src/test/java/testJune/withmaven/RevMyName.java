package testJune.withmaven;

import java.util.Scanner;

public class RevMyName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name: ");
		String s = sc.nextLine();
		
		revMyName(s);
		reverseWords(s);
		
		

	}

	public static String revMyName(String s) {
		String reversedName="";
		char[] arr = s.toCharArray();
		for (int i=arr.length-1; i>=0;i--) {
			reversedName = reversedName + arr[i];
			
		}
		System.out.println(reversedName);
		return reversedName;
		
	}
	
	public static String reverseWords(String s) {
		String reversedWords="";
		System.out.println("String to be reversed: "+s);
		String[] sarr= s.split("\\s");
		for(int i=sarr.length-1;i>=0;i--) {
			reversedWords=reversedWords+sarr[i]+" ";
		}
		System.out.println(reversedWords);		
		return reversedWords;
	}
}
