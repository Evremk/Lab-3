package lab3;

public class Q1 {

	public static void main(String[] args) {
	
		
		int []x= {6,2,5};
		lastAndFirst(x);

	}

	public static boolean lastAndFirst(int[] arr) {
		
		boolean flag= false;
		if(arr[arr.length-1]==6||arr[0]==6) {
			
			flag= true;
			
		}
		System.out.println(flag);
		return flag;
		}
		
		
	}


