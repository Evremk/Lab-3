package lab3;

import java.util.Arrays;

public class Q15 {

	public static void main(String[] args) {
		
		int[]x= {8,1,2,3,4};
		
		swapFirstLast(x);
		
	}

	public static void swapFirstLast(int[] x) {
		
		int first= x[0];
		int last= x[x.length-1];
		
		x[0]= last;
		x[x.length-1]=first;
		
		System.out.println(Arrays.toString(x));
		
	}
		

}

