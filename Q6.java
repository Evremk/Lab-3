package lab3;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {
		
		int[]x= {5,2,70};
		
		greatestArray(x);
	}

	public static void greatestArray(int[] x) {
		
		int greatest=-999999999;
		
		for(int i = 0; i<x.length;i++) {
		if(x[i]>greatest) {
			greatest=x[i];
			        
		}
		}
		for(int i=0;i<x.length;i++) {
			x[i]=greatest;
		}
		
		System.out.println(Arrays.toString(x));

	}
	


}
