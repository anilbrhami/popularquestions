package teststrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {

			 
			 public static void main(String[] main) {
				 int N=6, M=24;
				 
				 solve(N,M);
			
			 }
			 
			 static int solve(int N, int M){
				  int cost = 0;
				  if(M/N < 2) {
					  return -1;
				  }
				  
				  else {
					  
					  for(int i=2; i<N/2; i++) {
						  if(N%2 == 0) {
							 int addThis = N/2;
							 cost = cost + addThis;
							 N = N+i;
						  }
						  
					  }
				  
				  }
				  
			 
			 System.out.println("This is the cost: "+cost);
			 return cost;
			 }
			 }