package lab3;

import java.util.Arrays;

public class Q23 {

	public static void main(String[] args) {
		
		
		fizzArray(10);
	}

	public static void fizzArray(int num) {
		
		int []x=new int [num];
		
		for(int i=0; i<num;i++) {
			
			x[i]=i;
			
		}
		
		System.out.println(Arrays.toString(x));
		
	}

}
