package lab3;

public class Q27 {

	public static void main(String[] args) {
		
		int[]x= {1,4,5,6,2};
		int[]y= {1,2,3};
		int[]z= {1,2,4,5,7,9,10};
		
		
		increasedNumbers(x);
		increasedNumbers(y);
		increasedNumbers(z);

	}

	public static void increasedNumbers(int[] x) {
			boolean flag=false;
			
		for(int i=0;i<x.length-2;i++) {
			
			if((x[i+1]-x[i])==1 && (x[i+2]-x[i+1])==1) {
				flag=true;
			}
		}
		System.out.println(flag);
	}

}
