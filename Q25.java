package lab3;

public class Q25 {

	public static void main(String[] args) {
		
		int []x= {1,2,3};
		int []y= {2,3,5};
		
		checkElements(x,y);
		

	}

	public static void checkElements(int[] x, int[] y) {
		
		int count= 0;
		
		for(int i=0;i<x.length;i++) {
			
			if((x[i]-y[i])<=2 && (x[i]-y[i])>0 || (y[i]-x[i])<=2 &&(y[i]-x[i])>0) {
				count++;
			}
			
		}
		
		System.out.println(count);
	}

}
