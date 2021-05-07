package lab3;

public class Q17 {

	public static void main(String[] args) {
		
		int []x = {10,9,3,1};
		
		showDifference(x);
		
	}

	public static void showDifference(int[] x) {
		
		int greatest= -999999999;
		int smallest= 999999999;
		
		for(int i=0;i<x.length;i++) {
			
			if(x[i]>greatest) {
				
				greatest=x[i];
			
			
		}}
		
		
		for(int i=0;i<x.length;i++) {
			
			if(x[i]<smallest) {
				
				smallest=x[i];
		
		
		}
	
		
	}
		
		System.out.println(greatest-smallest);
		
		
		
		
		
}
	
}

	