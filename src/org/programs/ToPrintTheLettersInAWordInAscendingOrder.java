package org.programs;

import java.util.Arrays;

public class ToPrintTheLettersInAWordInAscendingOrder {

	public static void main(String[] args) {

		String s = "PRAVEENKUMAR";
		char[] ca = s.toCharArray();
		Arrays.sort(ca);
		String valueOf = String.valueOf(ca);
		System.out.println(valueOf); 

	}

}
