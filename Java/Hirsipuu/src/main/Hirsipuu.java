package main;
import fi.jyu.mit.ohj2.Syotto;
import fi.jyu.mit.ohj2.Tiedosto;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Hirsipuu {

    public static void tulostaLogo() {
        System.out.println("Hirsipuu-peli");
        System.out.println("=============");
        System.out.println();
    }
    
    
    public static StringBuilder luoTulosjono(String sana) {
        StringBuilder tulos =  new StringBuilder(sana);
        for (int i=0; i<tulos.length(); i++) {
            tulos.setCharAt(i,'_');
        } 
        return tulos;
    }

    
    public static String harvakseen(String jono) {
        StringBuilder tulos = new StringBuilder();
        String vali = "";
        for (int i=0; i<jono.length(); i++) {
            tulos.append(vali + jono.charAt(i));
            vali = " ";
        }
        return tulos.toString();
    }
    
    
    public static String harvakseen(StringBuilder jono) {
        return harvakseen(jono.toString());
    }
    
    
    public static int tutkiOikeat(String sana,char merkki, StringBuilder tulos) {
        int pituus = Math.min(sana.length(), tulos.length());
        int lkm = 0;
        for (int i=0; i<pituus; i++) {
            if ( merkki != sana.charAt(i) ) continue;
            if ( merkki == tulos.charAt(i)) continue;  
            lkm++;
            tulos.setCharAt(i,merkki);
        }
        
        return lkm;
    }
    
    public static String arvo(String[] lista) {
    	Random rand = new Random();
    	int n = rand.nextInt(lista.length);
    	return lista[n];
    }
    
    
    public static void lisaa() {
		boolean kopio = true;
		Scanner input = new Scanner(System.in);
		ArrayList<String> uudet_sanat = new ArrayList<>();
		String[] sanat = Tiedosto.lueTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Hirsipuu\\src\\main\\sanat.txt");
		
		while(true) {
			System.out.println("Kirjoita sana: (kirjoita !lopeta lopettaaksesi lis‰‰misen)");
			String sana = input.next();
			if(sana.equals("!lopeta")) {
				Tiedosto.kirjoitaTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Hirsipuu\\src\\main\\sanat.txt", uudet_sanat, true);
				System.out.println("Kirjoittaminen onnistui");
				break;
			}
			
			for(String s : sanat) {
				if(sana.equals(s)) {
					kopio = true;
					System.out.println("T‰m‰ sana on jo lis‰tty");
					break;
				}
				else {
					kopio = false;
				}
			}
			
			if(!kopio) {
				uudet_sanat.add(sana);
				System.out.println("Lis‰‰minen onnistui.");
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
			System.out.println("Sanaa ei lˆydetty listasta. ");
		}
		
		System.out.print("Poistaminen onnistui.");
		Tiedosto.kirjoitaTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Hirsipuu\\src\\main\\sanat.txt", sanalista, false);
	}
	
	public static void haku() {
		Scanner input = new Scanner(System.in);
		String[] sanat = Tiedosto.lueTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Hirsipuu\\src\\main\\sanat.txt");
		boolean find = false;
		
		System.out.println("Kirjoita sana, jonka haluat etsi‰: ");
		String sana = input.next();
		
		for(String s : sanat) {
			if(sana.equals(s)) {
				System.out.println("Sana " + sana + " lˆytyy listasta.");
				find = true;
				break;
			}
			else if(!sana.equals(s)) {
				find = false;
			}
		}
		
		if(!find) {
			System.out.print("Sanaa " + sana + " ei lˆytynyt listasta");
		}
		
		
	}
    
    
    public static void peli() {
    	final int MAXVAARIA = 6;
        String[] sanat = Tiedosto.lueTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Hirsipuu\\src\\main\\sanat.txt");
        String sana = "";
        
        
        if(sanat != null) sana = arvo(sanat);
        
        String vaaria = ""; // Sis‰lt‰‰ ne v‰‰r‰t arvaukset
        int oikeita = 0;
        StringBuilder tulos = luoTulosjono(sana);
        
        tulostaLogo();
        
        while ( true ) {
            System.out.println();
            System.out.println("Sana: "+harvakseen(tulos));
            String syote = Syotto.kysy("Anna kirjain");
            //T‰ss‰ pit‰isi tarkastaa, ettei k‰ytt‰j‰ paina pelkk‰‰ enteri‰.
            char c = syote.charAt(0);
            System.out.println("Annoit kirjaimen " + c);
            int lkm = tutkiOikeat(sana,c,tulos);
            if ( lkm == 0 ) {
                vaaria += c;
                System.out.printf("Virheit‰: %d/%d%n", vaaria.length(),MAXVAARIA);
                System.out.println("V‰‰ri‰ kirjaimia: " + harvakseen(vaaria));
                if ( vaaria.length() >= MAXVAARIA) {
                    System.out.println("H‰visit!");
                    break;
                }
            }
            oikeita += lkm; // ei haittaa virheenk‰‰n 
            if ( oikeita >= sana.length() ) {
                System.out.println("Voitit!");
                break;
            }  
            
        }

        System.out.println("Sana: " + sana);
    }

    
    
    
    public static void main(String[] args) {
    	boolean kopio = true;
		Scanner input = new Scanner(System.in);
		ArrayList<String> uudet_sanat = new ArrayList<>();
		
		
		while(true) {
			String[] sanat = Tiedosto.lueTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Hirsipuu\\src\\main\\sanat.txt");
			System.out.println("\n1. Pelaa");
			System.out.println("2. Lis‰‰ sanoja");
			System.out.println("3. N‰yt‰ sanat");
			System.out.println("4. Poista sana");
			System.out.println("5. Hae sanaa");
			int user = input.nextInt();
				
			switch(user) {
				case 1:
					peli();
					break;
				case 2:
					lisaa();
					break;
				case 3:
					System.out.println("--------------------------------------------");
					for(String sana : sanat) {
						System.out.println(sana);
					}
					System.out.println("--------------------------------------------");
					break;
				case 4:
					poista();
					break;
				case 5:
					haku();
					break;
			}
		}
    }
}