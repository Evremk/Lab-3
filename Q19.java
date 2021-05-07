package lab3;

public class Q19 {

	public static void main(String[] args) {
		
		int []x= {6,1,2,3,6,4,5,8,65,1000,2,7,8,8};
		
		ignore6(x);

	}

	public static void ignore6(int[] x) {
		int sum=0;
		
		for(int i=0;i<x.length;i++) {
		
		if(x[i]==6) {
			do {++i;}
			
			while(x[i]!=7);
		}else {
			sum=sum+x[i];
		}
		
	}
			System.out.println(sum);
}
}
