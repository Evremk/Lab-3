package lab3;

import java.util.Arrays;

public class Q30 {

	public static void main(String[] args) {
	
		
		int[]x= {1,2,3};
		int n=2;
		notAlone(x,n);
		
		int[]y= {1,2,3,2,5,2};
		notAlone(y,n);
		

	}

	public static void notAlone(int[] x, int n) {
		
		for(int i=1;i<x.length-1;i++) {
			
			if(x[i]==n && x[i-1]!=n && x[i+1]!=n) {
				
				if(x[i-1]>x[i+1]) {
					x[i]=x[i-1];
				}else {
					x[i]=x[i+1];
				}
			}
		}
		System.out.println(Arrays.toString(x));
	}

}
