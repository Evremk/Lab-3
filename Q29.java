package lab3;

import java.util.Arrays;

public class Q29 {

	public static void main(String[] args) {
		
		int[]x= {2,10,3,4,20,5};
		int[]y= {10,1,20,2};
		
		multiple10(x);
		multiple10(y);

	}

	public static void multiple10(int[] x) {
		
		for(int i=0; i<x.length-1; i++) {
			
			if(x[i]%10==0) {
				
			while(x[i+1]%10!=0)	
				{x[i+1]=x[i];}
			}
		
		}
		System.out.println(Arrays.toString(x));
	}

}
