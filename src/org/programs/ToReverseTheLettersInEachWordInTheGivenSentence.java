package org.programs;

public class ToReverseTheLettersInEachWordInTheGivenSentence {
	
	//TO REVERSE THE LETTERS IN EACH WORD IN THE GIVEN SENTENCE

	public static void main(String[] args) {
		
		String s = "She Is Teaching Good";
		String[] spl = s.split(" ");
		String ne = "";
		
		for (int i = 0; i < spl.length; i++) {
			String str = spl[i];
			String rev ="";
			for (int j = str.length()-1; j >=0; j--) {
				char cat = str.charAt(j);
				rev=rev+cat;
			}
			ne=ne+rev+" ";
		}
		System.out.println(ne);

	}

}
