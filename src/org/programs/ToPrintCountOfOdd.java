package org.programs;

public class ToPrintCountOfOdd {

	// TO PRINT COUNT OF ODD NO

	public static void main(String[] args) {

		int count = 0;

		for (int i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				count = count + 1;
			}
		}
		System.out.println(count);

	}

}
