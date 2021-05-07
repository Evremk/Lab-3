package lab3;

public class Q24 {
	
	public static void main (String []args) {
	
	
	int []x = {1,2,1,3};
	int num = 2;
	
	isEverywhere(x,num);
	
	
	}

		public static void isEverywhere(int[] x, int num) {
			int pairsNum=x.length/2;
			int countTrueFlags=0;
			boolean flag=false;
		
		for(int i=0; i<x.length-1;i+=2) {
			
			if(x[i]==num||x[i+1]==num) {
				
				countTrueFlags++;
				
			}
				
		}
		if(countTrueFlags==pairsNum) {
			flag=true;
		
	}
		System.out.println(flag);

}
	
}