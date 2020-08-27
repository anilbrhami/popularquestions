package teststrings;

public class ReverseStrings {

	public static void main(String[] args) {
		String s = "Just reverse the string completely.";
		System.out.println("Original String: "+s);
		reverseString(s);
		reverseWordsInString(s);
		reverseStringNotWords(s);
		
		int n = 1545;
		System.out.println("Original number: "+n);
		revereseANumber(n);
		
		

	}
	
	// Method for reversing a string completely
	public static void reverseString(String str) {
		String reversedStr = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			reversedStr = reversedStr + str.charAt(i);
		}
		
		System.out.println("Fully reversed string "+reversedStr);
		
	}
	
	
	public static void reverseWordsInString(String str) {
		String[] arr = str.split(" ");
		String reversedStr = "";
		
		for(int i=0; i<arr.length;i++) {
			String reversedWord = "";
			String word = arr[i];
			
			for(int j=word.length()-1; j>=0; j--) {
				reversedWord = reversedWord + word.charAt(j);
			}
			
			reversedStr = reversedStr + reversedWord + " ";
						
		}
		System.out.println("reversed words in the string: "+reversedStr);
	}
	
	
	public static void reverseStringNotWords(String str) {
		String[] arr = str.split(" ");
		String reversedStr = "";
		
		for(int i=arr.length-1;i>=0;i--) {
			reversedStr = reversedStr + arr[i]+ " ";
		}
		System.out.println("Reversed string not words: "+reversedStr);
		
	}
	
	public static void revereseANumber(int n) {
		
		int reversedNumber = 0;
		
		while(n != 0) {
			int remainder = n % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			n = n/10;
		}
		
		
		System.out.println("Reversed Number: "+reversedNumber);
		
	}
	
}
