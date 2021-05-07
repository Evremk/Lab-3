package lab3;

public class Q22 {

	public static void main(String[] args) {
		
		int []x= {1,1,1,4,4};
		
		oneIsGreater(x);


	}

	public static void oneIsGreater(int[] x) {
		int count1=0;
		int count4=0;
		
	for(int i= 0,j=0;i<x.length&&j<x.length;i++,j++) {
			if(x[i]==1) {
				count1++;
			}
			if(x[j]==4) {
				count4++;
			}
		}
		if(count1>count4) {
			System.out.println(true);
		}else
			System.out.println(false);
	}

}
