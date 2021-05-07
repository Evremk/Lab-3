package lab3;

public class Q10 {

	public static void main(String[] args) {
		
		int[]x= {2,2,2,3,3};
		checkIfTwice(x);

	}

	public static void checkIfTwice(int[] x) {
		int count2=0;
		int count3=0;
		for(int i = 0;i<x.length;i++) {
			if(x[i]==2) {
				count2++;
			}
			if(x[i]==3) {
				count3++;
			}
			
			
		}
		if(count2==2||count3==2) {
			System.out.println(true);
		}else System.out.println(false);
		
	}

}
