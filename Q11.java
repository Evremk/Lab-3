package lab3;

import java.util.Arrays;

public class Q11 {

	public static void main(String[] args) {
		
		int []x = {1,2,3};
		
		checkif2and3(x);
	}

	public static void checkif2and3(int[] x) {
		
		for(int i=0; i<x.length;i++) {
			if(x[i]==2&&x[i+1]==3) {
				x[i+1]=0;
			}
		}
		System.out.println(Arrays.toString(x));
	}

}
