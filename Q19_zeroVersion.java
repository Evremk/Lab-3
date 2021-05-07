package lab3;

import java.util.Arrays;

public class Q19_zeroVersion {

	public static void main(String[] args) {
		
		
				
				int []x= {1,3,1,1,1,2};
				
				ignore6(x);

			}

			public static void ignore6(int[] x) {
				
				int sum=0;
				
				for(int i=0;i<x.length;i++) {
					
					if(x[i]==6) {
						
						while(x[i]!=7) {
						
							x[i]=0;
							i++;
							
							
							
						}
					}else {
						sum=sum+x[i];
					}
				}
				System.out.println(sum);
				System.out.println(Arrays.toString(x));
			}
					
		}
	
