package testPatterns;

public class TestPyramid {

	public static void main(String[] args) {
		int n = 9;
		drawPyramid(n);
		System.out.println("\n");
		drawDiamond(n);

	}
	
	public static void drawPyramid(int n) {
				
			for(int i=1;i<=n;i++) {
				
				for(int j=0;j<(n-i);j++) {
					System.out.print(" ");
				}
				for(int k=0;k<i*2-1;k++) {
					System.out.print("*");
				}
				System.out.println();
			}		

		}
	
	public static void drawDiamond(int n) {
		int mid = (n+1)/2;
		
		for(int i=1; i<= mid;i++) {
			
			for(int s=0; s < mid - i; s++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<i*2-1; j++) {
				System.out.print("*");
				
			}
			
			System.out.println();			
			
		}
		
		for(int i=1; i<= mid-1; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k<= 2*(mid-i)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
			
			
			
		}
	}
		
	}


