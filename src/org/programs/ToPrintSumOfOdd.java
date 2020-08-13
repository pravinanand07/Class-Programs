package org.programs;

public class ToPrintSumOfOdd {
	
	//TO PRINT SUM OFF ODD NO

	public static void main(String[] args) {
		
		int sum=0;
		 for (int i = 0; i <=50; i++) {
			if (i%2!=0) {
				sum=sum+i;
			}
		}
		 System.out.println(sum);
	}

}
