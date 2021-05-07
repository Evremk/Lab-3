package lab3;

import java.util.Arrays;

public class Q28 {

	public static void main(String[] args) {
		
		
		buildArray(5,10);
		buildArray(11,18);
		buildArray(1,3);

	}

	public static void buildArray(int n1, int n2) {
		
		int []x= new int [n2-n1];
		x[0]=n1;
		
		for(int i=1;i<x.length;i++) {
			
			x[i]=x[i-1]+1;
			
		}
		
		System.out.println(Arrays.toString(x));
		
	}

}
