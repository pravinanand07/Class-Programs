package org.programs;

public class ToPrintTheNumbersInAscendingOrder {

	public static void main(String[] args) {
		int a[] = {120,50,21,72,30,81,11};
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i : a) {
			System.out.println(i);
		}
	}

}
