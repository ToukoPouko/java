package main;

import fi.jyu.mit.ohj2.Tiedosto;
import java.util.Scanner;
import java.util.*;


public class SanaLista {
	
	public static void lisaa() {
		boolean kopio = true;
		Scanner input = new Scanner(System.in);
		ArrayList<String> uudet_sanat = new ArrayList<>();
		String[] sanat = Tiedosto.lueTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Hirsipuu\\src\\main\\sanat.txt");
		
		while(true) {
			System.out.println("Kirjoita sana: (kirjoita !lopeta lopettaaksesi lisäämisen)");
			String sana = input.next();
			if(sana.equals("!lopeta")) {
				Tiedosto.kirjoitaTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Hirsipuu\\src\\main\\sanat.txt", uudet_sanat, true);
				System.out.println("Kirjoittaminen onnistui");
				break;
			}
			
			for(String s : sanat) {
				if(sana.equals(s)) {
					kopio = true;
					System.out.println("Tämä sana on jo lisätty");
					break;
				}
				else {
					kopio = false;
				}
			}
			
			if(!kopio) {
				uudet_sanat.add(sana);
				System.out.println("Lisääminen onnistui.");
				kopio = false;
			}
			
		}
	}
	
	public static void poista() {
		Scanner input = new Scanner(System.in);
		String[] sanat = Tiedosto.lueTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Hirsipuu\\src\\main\\sanat.txt");
		ArrayList<String> sanalista = new ArrayList<>();
		sanalista.addAll(Arrays.asList(sanat));
		
		System.out.println("Kirjoita sana, jonka haluat poistaa listasta: ");
		String sana = input.next();
		try {
			sanalista.remove(sana);
		}
		catch(Exception e) {
			System.out.println("Sanaa ei löydetty listasta. ");
		}
		
		System.out.print("Poistaminen onnistui.");
		Tiedosto.kirjoitaTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Hirsipuu\\src\\main\\sanat.txt", sanalista, false);
	}
	
	public static void haku() {
		Scanner input = new Scanner(System.in);
		String[] sanat = Tiedosto.lueTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Hirsipuu\\src\\main\\sanat.txt");
		boolean find = false;
		
		System.out.println("Kirjoita sana, jonka haluat etsiä: ");
		String sana = input.next();
		
		for(String s : sanat) {
			if(sana.equals(s)) {
				System.out.println("Sana " + sana + " löytyy listasta.");
				find = true;
				break;
			}
			else if(!sana.equals(s)) {
				find = false;
			}
		}
		
		if(!find) {
			System.out.print("Sanaa " + sana + " ei löytynyt listasta");
		}
		
		
	}
	
	
	public static void main(String[] args) {

		boolean kopio = true;
		Scanner input = new Scanner(System.in);
		ArrayList<String> uudet_sanat = new ArrayList<>();
		
		
		while(true) {
			String[] sanat = Tiedosto.lueTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Hirsipuu\\src\\main\\sanat.txt");
			System.out.println("\n1. Lisää sanoja");
			System.out.println("2. Näytä sanat");
			System.out.println("3. Poista sana");
			System.out.println("4. Hae sanaa");
			int user = input.nextInt();
				
			switch(user) {
				case 1:
					lisaa();
					break;
				case 2:
					System.out.println("--------------------------------------------");
					for(String sana : sanat) {
						System.out.println(sana);
					}
					System.out.println("--------------------------------------------");
					break;
				case 3:
					poista();
					break;
				case 4:
					haku();
					break;
			}
			
		}
		
		
	}

}
