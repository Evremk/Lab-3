package lab3;

public class Q3 {

	public static void main(String[] args) {
		
		int[]x = {1,2,3};
		int[]y = {1};
		
		checkArrays(x,y);

	}

	public static void checkArrays(int[] x, int[] y) {
		
		if(x.length<=1) {
			
			System.out.println("array 1 is not a valid array");
		
		}else if(y.length<=1) {
			System.out.println("array 2 is not a valid array");
			
		}else if(x[0]==y[0]||x[x.length-1]==y[y.length-1]) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
	}

}
