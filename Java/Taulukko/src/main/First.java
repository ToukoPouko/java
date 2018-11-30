package main;
import java.util.*;
import fi.jyu.mit.ohj2.Tiedosto;

public class First {

	public static void add() {
		ArrayList<String> list = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		while(true) {
			//ArrayList<> person = new ArrayList<String>();
			
			System.out.println("Anna nimi: ");
			String name = input.next();
			
			if(name.equals("!lopeta")) {
				Tiedosto.kirjoitaTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Taulukko\\src\\main\\data.txt", list, true);
				System.out.println("Kirjoittaminen onnistui.");
				break;
			}
			
			
			System.out.println("Anna ik�: ");
			Integer age = input.nextInt();
			String person = name + "," + age;
			list.add(person);
			
			
		}
		
	}
	
	public static void delete() {
		Scanner input = new Scanner(System.in);
		String[] lines = Tiedosto.lueTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Taulukko\\src\\main\\data.txt");
		ArrayList<String> newList = new ArrayList<>();
		newList.addAll(Arrays.asList(lines));
		
		System.out.println("Kirjoita nimi, jonka haluat poistaa: ");
		String name = input.next();
		System.out.println("Kirjoita ik�: ");
		Integer age = input.nextInt();
		try {
			newList.remove(name + "," + age);
		}
		catch(Exception e) {
			System.out.println("Henkil�� ei l�ydy listasta. ");
		}
		
		Tiedosto.kirjoitaTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Taulukko\\src\\main\\data.txt", newList, false);
	}
	
	
	public static void search() {
		Scanner input = new Scanner(System.in);
		String[] lines = Tiedosto.lueTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Taulukko\\src\\main\\data.txt");
		
		System.out.println("1. Nimen mukaan");
		System.out.println("2. I�n mukaan");
		switch(input.nextInt()) {
			case 1:
				System.out.println("Kirjoita nimi, jota haluat etsi�: ");
				String name = input.next();
				for(String line : lines) {
					if(line.split(",")[0].equals(name)) {
						System.out.println("L�ydettiin " + line);
					}
				}
				break;
			case 2:
				System.out.println("Kirjoita ik�, jota haluat etsi�: ");
				String age = input.next();
				for(String line : lines) {
					if(line.split(",")[1].equals(age)) {
						System.out.println("L�ydettiin " + line);
					}
				}
				break;
		}
		
	}
	
	
	public static void sorting() {
		Scanner input = new Scanner(System.in);
		String[] lines = Tiedosto.lueTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Taulukko\\src\\main\\data.txt");
		
		java.util.Collections.sort(Arrays.asList(lines));
		for(String s : lines) {
			System.out.println(s);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {	
			System.out.println("\n1. Lis�� henkil�it�");
			System.out.println("2. N�yt� henkil�t");
			System.out.println("3. Poista henkil�");
			System.out.println("4. Hae henkil��");
			System.out.println("5. J�rjest� taulukko");
			System.out.println("6. Tietoa listasta");
			
			Integer user = input.nextInt();
					
			switch(user) {
				case 1:
					add();
					break;
				case 2:
					System.out.println("-------------------------------");
					String[] lines = Tiedosto.lueTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Taulukko\\src\\main\\data.txt");
					for(String line : lines) {
						System.out.println(line);
					}
					System.out.println("-------------------------------");
					break;
				case 3:
					delete();
					break;
				case 4:
					search();
					break;
				case 5:
					sorting();
					break;
				case 6:
					String[] lines2 = Tiedosto.lueTiedosto("C:\\atk_vahakangas\\ohjelmointi\\Java\\Taulukko\\src\\main\\data.txt");
					System.out.println("Tiedostossa on t�ll� hetkell� " + lines2.length + " henkil��");
					break;
			}
		}
	}

}
