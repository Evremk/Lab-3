package lab3;

public class Q21 {

	public static void main(String[] args) {
	
		
		int[]x= {2,3,2,2,4,2,9};
		
		
		sumOf2(x);
	}

	public static void sumOf2(int[] x) {
		int sum=0;
		for(int i=0;i<x.length;i++) {
			
		if(x[i]==2) {
			sum=sum+x[i];
		}	
		
	}
		if(sum==8) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
}
	
}