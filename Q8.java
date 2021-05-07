package lab3;

public class Q8 {

	public static void main(String[] args) {
		
		
		//true if 2 or 3
		
		int[]x = {1,4,5,6,2};
		
		contains2or3(x);

	}

	public static void contains2or3(int[] x) {
		
		boolean flag = false;
		
		for(int i=0;i<x.length;i++) {
			if(x[i]==2||x[i]==3) {
				
				flag=true;
				break;
			}else {
				flag=false;
			}
		}
		
		System.out.println(flag);
	}

}
