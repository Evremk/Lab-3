package lab3;

public class Q26 {

	public static void main(String[] args) {
		
		
		int[]x= {2,1,3,2,8,10};
		int[]y= {2,1,2,5};
		int[]z= {2,4,2,5};
		
		check3OddEven(x);
		check3OddEven(y);
		check3OddEven(z);
		
		
	}

	public static void check3OddEven(int[] x) {
		boolean flag=false;
		
		for(int i =0;i<x.length-2;i++) {
			
			if(x[i]%2==0 && x[i+1]%2 ==0 && x[i+2]%2==0) {
				flag=true;
				break;
			}else if (x[i]%2==1 && x[i+1]%2 ==1 && x[i+2]%2==1) {
				flag=true;
				break;
			}
		}
		System.out.println(flag);
	}

}
