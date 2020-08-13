package org.programs;

public class ChangingTheFirstLetterOfTheWordToCapital {
	
	//CHANGING THE FIRST LETTER OF THE WORD TO CAPITAL

	public static void main(String[] args) {
		
		String s = "she is teachig good";
		String[] split = s.split(" ");
		String store = "";
		
		for (int i = 0; i < split.length; i++) {
			String sg = split[i];
			char charAt = sg.charAt(0);
			String substring = sg.substring(1);
			store=store+Character.toUpperCase(charAt)+substring+" ";
		}
		System.out.println(store);
	}

}
