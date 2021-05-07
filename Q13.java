package lab3;

import java.util.Arrays;

public class Q13 {

	public static void main(String[] args) {
		
		int []x={1,4,50,2};
		int []y= {1,50,4,2};
		
		greaterSum(x,y);

	}

	public static void greaterSum(int[] x, int[] y) {
		int sumX=0;
		int sumY=0;
		
		for(int i=0;i<x.length;i++) {
			sumX= sumX+x[i];
			
		}
		
		for(int i=0;i<y.length;i++) {
			sumY= sumY+y[i];
		
		
	}
		if(sumY>sumX) {
			System.out.println(Arrays.toString(y));
		}else if(sumX>sumY) {
			System.out.println(Arrays.toString(x));
		}else {
			System.out.println("The arrays have the same sum.");
		}

}}
