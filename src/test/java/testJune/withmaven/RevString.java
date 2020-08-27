package testJune.withmaven;

public class RevString {

	public static void main(String[] args) {
		String s = "historical test of reversing";
		reverseWordsInAString(s);
		
		
	}


static void reverseString(String s) {
	String revString = "";
	char[] original = s.toCharArray();
	int strLen = original.length;
	
	
	for(int i=strLen-1;i>=0;i--) {
		revString = revString + original[i];
		}
	System.out.println("Reversed String is: "+revString);
	System.out.println("Original String is: "+s);
}

static void reverseWordsInAString(String s) {
	String[] arr = s.split(" ");
	String reversedString = "";
	
	for(int i=0; i<arr.length;i++) {
		String word = arr[i];
		String reversedWord = "";
		
		for(int j=arr[i].length()-1;j>=0;j--) {
			reversedWord = reversedWord+word.charAt(j);
			
		}
		reversedString = reversedString + reversedWord + " ";
		
	}
	System.out.println(reversedString);
}


}