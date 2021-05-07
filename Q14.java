package lab3;

import java.util.Arrays;

public class Q14 {

	public static void main(String[] args) {
		
		int []x= {1,2,3};
		int []y= {3,4,5};
		
		mergeArrays(x,y);
		
			
	}

	public static void mergeArrays(int[] x, int[] y) {
		
		int []z= new int [x.length+y.length];
		
		for(int i=0;i<x.length;i++) {
			z[i]=x[i];
		}
		
		for(int i=x.length,j=0;j<y.length&&j<y.length;i++,j++) {
			z[i]=y[j];
		}
		
		System.out.println(Arrays.toString(z));
	}

}
