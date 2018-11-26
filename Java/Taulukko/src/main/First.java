package main;
import java.util.*;
import fi.jyu.mit.ohj2.Tiedosto;

public class First {

	public static void lisaa() {
		ArrayList<String> list = new ArrayList<String>();
		
		while(true) {
			//ArrayList<> person = new ArrayList<String>();
			Scanner input = new Scanner(System.in);
			System.out.println("Anna nimi: ");
			String name = input.next();
			
			if(name.equals("!lopeta")) {
				Tiedosto.kirjoitaTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Taulukko\\src\\main\\data.txt", list, true);
				System.out.println("Kirjoittaminen onnistui.");
				break;
			}
			
			
			System.out.println("Anna ikä: ");
			Integer age = input.nextInt();
			String person = name + "," + age;
			list.add(person);
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("\n1. Lisää henkilöitä");
		System.out.println("2. Näytä henkilöt");
		System.out.println("3. Poista henkilö");
		System.out.println("4. Hae henkilöä");
		
		Integer user = input.nextInt();
				
		switch(user) {
			case 1:
				lisaa();
				break;
			case 2:
				System.out.println("-------------------------------");
				String[] lines = Tiedosto.lueTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Taulukko\\src\\main\\data.txt");
				for(String line : lines) {
					System.out.println();
				}
				System.out.println("-------------------------------");
		}

	}

}
