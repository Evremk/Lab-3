package lab3;

public class Q5 {

	public static void main(String[] args) {
		
		int[]x= {1,2,3};
		
		rotateLeft(x);
		

	}

	public static void rotateLeft(int[] x) {
		
		int last= x[0];
	//		x[x.length-1]=last;
		
		for(int i=0;i<=x.length-2;i++) {
			
			x[i]=x[i+1];
		}
		x[x.length-1]=last;
		for(int value:x) {
			System.out.print(value+" ");
		}
	}

}
