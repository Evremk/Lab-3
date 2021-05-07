package lab3;

public class Q4 {

	public static void main(String[] args) {
		
		int[]x = {1,2,5};
		
		sumArray(x);

	}

	public static void sumArray(int[] x) {
		
		int sum = 0;
		
		for(int i=0;i<x.length;i++) {
			
			sum= sum+x[i];
		}
		System.out.println(sum);
	}

}
