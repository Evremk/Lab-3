package lab3;

import java.util.Arrays;

public class Q9 {

	public static void main(String[] args) {
		
		int []x = {4,5,6,7};
		
		changeArray(x);
		
		
		
	}

	private static void changeArray(int[] x) {
		
		int [] y = new int[x.length*2];
		y[y.length-1]= x [x.length-1];
		
		System.out.println(Arrays.toString(y));
		
	}

}
