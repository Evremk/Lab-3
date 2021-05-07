package lab3;

public class Q18 {

	public static void main(String[] args) {
		
		int []x= {13,12,13,5,2};
		
		dontCount13(x);
		
	}

	public static void dontCount13(int[] x) {
		int sum=0;
		for(int i=0;i<x.length;i++) {
			
			if(x[i]==13) {
				++i;
			}else {
				sum=sum+x[i];
			}
			
		}
		System.out.println(sum);
	}

}
