
package teststrings;

public class TestPalindromes {

	public static void main(String[] args) {
		
		int np = 1011;
		checkNumberForPalindrome(np);
		
		String s = "madam";
		checkStringPalindrome(s);

	}
	
	public static void checkNumberForPalindrome(int n) {
		int reversedNumber = 0;
		int originalNumber = n;
		
		while(n != 0) {
			int remainder = n % 10;
			reversedNumber = reversedNumber*10 + remainder;
			n = n/10;
		}
		System.out.println("Reversed number: "+reversedNumber);
		
		if(reversedNumber == originalNumber) {
			System.out.println(originalNumber+" is a palindrome!");
		}
		else {
			System.out.println(originalNumber + " is not a palindrome!");
		}
	}
	
	public static void checkStringPalindrome(String str) {
		String reversedString = "";
		
		for(int i=str.length()-1; i>=0;i--) {
			
			reversedString = reversedString + str.charAt(i);
			
		}
		System.out.println("Reversed string is: "+reversedString);
		
		if(reversedString.equalsIgnoreCase(str)) {
			System.out.println(str+" is a palindrome!");
		}
		else {
			System.out.println(str+" is NOT a palindrome!");
		}
	}

}
