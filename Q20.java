package lab3;

public class Q20 {

	public static void main(String[] args) {
		
		int [] x= {1,2,2,1,2};
		
		check22(x);
		
		
	}

	public static void check22(int[] x) {
		boolean flag=false;
		
		for(int i=0;i<x.length-1;i++) {
			
			
			
			if(x[i]==2 && x[i+1]==2) {
		
				flag=true;
				
			}
		
		
			
			}
		

		System.out.println(flag);
		
		
		
	}
}
