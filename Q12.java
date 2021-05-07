package lab3;

public class Q12 {

	public static void main(String[] args) {
		
		int []x = {2,3,4};
		int []y = {3,4};
		
		count1(x,y);
	}

	public static void count1(int[] x, int[] y) {
		int count=0;
		
		if(x[0]==1) {
			count++;
		}if (y[0]==1) {
			count++;
		}
		System.out.println(count);
		
	}

}
