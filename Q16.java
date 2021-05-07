package lab3;

public class Q16 {

	public static void main(String[] args) {
		
		
		int [] x = {0,2,3,4,5,6,8}; 
		countEven(x);
	}

	public static void countEven(int[] x) {
		
		int count=0;
		
		for(int i=0; i<x.length;i++) {
			
			if(x[i]%2==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
