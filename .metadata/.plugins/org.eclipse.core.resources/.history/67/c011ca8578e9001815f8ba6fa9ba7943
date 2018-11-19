package harjoitukset;

import harjoitukset.Olympialaiset;
import java.util.Scanner;

public class OlympiatietojenEtsija {

	public static void searchOne(int year, Olympialaiset[] taulukko) {
		int i = 0;
		boolean done = false;
		while(done == false) {
			if(taulukko[i].lue_vuosi() == year) {
				taulukko[i].tulosta_olympialaisten_tiedot();
				done = true;
			} else {
				i++;
			}
		}
	}
	
	public static void showAll(Olympialaiset[] taulukko) {
		if(taulukko != null) {
			for(Olympialaiset entry : taulukko) {
				System.out.println(entry.olympiavuosi);
		    }
		}		    
		
		
		/*for(int i = 0; i <= taulukko.length - 1; i++) {
			System.out.println(taulukko[i].olympiavuosi + ": " + taulukko[i].olympiakaupunki + ", " + taulukko[i].olympiamaa);
		}*/
	}
	
	public static void main(String[] args) {
		Olympialaiset[] kisataulukko = new Olympialaiset[40];
		
		kisataulukko[0] = new Olympialaiset(1896, "Ateena", "Kreikka");
		kisataulukko[1] = new Olympialaiset(1900, "Pariisi", "Ranska");
		kisataulukko[2] = new Olympialaiset(1904, "St. Louis", "U.S.A");
		kisataulukko[3] = new Olympialaiset(1908, "Ateena", "Kreikka");
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Anna vuosi: ");
		
		/*System.out.println("1. Hae vuoden perusteella");
		System.out.println("2. Näytä kaikki");*/
		
		int user_input = input.nextInt();
		
		switch(user_input) {
		case 1:
			searchOne(user_input, kisataulukko);
		case 2:
			showAll(kisataulukko);
	}
		
		/*int i = 0;
		boolean done = false;
		while(done == false) {
			if(kisataulukko[i].lue_vuosi() == user_input) {
				kisataulukko[i].tulosta_olympialaisten_tiedot();
				done = true;
			} else {
				i++;
			}
		}*/
		
		
		

	}

}
