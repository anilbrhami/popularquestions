package testJune.withmaven;

public class CompareFinals {

	public static void main(String[] args) {
		int a=15;
		int b=10;
		try {
		if(a>b) {
			System.out.println("a is greater");
		}
		
	}
		catch(Exception e) {
			System.out.println(e);
		}
	
		finally {
			System.out.println("Finally has been executed.");
		}
	

}
}

