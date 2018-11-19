package harjoitukset;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class harj1_tapa2 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String input1, input2;
		List tempList = new ArrayList();
		System.out.println("Anna merkkijono: ");
		input1 = userInput.next();
		System.out.println("Anna toinen merkkijono: ");
		input2 = userInput.next();
		if(input2.length() > input1.length()) {
			System.out.println("Virhe: Jälkimmäisen merkkijonon täytyy olla lyhyempi kuin ensimmäisen.");
		}
		for(int i = 0; i <= input1.length() - 1; i++) {
			for(int a = 0; a <= input2.length() - 1; i++) {
				if(input1.charAt(i) == input2.charAt(a)) {
					tempList.add(input1.charAt(i));
					continue;
				}
			}
		}
		String tempString = String.join(", ", tempList);
		if(tempString.equals(input2)) {
			System.out.println("Toimii");
		}
	}

}

// !!EI TOIMI!!