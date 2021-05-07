package lab3;

import java.util.Arrays;

public class Q7 {

	public static void main(String[] args) {
		
		
		int[]x = {1,2,3};
		int[]y = {0,0};
		
		changeArray(x,y);
	}

	public static void changeArray(int[] x, int[] y) {
		
		y[0]=x[0];
		y[1]=x[x.length-1];
		
		System.out.println(Arrays.toString(y));
		
	}

}
