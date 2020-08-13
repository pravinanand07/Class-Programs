package org.programs;

public class ToReverseAString {

	public static void main(String[] args) {

		String s = "CHENNAI";
		char[] ch = s.toCharArray();
		String reversed = "";
		int len = ch.length;
		for (int i = len - 1; i >= 0; i--) {
			reversed = reversed + ch[i];

		}
		System.out.println(reversed);
	}

}
