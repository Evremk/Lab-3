package lab3;


public class Q2 {

	public static void main(String[] args) {
		
		int[]x= {1,2,3};
		int[]y= {1,2,3,1};
		int[]z= {1,2,1};
		int[]k= {1};
		
		
		checkArray(x);
		checkArray(y);
		checkArray(z);
		checkArray(k);
		

	}

	private static void checkArray(int[] arr) {
		if(arr.length<=1) {
			System.out.println("not a valid array");
		}else if(arr[0]==arr[arr.length-1]) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
