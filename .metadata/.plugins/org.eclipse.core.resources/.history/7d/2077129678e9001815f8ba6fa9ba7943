package harjoitukset;

import java.util.Scanner;

public class harj1_tapa3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		String input1;
		String input2;
		String temp;
		System.out.println("Anna merkkijono: ");
		input1 = userInput.next();
		System.out.println("Anna toinen merkkijono: ");
		input2 = userInput.next();
		if(input2.length() > input1.length()) {
			System.out.println("Virhe: Jälkimmäisen merkkijonon täytyy olla lyhyempi kuin ensimmäisen.");
		}
		
		for(int i = 0; i <= input1.length() - input2.length(); i++) {
			if(input2.equals(input1.substring(i, input2.length() - 1))) {
				System.out.println("Toimii");
			}
			
		}
	}
}
